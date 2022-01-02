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
    private Text CurrentScore;

    @FXML
    private ImageView Tree1;

    @FXML
    private ImageView Tree2;

    @FXML
    private ImageView Tree3;

    @FXML
    private ImageView Tree4;

    @FXML
    private ImageView Island1;

    @FXML
    private ImageView Island2;

    @FXML
    private ImageView Island3;

    @FXML
    private ImageView Island4;

    @FXML
    private ImageView Island5;

    @FXML
    private ImageView Island6;

    @FXML
    private ImageView Island7;

    @FXML
    private ImageView Island8;

    @FXML
    private ImageView Island9;

    @FXML
    private ImageView Island10;

    @FXML
    private ImageView Island11;

    @FXML
    private ImageView Island12;

    @FXML
    private ImageView Island13;

    @FXML
    private ImageView Island14;

    @FXML
    private AnchorPane PlayAnchorPane;

    @FXML
    private ImageView firstOrc;

    @FXML
    private ImageView helmet;

    @FXML
    private ImageView topIsland;

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
            Animation();
            h.move(helmet);
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

        // Translate Section

        AnimationTimer collisionTimer = new AnimationTimer() { //https://youtu.be/TObnWGoukqc taken help from this
            @Override
            public void handle(long timestamp) {
                death(helmet,  firstOrc);
            }
        };
        collisionTimer.start();

    }

    public void Animation(){

        TranslateTransition tree1 = new TranslateTransition();
        tree1.setNode(Tree1);
        tree1.setAutoReverse(false);
        tree1.setDuration(Duration.millis(500));
        tree1.setByX(-100);
        tree1.setCycleCount(1);
        tree1.play();

        TranslateTransition tree2 = new TranslateTransition();
        tree2.setNode(Tree2);
        tree2.setAutoReverse(false);
        tree2.setDuration(Duration.millis(500));
        tree2.setByX(-100);
        tree2.setCycleCount(1);
        tree2.play();

        TranslateTransition tree3 = new TranslateTransition();
        tree3.setNode(Tree3);
        tree3.setAutoReverse(false);
        tree3.setDuration(Duration.millis(500));
        tree3.setByX(-100);
        tree3.setCycleCount(1);
        tree3.play();

        TranslateTransition tree4 = new TranslateTransition();
        tree4.setNode(Tree4);
        tree4.setAutoReverse(false);
        tree4.setDuration(Duration.millis(500));
        tree4.setByX(-100);
        tree4.setCycleCount(1);
        tree4.play();

        TranslateTransition island0 = new TranslateTransition();
        island0.setNode(topIsland);
        island0.setAutoReverse(false);
        island0.setDuration(Duration.millis(500));
        island0.setByX(-100);
        island0.setCycleCount(1);
        island0.play();

        TranslateTransition island1 = new TranslateTransition();
        island1.setNode(Island1);
        island1.setAutoReverse(false);
        island1.setDuration(Duration.millis(500));
        island1.setByX(-100);
        island1.setCycleCount(1);
        island1.play();

        TranslateTransition island2 = new TranslateTransition();
        island2.setNode(Island2);
        island2.setAutoReverse(false);
        island2.setDuration(Duration.millis(500));
        island2.setByX(-100);
        island2.setCycleCount(1);
        island2.play();

        TranslateTransition island3 = new TranslateTransition();
        island3.setNode(Island3);
        island3.setAutoReverse(false);
        island3.setDuration(Duration.millis(500));
        island3.setByX(-100);
        island3.setCycleCount(1);
        island3.play();

        TranslateTransition orc = new TranslateTransition();
        orc.setNode(firstOrc);
        orc.setAutoReverse(false);
        orc.setDuration(Duration.millis(500));
        orc.setByX(-100);
        orc.setCycleCount(1);
        orc.play();

        TranslateTransition island4 = new TranslateTransition();
        island4.setNode(Island4);
        island4.setAutoReverse(false);
        island4.setDuration(Duration.millis(500));
        island4.setByX(-100);
        island4.setCycleCount(1);
        island4.play();

        TranslateTransition island5 = new TranslateTransition();
        island5.setNode(Island5);
        island5.setAutoReverse(false);
        island5.setDuration(Duration.millis(500));
        island5.setByX(-100);
        island5.setCycleCount(1);
        island5.play();

        TranslateTransition island6 = new TranslateTransition();
        island6.setNode(Island6);
        island6.setAutoReverse(false);
        island6.setDuration(Duration.millis(500));
        island6.setByX(-100);
        island6.setCycleCount(1);
        island6.play();

        TranslateTransition island7 = new TranslateTransition();
        island7.setNode(Island7);
        island7.setAutoReverse(false);
        island7.setDuration(Duration.millis(500));
        island7.setByX(-100);
        island7.setCycleCount(1);
        island7.play();

        TranslateTransition island8 = new TranslateTransition();
        island8.setNode(Island8);
        island8.setAutoReverse(false);
        island8.setDuration(Duration.millis(500));
        island8.setByX(-100);
        island8.setCycleCount(1);
        island8.play();

        TranslateTransition island9 = new TranslateTransition();
        island9.setNode(Island9);
        island9.setAutoReverse(false);
        island9.setDuration(Duration.millis(500));
        island9.setByX(-100);
        island9.setCycleCount(1);
        island9.play();

        TranslateTransition island10 = new TranslateTransition();
        island10.setNode(Island10);
        island10.setAutoReverse(false);
        island10.setDuration(Duration.millis(500));
        island10.setByX(-100);
        island10.setCycleCount(1);
        island10.play();

        TranslateTransition island11 = new TranslateTransition();
        island11.setNode(Island11);
        island11.setAutoReverse(false);
        island11.setDuration(Duration.millis(500));
        island11.setByX(-100);
        island11.setCycleCount(1);
        island11.play();

        TranslateTransition island12 = new TranslateTransition();
        island12.setNode(Island12);
        island12.setAutoReverse(false);
        island12.setDuration(Duration.millis(500));
        island12.setByX(-100);
        island12.setCycleCount(1);
        island12.play();

    }


}
