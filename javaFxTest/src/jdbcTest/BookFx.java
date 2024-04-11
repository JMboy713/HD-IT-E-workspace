package jdbcTest;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class BookFx extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = null;

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("JavaFXBookSearch.fxml"));
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


