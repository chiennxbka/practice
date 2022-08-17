package org.alicoder.lesson26.print.flash;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FlashThread extends Application {

    private String text = "";

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Label label = new Label("Programming is fun");
        pane.getChildren().add(label);
        new Thread(() -> {
            try {
                while (true) {
                    if (label.getText().trim().length() == 0) text = "welcome";
                    Platform.runLater(() -> label.setText(text));
                    Thread.sleep(2000);
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
                Thread.currentThread().interrupt();
            }

        }).start();
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("FlashText"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
