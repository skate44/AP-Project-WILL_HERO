import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class introControler implements Initializable {

    @FXML
    private ProgressBar loadingbar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadingbar.setStyle("-fx-accent: Green;");
    }
}
