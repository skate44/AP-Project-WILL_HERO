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

public class ControllerGamePlay implements Initializable {

    @FXML
    private AnchorPane PlayAnchorPane;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("/Image/set.PNG"));
        imageView.setImage(image);
    }

    @FXML
    void PauseGame(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("PausePlayMenu.fxml"));
        PlayAnchorPane.getChildren().setAll(pane);
    }

}
