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
    private Text CurrentCoinScore;

    @FXML
    private ImageView gOrc1;

    @FXML
    private ImageView gOrc2;
    
    @FXML
    private ImageView gOrc3;
    
    @FXML
    private ImageView rOrc1;

    @FXML
    private ImageView rOrc2;

    @FXML
    private ImageView rOrc3;

    @FXML
    private ImageView Tree1;

    @FXML
    private ImageView Tree2;

    @FXML
    private ImageView Tree3;

    @FXML
    private ImageView Tree4;

    @FXML
    private ImageView Tree5;

    @FXML
    private ImageView Tree6;

    @FXML
    private ImageView Tree7;

    @FXML
    private ImageView Tree8;

    @FXML
    private ImageView Tree9;

    @FXML
    private ImageView Tree10;

    @FXML
    private ImageView Tree11;

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
    private ImageView Island15;

    @FXML
    private ImageView Island16;

    @FXML
    private ImageView Island17;

    @FXML
    private ImageView Island18;

    @FXML
    private ImageView coin1;

    @FXML
    private ImageView coin2;

    @FXML
    private ImageView coin3;

    @FXML
    private ImageView coin4;

    @FXML
    private ImageView coin5;

    @FXML
    private ImageView coin6;

    @FXML
    private ImageView coin7;

    @FXML
    private ImageView coin8;

    @FXML
    private ImageView coin9;

    @FXML
    private ImageView coin10;
    
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
    GreenOrc go = new GreenOrc(324);
    RedOrc ro = new RedOrc(324);

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

    public void OrcCollision(ImageView helmet, ImageView img){
        if (helmet.getBoundsInParent().intersects(img.getBoundsInParent())) {
            System.out.println("boom");}
        /*if (helmet.getBoundsInParent().intersects(img.getBoundsInParent())) {
            System.out.println("boom bosorc");}
        if (Hero.getBoundsInParent().intersects(tnt1.getBoundsInParent())) {
            System.out.println("bomb1");}

         */
    }

    public void CoinCollision(ImageView helmet, ImageView img){
        if (helmet.getBoundsInParent().intersects(img.getBoundsInParent())) {
            System.out.println("Coin Collision");}
        /*if (Hero.getBoundsInParent().intersects(tnt1.getBoundsInParent())) {
            System.out.println("bomb1");}

         */
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Jumping
        h.jump(helmet);
        go.jump(firstOrc);
        go.jump(gOrc1);
        go.jump(gOrc2);
        go.jump(gOrc3);
        ro.jump(rOrc1);
        ro.jump(rOrc2);
        ro.jump(rOrc3);


        // Translate Section

        AnimationTimer collisionTimer = new AnimationTimer() { //https://youtu.be/TObnWGoukqc taken help from this
            @Override
            public void handle(long timestamp) {
                OrcCollision(helmet, firstOrc);
                OrcCollision(helmet, gOrc1);
                OrcCollision(helmet, gOrc2);
                OrcCollision(helmet, gOrc3);
                OrcCollision(helmet, rOrc1);
                OrcCollision(helmet, rOrc2);
                OrcCollision(helmet, rOrc3);
                CoinCollision(helmet, coin1);
                CoinCollision(helmet, coin2);
                CoinCollision(helmet, coin3);
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

        TranslateTransition tree5 = new TranslateTransition();
        tree5.setNode(Tree5);
        tree5.setAutoReverse(false);
        tree5.setDuration(Duration.millis(500));
        tree5.setByX(-100);
        tree5.setCycleCount(1);
        tree5.play();

        TranslateTransition tree6 = new TranslateTransition();
        tree6.setNode(Tree6);
        tree6.setAutoReverse(false);
        tree6.setDuration(Duration.millis(500));
        tree6.setByX(-100);
        tree6.setCycleCount(1);
        tree6.play();

        TranslateTransition tree7 = new TranslateTransition();
        tree7.setNode(Tree7);
        tree7.setAutoReverse(false);
        tree7.setDuration(Duration.millis(500));
        tree7.setByX(-100);
        tree7.setCycleCount(1);
        tree7.play();

        TranslateTransition tree8 = new TranslateTransition();
        tree8.setNode(Tree8);
        tree8.setAutoReverse(false);
        tree8.setDuration(Duration.millis(500));
        tree8.setByX(-100);
        tree8.setCycleCount(1);
        tree8.play();

        TranslateTransition tree9 = new TranslateTransition();
        tree9.setNode(Tree9);
        tree9.setAutoReverse(false);
        tree9.setDuration(Duration.millis(500));
        tree9.setByX(-100);
        tree9.setCycleCount(1);
        tree9.play();

        TranslateTransition tree10 = new TranslateTransition();
        tree10.setNode(Tree10);
        tree10.setAutoReverse(false);
        tree10.setDuration(Duration.millis(500));
        tree10.setByX(-100);
        tree10.setCycleCount(1);
        tree10.play();

        TranslateTransition tree11 = new TranslateTransition();
        tree11.setNode(Tree11);
        tree11.setAutoReverse(false);
        tree11.setDuration(Duration.millis(500));
        tree11.setByX(-100);
        tree11.setCycleCount(1);
        tree11.play();

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

        TranslateTransition orc1 = new TranslateTransition();
        orc1.setNode(gOrc1);
        orc1.setAutoReverse(false);
        orc1.setDuration(Duration.millis(500));
        orc1.setByX(-100);
        orc1.setCycleCount(1);
        orc1.play();

        TranslateTransition orc2 = new TranslateTransition();
        orc2.setNode(gOrc2);
        orc2.setAutoReverse(false);
        orc2.setDuration(Duration.millis(500));
        orc2.setByX(-100);
        orc2.setCycleCount(1);
        orc2.play();
        
        TranslateTransition orc3 = new TranslateTransition();
        orc3.setNode(rOrc1);
        orc3.setAutoReverse(false);
        orc3.setDuration(Duration.millis(500));
        orc3.setByX(-100);
        orc3.setCycleCount(1);
        orc3.play();

        TranslateTransition orc4 = new TranslateTransition();
        orc4.setNode(rOrc2);
        orc4.setAutoReverse(false);
        orc4.setDuration(Duration.millis(500));
        orc4.setByX(-100);
        orc4.setCycleCount(1);
        orc4.play();

        TranslateTransition orc5 = new TranslateTransition();
        orc5.setNode(rOrc3);
        orc5.setAutoReverse(false);
        orc5.setDuration(Duration.millis(500));
        orc5.setByX(-100);
        orc5.setCycleCount(1);
        orc5.play();

        TranslateTransition orc6 = new TranslateTransition();
        orc6.setNode(gOrc3);
        orc6.setAutoReverse(false);
        orc6.setDuration(Duration.millis(500));
        orc6.setByX(-100);
        orc6.setCycleCount(1);
        orc6.play();

        TranslateTransition Coin1 = new TranslateTransition();
        Coin1.setNode(coin1);
        Coin1.setAutoReverse(false);
        Coin1.setDuration(Duration.millis(500));
        Coin1.setByX(-100);
        Coin1.setCycleCount(1);
        Coin1.play();

        TranslateTransition Coin2 = new TranslateTransition();
        Coin2.setNode(coin2);
        Coin2.setAutoReverse(false);
        Coin2.setDuration(Duration.millis(500));
        Coin2.setByX(-100);
        Coin2.setCycleCount(1);
        Coin2.play();

        TranslateTransition Coin3 = new TranslateTransition();
        Coin3.setNode(coin3);
        Coin3.setAutoReverse(false);
        Coin3.setDuration(Duration.millis(500));
        Coin3.setByX(-100);
        Coin3.setCycleCount(1);
        Coin3.play();

        TranslateTransition Coin4 = new TranslateTransition();
        Coin4.setNode(coin4);
        Coin4.setAutoReverse(false);
        Coin4.setDuration(Duration.millis(500));
        Coin4.setByX(-100);
        Coin4.setCycleCount(1);
        Coin4.play();

        TranslateTransition Coin5 = new TranslateTransition();
        Coin5.setNode(coin5);
        Coin5.setAutoReverse(false);
        Coin5.setDuration(Duration.millis(500));
        Coin5.setByX(-100);
        Coin5.setCycleCount(1);
        Coin5.play();

        TranslateTransition Coin6 = new TranslateTransition();
        Coin6.setNode(coin6);
        Coin6.setAutoReverse(false);
        Coin6.setDuration(Duration.millis(500));
        Coin6.setByX(-100);
        Coin6.setCycleCount(1);
        Coin6.play();

        TranslateTransition Coin7 = new TranslateTransition();
        Coin7.setNode(coin7);
        Coin7.setAutoReverse(false);
        Coin7.setDuration(Duration.millis(500));
        Coin7.setByX(-100);
        Coin7.setCycleCount(1);
        Coin7.play();

        TranslateTransition Coin8 = new TranslateTransition();
        Coin8.setNode(coin8);
        Coin8.setAutoReverse(false);
        Coin8.setDuration(Duration.millis(500));
        Coin8.setByX(-100);
        Coin8.setCycleCount(1);
        Coin8.play();

        TranslateTransition Coin9 = new TranslateTransition();
        Coin9.setNode(coin9);
        Coin9.setAutoReverse(false);
        Coin9.setDuration(Duration.millis(500));
        Coin9.setByX(-100);
        Coin9.setCycleCount(1);
        Coin9.play();

        TranslateTransition Coin10 = new TranslateTransition();
        Coin10.setNode(coin10);
        Coin10.setAutoReverse(false);
        Coin10.setDuration(Duration.millis(500));
        Coin10.setByX(-100);
        Coin10.setCycleCount(1);
        Coin10.play();

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

        TranslateTransition island13 = new TranslateTransition();
        island13.setNode(Island13);
        island13.setAutoReverse(false);
        island13.setDuration(Duration.millis(500));
        island13.setByX(-100);
        island13.setCycleCount(1);
        island13.play();

        TranslateTransition island14 = new TranslateTransition();
        island14.setNode(Island14);
        island14.setAutoReverse(false);
        island14.setDuration(Duration.millis(500));
        island14.setByX(-100);
        island14.setCycleCount(1);
        island14.play();

        TranslateTransition island15 = new TranslateTransition();
        island15.setNode(Island15);
        island15.setAutoReverse(false);
        island15.setDuration(Duration.millis(500));
        island15.setByX(-100);
        island15.setCycleCount(1);
        island15.play();

        TranslateTransition island16 = new TranslateTransition();
        island16.setNode(Island16);
        island16.setAutoReverse(false);
        island16.setDuration(Duration.millis(500));
        island16.setByX(-100);
        island16.setCycleCount(1);
        island16.play();

        TranslateTransition island17 = new TranslateTransition();
        island17.setNode(Island17);
        island17.setAutoReverse(false);
        island17.setDuration(Duration.millis(500));
        island17.setByX(-100);
        island17.setCycleCount(1);
        island17.play();

        TranslateTransition island18 = new TranslateTransition();
        island18.setNode(Island18);
        island18.setAutoReverse(false);
        island18.setDuration(Duration.millis(500));
        island18.setByX(-100);
        island18.setCycleCount(1);
        island18.play();

    }


}
