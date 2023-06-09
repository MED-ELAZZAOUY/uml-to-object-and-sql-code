package controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AttributController implements Initializable {

    @FXML
    private FontAwesomeIcon btnClose;

    @FXML
    private void handleClose(MouseEvent event){
        if (event.getSource() == btnClose){
            System.exit(0);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
