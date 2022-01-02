import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGamePlay implements Initializable {

    @FXML
    private AnchorPane PlayAnchorPane;

    @FXML
    private Text CurrentScore;

    @FXML
    private ImageView firstOrc;

    @FXML
    private ImageView HboxIsland;

    @FXML
    private ImageView helmet;

    @FXML
    private ImageView topIsland;

    @FXML
    private ImageView ImageIsland1;

    @FXML
    private ImageView ImageIsland2;

    int initialScore =0;

    Hero h = new Hero(324);
    Islands i = new Islands(324);

    @FXML
    void PauseGame(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("PausePlayMenu.fxml"));
        PlayAnchorPane.getChildren().setAll(pane);
    }

    @FXML
    void moveit(KeyEvent event){
        if(event.getCode() == KeyCode.A){
            // Timeline Section where Currentscore
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),e ->{
                initialScore++;
                CurrentScore.setText(String.valueOf(initialScore));
            }));
            timeline.play();
            // Timeline Section Ends Here
            System.out.println("A Pressed !!");
            h.move(helmet);
            // To move the Islands around
            i.move(topIsland);
            i.move(ImageIsland1);
            i.move(ImageIsland2);
            i.move(HboxIsland);
        }
    }
    public void death(ImageView helmet, ImageView firstOrc){
        if (helmet.getBoundsInParent().intersects(firstOrc.getBoundsInParent())) {
            System.out.println("boom");}
        /*if (Hero.getBoundsInParent().intersects(bossorcpane.getBoundsInParent())) {
            System.out.println("boom bosorc");}
        if (Hero.getBoundsInParent().intersects(tnt1.getBoundsInParent())) {
            System.out.println("bomb1");}

         */
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        h.jump(helmet);
        h.jump(firstOrc);
        Image image = new Image(getClass().getResourceAsStream("/Image/Islands/Islands11.png"));
        Image image1 = new Image(getClass().getResourceAsStream("/Image/Islands/Islands1.png"));
        Image image2 = new Image(getClass().getResourceAsStream("/Image/Islands/Islands5.png"));
        topIsland.setImage(image);
        ImageIsland1.setImage(image1);
        ImageIsland2.setImage(image2);
        // Translate Section

        AnimationTimer collisionTimer = new AnimationTimer() { //https://youtu.be/TObnWGoukqc taken help from this
            @Override
            public void handle(long timestamp) {
                death(helmet,  firstOrc);
            }
        };
        collisionTimer.start();

    }






}
