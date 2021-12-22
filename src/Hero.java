import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.Collection;

public class Hero {

    private int currentHelmet;
    private int currentPosition;
    private float jumpLength=20;
    //private boolean aliveOrDead();
    public Group grp;

    public void jump(ImageView img){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(img);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByY(-200);
        translate.setAutoReverse(true);
        translate.play();
    }

    public void move(){}

    public void die(){}

    public void getHelmet(){}

}
