package com.todoappstudy.controller;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author jacks
 */
public class ToDoAppStudyRunner extends Application {

    Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../view/FXML.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setResizable(false);

        primaryStage.setTitle("Easy To Do App");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        launch(args);

        FXMLController appController = new FXMLController();

        try {

            if (args[0].equals("")) {

            }

            System.out.println("");

        } catch (Exception e) {

        }

        try {

            String filename = args[0];
        } catch (Exception e) {
            System.err.println("No file found");
        }

    }

}
