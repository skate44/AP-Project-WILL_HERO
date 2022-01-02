import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class RedOrc {

    private int currentHelmet;
    private int currentPosition;
    private float jumpLength=-100;
    //private boolean aliveOrDead();
    public Group grp;

    RedOrc(int cp){
        cp = currentPosition;
    }

    public void jump(ImageView img){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(img);
        translate.setDuration(Duration.millis(400));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setByY(jumpLength);
        translate.setAutoReverse(true);
        translate.play();
    }

    /*
    public void move(ImageView img){
        System.out.println("Moving Helmet");
        img.setX(currentPosition);
        currentPosition+=2;
    }
     */

    public void die(){}

    public void getHelmet(){}

}
