// Developed By Rahul
// 2020107
// CSE

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.nio.file.Paths;


public class Main extends Application {

    // BackGround Colour - #a2f0ff

    @Override
    public void start(Stage primarystage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
        primarystage.setTitle("WILL HERO");
        Image icon = new Image("Image/icon.png");
        primarystage.getIcons().add(icon);
        primarystage.setResizable(false);
        primarystage.setX(100);
        primarystage.setY(0);
        Scene scene = new Scene(root);
        primarystage.setScene(scene);
        primarystage.show();

        String file = "Background.mp3";
        Media media = new Media(Paths.get(file).toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        primarystage.show();

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

// References
/*
1. https://youtu.be/TObnWGoukqc
2. https://youtu.be/lj_jTWshUbM
3. w3school
4. GFG
 */