package com.example.inclassassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    // Top of Display
    @FXML private Label lblTitle;
    @FXML private Label lblOutput;

    // VBox Upper
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;
    @FXML private Button btnDivide;

    // Vbox Upper Mid
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btnMultiply;

    // Vbox Lower Mid
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btnSubtract;

    // Vbox Lower
    @FXML private Button btn0;
    @FXML private Button btnDecimal;
    @FXML private Button btnSum;
    @FXML private Button btnAdd;


    // When a number is pressed
    @FXML
    private void handleNumber(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String value = btn.getText();

        if (lblOutput.getText().equals("0")) {
            lblOutput.setText(value);
        } else {
            lblOutput.setText(lblOutput.getText() + value);
        }
    }

    @FXML
    private void handleClear(ActionEvent event) {
        lblOutput.setText("0");
    }

    /* TODO
    - configure button logic (first, second number, sum) (operator functionality)
    - figure out how to lock screen (I want to increase the size of the Calc, lock the window, add padding)
    - optional - css ( Possibly add colors? )
     */

}
