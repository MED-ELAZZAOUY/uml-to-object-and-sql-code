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
import models.Parameter;
import utils.Utils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ParameterMethodeController implements Initializable {

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
    private ComboBox cbxMethodName;

    @FXML
    private TextField tfParameterName;

    @FXML
    private ComboBox cbxParameterType;

    //--------AnchorPane_Right_Event-----------------

    @FXML
    void handleNext(MouseEvent event) {
        if (event.getSource() == btnNext){
            if (!tfParameterName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = (String) cbxMethodName.getSelectionModel().getSelectedItem();
                String parameterName = tfParameterName.getText();
                String parameterType = (String) cbxParameterType.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass -> {
                    if (aClass.getName().equals(className)){
                        for (Method aMethod : aClass.getMethods() ){
                            if (aMethod.getName().equals(methodName))
                                aMethod.getParameters().add(new Parameter(parameterName, parameterType));
                        }
                    }
                });
            }
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/RelationView.fxml"));
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

    @FXML
    private void handleMethodName(MouseEvent event){
        if (event.getSource() == cbxMethodName){
            String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
            Utils.classes.forEach(aClass -> {
                if (aClass.getName().equals(className)){
                    cbxMethodName.getItems().clear();
                    //for (int i=0; i<aClass.getMethods().size(); i++) {
                        for (Method aMethod : aClass.getMethods() ){
                        cbxMethodName.getItems().add(aMethod.getName());
                    }
                }
            });
        }

    }




    //--------AnchorPane_left_Event-----------------
    @FXML
    void handleAddAttribut(MouseEvent event) {
        if (event.getSource() == btnAddAttribut){
            if (!tfParameterName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = (String) cbxMethodName.getSelectionModel().getSelectedItem();
                String parameterName = tfParameterName.getText();
                String parameterType = (String) cbxParameterType.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass -> {
                    if (aClass.getName().equals(className)){
                        for (Method aMethod : aClass.getMethods() ){
                            if (aMethod.getName().equals(methodName))
                                aMethod.getParameters().add(new Parameter(parameterName, parameterType));
                        }
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
            if (!tfParameterName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = (String) cbxMethodName.getSelectionModel().getSelectedItem();
                String parameterName = tfParameterName.getText();
                String parameterType = (String) cbxParameterType.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass -> {
                    if (aClass.getName().equals(className)){
                        for (Method aMethod : aClass.getMethods() ){
                            if (aMethod.getName().equals(methodName))
                                aMethod.getParameters().add(new Parameter(parameterName, parameterType));
                        }
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
            if (!tfParameterName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = (String) cbxMethodName.getSelectionModel().getSelectedItem();
                String parameterName = tfParameterName.getText();
                String parameterType = (String) cbxParameterType.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass -> {
                    if (aClass.getName().equals(className)){
                        for (Method aMethod : aClass.getMethods() ){
                            if (aMethod.getName().equals(methodName))
                                aMethod.getParameters().add(new Parameter(parameterName, parameterType));
                        }
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
            if (!tfParameterName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = (String) cbxMethodName.getSelectionModel().getSelectedItem();
                String parameterName = tfParameterName.getText();
                String parameterType = (String) cbxParameterType.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass -> {
                    if (aClass.getName().equals(className)){
                        for (Method aMethod : aClass.getMethods() ){
                            if (aMethod.getName().equals(methodName))
                                aMethod.getParameters().add(new Parameter(parameterName, parameterType));
                        }
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
            if (!tfParameterName.getText().isEmpty()){
                String className = (String) cbxClassName.getSelectionModel().getSelectedItem();
                String methodName = (String) cbxMethodName.getSelectionModel().getSelectedItem();
                String parameterName = tfParameterName.getText();
                String parameterType = (String) cbxParameterType.getSelectionModel().getSelectedItem();
                Utils.classes.forEach(aClass -> {
                    if (aClass.getName().equals(className)){
                        for (Method aMethod : aClass.getMethods() ){
                            if (aMethod.getName().equals(methodName))
                                aMethod.getParameters().add(new Parameter(parameterName, parameterType));
                        }
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

    //------------------------------

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Utils.classes.forEach(aClass ->{
            cbxClassName.getItems().add(aClass.getName());
        });

    }
}
