package controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.Method;
import utils.Utils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MethodController implements Initializable {

    @FXML
    private FontAwesomeIcon btnClose;

    @FXML
    private FontAwesomeIcon btnNext;

    @FXML
    private Button btnAddAttribut;

    @FXML
    private Button btnAddAssociation;

    @FXML
    private Button btnAddClass;

    @FXML
    private Button btnAddMethod;

    @FXML
    private Button btnAddPatameter;

    @FXML
    private ComboBox cbxClassName;

    @FXML
    private ComboBox cbxReturnType;

    @FXML
    private ComboBox cbxVisibility;

    @FXML
    private TextField tfMethodName;


    //--------AnchorPane_Right_Event-----------------

    @FXML
    void handleNext(MouseEvent event) {
        if (event.getSource() == btnNext){
            if (!tfMethodName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = tfMethodName.getText();
                String returnType = (String) cbxReturnType.getSelectionModel().getSelectedItem();
                String visibility = (String) cbxVisibility.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass ->{
                    if (aClass.getName().equals(className)){
                        aClass.getMethods().add(new Method(methodName, returnType, visibility));
                    }
                });
            }
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/ParameterMethodeView.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.initStyle(StageStyle.UNDECORATED);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    @FXML
    private void handleClose(MouseEvent event){
        if (event.getSource() == btnClose){
            System.exit(0);
        }
    }


    //--------AnchorPane_left_Event-----------------

    @FXML
    void handleAddAttribut(MouseEvent event) {
        if (event.getSource() == btnAddAttribut){
            if (!tfMethodName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = tfMethodName.getText();
                String returnType = (String) cbxReturnType.getSelectionModel().getSelectedItem();
                String visibility = (String) cbxVisibility.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass ->{
                    if (aClass.getName().equals(className)){
                        aClass.getMethods().add(new Method(methodName, returnType, visibility));
                    }
                });
            }
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../views/AttributView.fxml"));
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.initStyle(StageStyle.UNDECORATED);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void handleAddAssociation(MouseEvent event) {
        if (event.getSource() == btnAddAssociation){
            if (!tfMethodName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = tfMethodName.getText();
                String returnType = (String) cbxReturnType.getSelectionModel().getSelectedItem();
                String visibility = (String) cbxVisibility.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass ->{
                    if (aClass.getName().equals(className)){
                        aClass.getMethods().add(new Method(methodName, returnType, visibility));
                    }
                });
            }
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../views/RelationView.fxml"));
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.initStyle(StageStyle.UNDECORATED);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void handleAddClass(MouseEvent event) {
        if (event.getSource() == btnAddClass){
            if (!tfMethodName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = tfMethodName.getText();
                String returnType = (String) cbxReturnType.getSelectionModel().getSelectedItem();
                String visibility = (String) cbxVisibility.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass ->{
                    if (aClass.getName().equals(className)){
                        aClass.getMethods().add(new Method(methodName, returnType, visibility));
                    }
                });
            }
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../views/ClassView.fxml"));
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.initStyle(StageStyle.UNDECORATED);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void handleAddMethod(MouseEvent event) {
        if (event.getSource() == btnAddMethod){
            if (!tfMethodName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = tfMethodName.getText();
                String returnType = (String) cbxReturnType.getSelectionModel().getSelectedItem();
                String visibility = (String) cbxVisibility.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass ->{
                    if (aClass.getName().equals(className)){
                        aClass.getMethods().add(new Method(methodName, returnType, visibility));
                    }
                });
            }
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../views/MethodeView.fxml"));
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.initStyle(StageStyle.UNDECORATED);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void handleAddParameter(MouseEvent event) {
        if (event.getSource() == btnAddPatameter){
            if (!tfMethodName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = tfMethodName.getText();
                String returnType = (String) cbxReturnType.getSelectionModel().getSelectedItem();
                String visibility = (String) cbxVisibility.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass ->{
                    if (aClass.getName().equals(className)){
                        aClass.getMethods().add(new Method(methodName, returnType, visibility));
                    }
                });
            }
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../views/ParameterMethodeView.fxml"));
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.initStyle(StageStyle.UNDECORATED);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //----------------------------

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Utils.classes.forEach(aClass ->{
            cbxClassName.getItems().add(aClass.getName());
        });
    }
}
