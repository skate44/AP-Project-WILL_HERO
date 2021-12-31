import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGamePlay implements Initializable {

    @FXML
    private AnchorPane PlayAnchorPane;

    @FXML
    private ImageView topIsland;

    @FXML
    private ImageView helmet;

    @FXML
    private ImageView ImageIsland1;

    @FXML
    private ImageView ImageIsland2;

    @FXML
    void PauseGame(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("PausePlayMenu.fxml"));
        PlayAnchorPane.getChildren().setAll(pane);
    }

    @FXML
    void moveit(KeyEvent event){
        Hero h = new Hero();
        if(event.getCode() == KeyCode.A){
            System.out.println("A Pressed !!");
            h.move(helmet);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Hero h = new Hero();
        h.jump(helmet);




        Image image = new Image(getClass().getResourceAsStream("/Image/Islands/Islands11.png"));
        Image image1 = new Image(getClass().getResourceAsStream("/Image/Islands/Islands1.png"));
        Image image2 = new Image(getClass().getResourceAsStream("/Image/Islands/Islands5.png"));
        topIsland.setImage(image);
        ImageIsland1.setImage(image1);
        ImageIsland2.setImage(image2);

        // Translate Section




    }



}
