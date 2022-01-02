import javafx.animation.Interpolator;
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
    private float jumpLength=-150;
    //private boolean aliveOrDead();
    public Group grp;

    Hero(int cp){
        cp = currentPosition;
    }

    public void jump(ImageView img){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(img);
        translate.setDuration(Duration.millis(700));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setByY(jumpLength);
        translate.setAutoReverse(true);
        translate.play();
    }

    public void move(ImageView img){
            System.out.println("Moving Helmet");
            img.setX(currentPosition);
            currentPosition+=2;
    }

    public void die(){}

    public void getHelmet(){}

}
