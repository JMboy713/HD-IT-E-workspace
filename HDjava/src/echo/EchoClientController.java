package echo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class EchoClientController implements Initializable {
    @FXML
    private TextField userID;
    @FXML
    private TextField userMsg;
    @FXML
    private Button sendMsg;
    @FXML
    private Button closeBtn;
    @FXML
    private TextArea messageBox;

    private Socket s;
    private BufferedReader br;
    private PrintWriter pw;

    String receiveMsg = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 서버 접속하는 코드가 나오면 된다.
        try {
            Socket s = new Socket("Localhost", 8000);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw = new PrintWriter(s.getOutputStream());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("소켓 접속 불가. client");
        }
        sendMsg.setOnAction(event -> {
            String msg = userID.getText() + " : " + userMsg.getText();
            pw.println(msg);
            pw.flush();
            try {
                receiveMsg = br.readLine();
            } catch (IOException e) {

            }
            Platform.runLater(() -> messageBox.appendText(receiveMsg));

        });
    }

}
