/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitymarvinvissers;

import securitymarvinvissers.Screens.StartScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author visse
 */
public class SecurityMarvinVissers extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Scherm aanmaken
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 750, 600);       
        
        // Interface aanroepen
        new StartScreen(root, primaryStage, scene); 
        
        // Stylesheet toevoegen
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        
        // Scherm instellingen
        primaryStage.setTitle("Security 1 - Marvin Vissers");     
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
