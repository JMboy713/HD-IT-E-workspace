package jdbcTest;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import jdbcTest.dto.Book;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class BookSearchController implements Initializable {
    @FXML
    private TextField searchField;

    @FXML
    private TextArea resultArea;

    @FXML
    private Button searchBtn;

    private Connection con;

    public BookSearchController() {
        System.out.println("생성자");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&useUnicode=true", "root", "admin1234");
            System.out.println("연결완료");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 연결 실x패");
        } catch (SQLException e) {
            System.out.println("DB접속 실패");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize 호출");
        // 초기화 로직, 예를 들어 searchField에 기본 텍스트 설정
        searchBtn.setOnAction(event -> {
            onSearch();
        });

    }

    public void onSearch() {
        resultArea.clear(); // 이전 검색 결과 지우기
        String keyword = searchField.getText();

        // 데이터베이스에서 도서 정보 검색 - inparameter를 이용해서 preparedStatement를 생성.
        String query = "SELECT bisbn,btitle,bprice,bauthor FROM book WHERE btitle LIKE ?";

        try (PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                // 결과를 TextArea에 추가
                // String bookInfo = String.format("ISBN: %s, Title: %s, Author: %s\n",
                //        rs.getString("bisbn"), rs.getString("btitle"), rs.getString("bauthor


                String isbn = rs.getString("bisbn");
                String btitle= rs.getString("btitle");
                String bauthor= rs.getString("bauthor");
                int bprice = rs.getInt("bprice");
                Book book = new Book(isbn,btitle,bprice,bauthor);
                Platform.runLater(() -> {
                    resultArea.appendText(book.toString() + "\n");

                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultArea.appendText("Error fetching book data.");
        }
    }
}
