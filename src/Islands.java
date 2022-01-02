import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Islands {

    private int currentPosition;

    Islands(int cp){
        cp = currentPosition;
    }

    public void islandLength(){}

    public void islandObject(){}

    public void collision(){}

    public void move(ImageView img){
        System.out.println("Moving Helmet");
        img.setX(currentPosition);
        currentPosition-=10;
    }

    public void movep(HBox hBox){
        System.out.println("Moving Helmet");
        // hBox
        currentPosition-=10;
    }

}
