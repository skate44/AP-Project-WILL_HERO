import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMainMenu implements Initializable {

    @FXML
    private AnchorPane MenuScenePane;

    @FXML
    private Button exitButton;

    @FXML
    private ImageView imageView;

    Stage stage;

    @FXML
    void LetsPlay(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("GamePlay.fxml"));
        MenuScenePane.getChildren().setAll(pane);
    }

    @FXML
    void ViewScoreBoard(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("ViewScore.fxml"));
        MenuScenePane.getChildren().setAll(pane);
    }

    @FXML
    public void exit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("Do you want to Exit!");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) MenuScenePane.getScene().getWindow();
            System.out.println("You successfully logged out!!");
            stage.close();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("/Image/ForMenu.png"));
        imageView.setImage(image);

    }
}
