import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
        primarystage.setTitle("WILL HERO");
        primarystage.setResizable(false);
        primarystage.setX(100);
        primarystage.setY(0);
        Scene scene = new Scene(root);
        primarystage.setScene(scene);
        primarystage.show();


        //stage.setScene(new Scene(root));
        //stage.show();

        //Group root = new Group();

        //  Image icon = new Image("icon.png");
        //  stage.getIcons().add(icon);
        /*
        stage.setTitle("WILL HERO ");
        stage.setWidth(1480);
        stage.setHeight(828);
        stage.setResizable(false);
        stage.setX(0);
        stage.setY(0);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Esc"));
         */



    }

    public static void main(String[] args) {
        launch(args);
    }

}
