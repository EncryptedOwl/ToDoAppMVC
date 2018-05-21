package com.todoappstudy.controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jacks
 */
public class FXMLController implements Initializable {

    @FXML
    private Button btnStartOver;

    @FXML
    private Label labelNumberOne;

    @FXML
    private TextField textFieldNumberOne;

    @FXML
    private Label labelAppLogo;

    @FXML
    private CheckBox checkBoxNumberOne;

    @FXML
    private Label labelNumberTwo;

    @FXML
    private TextField textFieldNumberTwo;

    @FXML
    private CheckBox checkBoxNumberTwo;

    @FXML
    private Label labelNumberThree;

    @FXML
    private TextField textFieldNumberThree;

    @FXML
    private CheckBox checkBoxNumberThree;

    @FXML
    private Label labelNumberFour;

    @FXML
    private TextField textFieldNumberFour;

    @FXML
    private CheckBox checkBoxNumberFour;

    @FXML
    private Label labelNumberFive;

    @FXML
    private TextField textFieldNumberFive;

    @FXML
    private CheckBox checkBoxNumberFive;

    @FXML
    private Label labelNumberSix;

    @FXML
    private TextField textFieldNumberSix;

    @FXML
    private CheckBox checkBoxNumberSix;

    @FXML
    private Label labelNumberSeven;

    @FXML
    private TextField textFieldNumberSeven;

    @FXML
    private CheckBox checkBoxNumberSeven;

    @FXML

    private TextField textFieldTimerShow;

    @FXML
    private TextField textFieldTimerShowAlert;

    private int timerCounter = 1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        doCode();

    }

    //Clear text fields and checkboxes method for "Start Over" Button
    @FXML
    void clearTextFields(ActionEvent event) {
        textFieldNumberOne.clear();
        textFieldNumberTwo.clear();
        textFieldNumberThree.clear();
        textFieldNumberFour.clear();
        textFieldNumberFive.clear();
        textFieldNumberSix.clear();
        textFieldNumberSeven.clear();

        checkBoxNumberOne.fire();
        checkBoxNumberTwo.fire();
        checkBoxNumberThree.fire();
        checkBoxNumberFour.fire();
        checkBoxNumberFive.fire();
        checkBoxNumberSix.fire();
        checkBoxNumberSeven.fire();
    }

    //Timer method
    public void doCode() {
        new Timer().schedule(new TimerTask() {

            //to jest jakby metoda w metodzie, ale tylko tak wygląda. to wszystko jest w klasie Timer. Metoda w tej klasie musi nazywać się run
            @Override
            public void run() {
                //tutaj już robisz co chcesz

                textFieldTimerShow.appendText(timerCounter + ".");
                System.out.println("Refresh num: " + timerCounter++);

                textFieldTimerShowAlert.setDisable(true);

                if (timerCounter > 6) {
                    textFieldTimerShowAlert.setText("Refreshed 6 times in one minute");

                }
                if (timerCounter == 360) {
                    textFieldTimerShowAlert.setText("You've been working for 30 mins, please take a break");
                    textFieldTimerShowAlert.setDisable(false);
                }

            }

        }, 0, 10000); //w milisekundach (po tym czasie wykonuje się kod osadzony w run())

    }

}
