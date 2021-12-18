import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class introControler implements Initializable {

    @FXML
    private AnchorPane ancherPane;

    @FXML
    private ProgressBar loadingbar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadingbar.setStyle("-fx-accent: Orange;");
        new SplashScreen().start();
    }

    class SplashScreen extends Thread{
        @Override
        public void run(){
            try {
                Thread.sleep(5000);

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Stage stage = new Stage();
                        stage.setTitle("WILL HERO");
                        Image icon = new Image("Image/icon.png");
                        stage.getIcons().add(icon);
                        stage.setResizable(false);
                        stage.setX(100);
                        stage.setY(0);
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();

                        ancherPane.getScene().getWindow().hide();
                    }
                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
