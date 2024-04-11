package echo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EchoServer extends Application {
    @Override //화면 구성
    public void start(Stage primaryStage) throws Exception {
        // 화면 구성
        // 이미 Scene Builder를 이용해서 화면 구성에 대한 fxml을 만들어 놓았음
        // 해당 파일을 이용해 pane을 가져와서 scene을 만들고, stage에 붙여서 사용하면 된다.
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("echoServer.fxml"));
        try {
            root = loader.load();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }


}
