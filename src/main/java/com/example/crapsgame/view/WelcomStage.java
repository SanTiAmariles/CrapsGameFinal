package com.example.crapsgame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomStage extends Stage {
    public WelcomStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/com/example/crapsgame/welcome-view.fxml"));
        Parent root = loader.load();
        setTitle("Jugeo de Craps Game");
        Scene scene = new Scene(root);
        getIcons().add(
                new Image(
                        String.valueOf(getClass().getResource("/com/example/crapsgame/Images/favicon.png)"))));
        setScene(scene);
        setResizable(false);
        show();
    }
    public static WelcomStage getInstance() throws IOException {
        return WelcomeStageHolder.INSTANCE = new WelcomStage();
    }
    private static class WelcomeStageHolder{
        private static WelcomStage INSTANCE;
    }
}
