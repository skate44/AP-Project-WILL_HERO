import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("WILL HERO");
        stage.setScene(new Scene(root));
        stage.show();


        //Stage stage = new Stage();
        /*
        Group root = new Group();
        Button btn = new Button("Start Game");
        Scene scene = new Scene(btn, 200,250);
        Scene scene1 = new Scene(root, Color.LIGHTGREEN);

        //  Image icon = new Image("icon.png");
        //  stage.getIcons().add(icon);
        stage.setTitle("WILL HERO ");
        stage.setWidth(1480);
        stage.setHeight(828);
        stage.setResizable(false);
        stage.setX(0);
        stage.setY(0);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();

         */

    }



}
