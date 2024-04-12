package jdbcTest;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import jdbcTest.dto.Book;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class BookSearchTableController implements Initializable {
    @FXML
    private TextField searchField;
    @FXML
    private TableView<Book> resultArea;
    @FXML
    private TableColumn<Book, String> isbnColumn;
    @FXML
    private TableColumn<Book, String> titleColumn;
    @FXML
    private TableColumn<Book, Integer> priceColumn;
    @FXML
    private TableColumn<Book, String> authorColumn;
    @FXML
    private Button searchBtn;  // Ensure this button is properly referenced from FXML

    private ObservableList<Book> books = FXCollections.observableArrayList();
    private Connection con;

    public BookSearchTableController() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&useUnicode=true", "root", "admin1234");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));


        searchBtn.setOnAction(event -> onSearch());
    }

    public void onSearch() {
        books.clear();  // 이전 검색 결과 지우기
        String keyword = searchField.getText().trim();

        String query = "SELECT bisbn, btitle, bprice, bauthor FROM book WHERE btitle LIKE ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String isbn = rs.getString("bisbn");
                String title = rs.getString("btitle");
                int price = rs.getInt("bprice");
                String author = rs.getString("bauthor");

                Book book = new Book(isbn, title, price, author);
                books.add(book);
            }
            resultArea.setItems(books);
        } catch (SQLException e) {
            e.printStackTrace();
            Platform.runLater(() -> {
                // 오류 메시지를 적절히 표시
            });
        }
    }
}
