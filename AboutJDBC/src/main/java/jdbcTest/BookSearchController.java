package jdbcTest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class BookSearchController implements Initializable {
    @FXML
    private TextField searchField;

    @FXML
    private TextArea resultArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 초기화 로직, 예를 들어 searchField에 기본 텍스트 설정
        searchField.setPromptText("Enter book title...");
    }

    public void onSearch() {
        resultArea.clear(); // 이전 검색 결과 지우기
        String keyword = searchField.getText();

        // 데이터베이스에서 도서 정보 검색
        String query = "SELECT * FROM books WHERE btitle LIKE %keyworkd%";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&useUnicode=true", "root", "admin1234");
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                // 결과를 TextArea에 추가
                String bookInfo = String.format("ISBN: %s, Title: %s, Author: %s\n",
                        rs.getString("bisbn"), rs.getString("btitle"), rs.getString("bauthor"));
                resultArea.appendText(bookInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultArea.appendText("Error fetching book data.");
        }
    }
}
