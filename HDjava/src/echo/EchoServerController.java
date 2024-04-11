package echo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

class MyRunnable implements Runnable {
    private Socket s;
    private BufferedReader br;
    private PrintWriter pw;


    public MyRunnable(Socket s) throws IOException {
        this.s = s;
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        pw = new PrintWriter(s.getOutputStream());
    }

    @Override
    public void run() {
        // server쪽 소켓이 동작하는 방식을 여기에 작성.
        // Client가 msg를 주는것을 기다렸다가, msg를 주면 바로 다시 client에게 전달하는 작업을 반복.
        String msg = null;
        while (true) {
            try {
                msg = br.readLine(); // 데이터가 들어올때 까지 멈춰있다.

            } catch (IOException e) {
                System.out.println("소켓");
            }
            pw.println(msg);
            pw.flush();
        }

    }
}

public class EchoServerController implements Initializable {
    @FXML
    private Button startBtn;

    @FXML
    private TextArea messageBox;

    private void printMsg(String msg) {
        Platform.runLater(() -> {
            messageBox.appendText(msg+"\n"); // 별도의 Thread를 이용해서 처리

        });
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 화면 이벤트에 대한 처리 코드를 작성.
        // 이벤트 등록
        startBtn.setOnAction(event -> {
            // 버튼 클릭되면, 처리해야 하는 코드를 여기에 넣음.
//            System.out.println("서버가 시작되었음.");

        // 이제 서버를 기동시키는 코드가 나와야함.
        // 서버소켓이 필요. 없다면 클라이언트 소켓이 접속할 수 없다.
            try {
                ServerSocket server = new ServerSocket(8000); // 리소스를 잡고 있는 것들은 로컬로 할지, 필드로 할지 고민해봐야 함
                // accept에 의해서 thread가 block됨.
                // 지금 같은 경우 화면 UI Thread가 block됨. 화면을 사용할 수 없음.
                // 별도의 thread로 만들어서 사용해야함.
                (new Thread(() -> {
                    try {
                        printMsg("서버가 시작");
                        while (true) {
                            Socket s = server.accept();
                            // 이렇게 만들어진 클라이언트가 접속해서, 만들어진 socket을 이용해서
                            // 통신처리를 담당하는 Thread를 만들어서 실행해야 된다.
                            MyRunnable r = new MyRunnable(s);
                            Thread t = new Thread(r);
                            t.start();

                        }
                        // 이 accept가 여러개 와야함
                    } catch (IOException e) {
                        System.out.println("소켓 불가");
                    }
                })).start();
//                Socket s = server.accept(); // 서버소켓으로 부터 소켓을 뽑아냄.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        });// 버튼 누를 시


    }
}
