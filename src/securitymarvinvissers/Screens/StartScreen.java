/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitymarvinvissers.Screens;

import Controller.EncryptionController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JTextArea;

/**
 *
 * @author visse
 */
public class StartScreen {
    
    // Creating an instance of the oontroller
    EncryptionController ctrlEncryption = new EncryptionController();
    
    public StartScreen(AnchorPane root, Stage primaryStage, Scene scene) {
        
        /*
         * Creating everything for the root Anchorpane 
         */
        // Labels
        Label lblTitle = new Label("Encryptie/Decryptie systeem Marvin Vissers");
        Label lblEncryption = new Label("Encrypt");
        Label lblDecryption = new Label("Decrypt");
        Label lblPlaintextEncryption = new Label("Message");
        Label lblPlaintextDecryption = new Label("Decrypted cipthertext");
        Label lblEncryptionKey = new Label("Key");
        Label lblDecryptenKey = new Label("Key");
        Label lblEncryptedText = new Label("Encrypted messsage");
        Label lblCipherText = new Label("Ciphertext");
        
        // Input fields
        TextField txtEncryptionKey = new TextField();
        TextField txtDecryptionKey = new TextField();
        TextArea txtPlaintextEncryption = new TextArea();
        TextArea txtCipherText = new TextArea();
        TextArea txtEncryptedText = new TextArea();
        TextArea txtDecryptedText = new TextArea();
        
        // Buttons
        Button btnEncrypt = new Button("Encrypt message");
        Button btnDecrypt = new Button("Decrypt ciphertext");
        
        // Adding classes
        lblTitle.getStyleClass().add("page-title");
        lblTitle.getStyleClass().add("page--title");
        lblEncryption.getStyleClass().add("page-section");
        lblDecryption.getStyleClass().add("page-section");
        lblPlaintextEncryption.getStyleClass().add("label");
        lblPlaintextDecryption.getStyleClass().add("label");
        lblEncryptionKey.getStyleClass().add("label");
        lblDecryptenKey.getStyleClass().add("label");
        lblEncryptedText.getStyleClass().add("label");
        lblCipherText.getStyleClass().add("label");
        btnEncrypt.getStyleClass().add("btn");
        btnDecrypt.getStyleClass().add("btn");
        
        // Setting sizes for the input fields
        txtEncryptionKey.setPrefWidth(300);
        txtDecryptionKey.setPrefWidth(300);
        txtPlaintextEncryption.setPrefSize(300, 100);
        txtCipherText.setPrefSize(300, 100);
        txtEncryptedText.setPrefSize(300, 100);
        txtDecryptedText.setPrefSize(300, 100);
        
        /*
        * Setting everything in place
        */
        // Title
        lblTitle.setLayoutX(175);
        lblTitle.setLayoutY(50);
        // Encryption title
        lblEncryption.setLayoutX(25);
        lblEncryption.setLayoutY(100);
        // Decryption title
        lblDecryption.setLayoutX(350);
        lblDecryption.setLayoutY(100);
        // Plaintext to Encrypt label
        lblPlaintextEncryption.setLayoutX(25);
        lblPlaintextEncryption.setLayoutY(150);
        // Plaintext to Encrypt
        lblCipherText.setLayoutX(350);
        lblCipherText.setLayoutY(150);
        // Encrypted Plaintext label
        txtPlaintextEncryption.setLayoutX(25);
        txtPlaintextEncryption.setLayoutY(175);
        // Ciphertext input
        txtCipherText.setLayoutX(350);
        txtCipherText.setLayoutY(175);
        // Encryption key label
        lblEncryptionKey.setLayoutX(25);
        lblEncryptionKey.setLayoutY(300);
        // Encryption key input
        txtEncryptionKey.setLayoutX(25);
        txtEncryptionKey.setLayoutY(325);
        // Decryption key label
        lblDecryptenKey.setLayoutX(350);
        lblDecryptenKey.setLayoutY(300);
        // Decryption key input
        txtDecryptionKey.setLayoutX(350);
        txtDecryptionKey.setLayoutY(325);
        // Button to encrypt
        btnEncrypt.setLayoutX(25);
        btnEncrypt.setLayoutY(375);
        // Button to decrypt
        btnDecrypt.setLayoutX(350);
        btnDecrypt.setLayoutY(375);
        // Label for encrypted text
        lblEncryptedText.setLayoutX(25);
        lblEncryptedText.setLayoutY(450);
        // Input for encrypted text
        txtEncryptedText.setLayoutX(25);
        txtEncryptedText.setLayoutY(475);
        // Label for decrypted text
        lblPlaintextDecryption.setLayoutX(350);
        lblPlaintextDecryption.setLayoutY(450);
        // input for decrypted text
        txtDecryptedText.setLayoutX(350);
        txtDecryptedText.setLayoutY(475);
        
        /*
        * Adding everyting to the scene
        */
        root.getChildren().addAll(lblTitle, lblEncryption, lblDecryption, lblPlaintextEncryption, lblCipherText, txtPlaintextEncryption, txtCipherText, lblEncryptionKey, lblDecryptenKey,
                                  txtEncryptionKey, txtDecryptionKey, btnEncrypt, btnDecrypt, lblEncryptedText, lblPlaintextDecryption, txtEncryptedText, txtDecryptedText);
        
        // Function to encrypt message when btnEncrypt is presssed
        btnEncrypt.setOnAction(event -> {
            // Getting the values of the input types
            String sMessage = txtPlaintextEncryption.getText().toUpperCase();
            String sKey = txtEncryptionKey.getText().toUpperCase();
            
            // Calling the encryption function
            String sEncryptedMessage = ctrlEncryption.Encrypt(sMessage, sKey);
            // Setting the encrypted text in the textarea
            txtEncryptedText.setText(sEncryptedMessage);
        });
        
        // Function to decrypt ciphertext when btnDecrypt is pressed
        btnDecrypt.setOnAction(event -> {
            // Getting the values of the input types
            String sMessage = txtCipherText.getText().toUpperCase();
            String sKey = txtDecryptionKey.getText().toUpperCase();
            
            // Calling the encryption function
            String sDecryptedMessage = ctrlEncryption.Decrypt(sMessage, sKey);
            // Setting the encrypted text in the textarea
            txtDecryptedText.setText(sDecryptedMessage);
        });
    }
}
