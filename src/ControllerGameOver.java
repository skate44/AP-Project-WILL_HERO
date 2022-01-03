import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGameOver implements Initializable {

    @FXML
    private AnchorPane pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new SplashScreen1().start();
    }

    class SplashScreen1 extends Thread{
        @Override
        public void run(){
            try {
                Thread.sleep(2000);
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        AnchorPane panex = null;
                        try {
                            panex = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        pane.getChildren().setAll(panex);
                        //pane.getScene().getWindow().hide();
                    }
                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
