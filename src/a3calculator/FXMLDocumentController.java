/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Mecaa
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    Label lbEqual;

    @FXML
    Button btnSub;
    @FXML
    Button btnDiv;
    @FXML
    Button btnMult;
    @FXML
    Button btnAdd;

    @FXML
    TextField txtOne;
    @FXML
    TextField txtTwo;

    @FXML
    private void addButton(ActionEvent event) {
        System.out.println("Addition!");
        float number1 = Float.parseFloat(txtOne.getText());
        float number2 = Float.parseFloat(txtTwo.getText());
        float equal = number1 + number2;
        lbEqual.setText(Float.toString(equal));
       
    }

    @FXML
    private void subButton(ActionEvent event) {
        System.out.println("Substraction!");
        float number1 = Float.parseFloat(txtOne.getText());
        float number2 = Float.parseFloat(txtTwo.getText());
        float equal = number1 - number2;
        lbEqual.setText(Float.toString(equal));
    }

    @FXML
    private void multButton(ActionEvent event) {
        System.out.println("Multiplication!");
        float number1 = Float.parseFloat(txtOne.getText());
        float number2 = Float.parseFloat(txtTwo.getText());
        float equal = number1 * number2;
        lbEqual.setText(Float.toString(equal));
    }

    @FXML
    private void divButton(ActionEvent event) {
        System.out.println("Divided!");
        float number1 = Float.parseFloat(txtOne.getText());
        float number2 = Float.parseFloat(txtTwo.getText());
        float equal = number1 / number2;
        lbEqual.setText(Float.toString(equal));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
