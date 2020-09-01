/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EncryptionModal;

/**
 *
 * @author visse
 */
public class EncryptionController {
    
    EncryptionModal mdlEncryption;
    
    public EncryptionController() {
        mdlEncryption = new EncryptionModal();
    }
    
    public String Encrypt(String cleartext, String key) {
        try{
            // Sending the variabels to the modal
            String sEncryptedMessage = this.mdlEncryption.Encrypt(cleartext, key);

            // Returning encrypted text
            return sEncryptedMessage;
        } catch(Exception e){
            // Returning error message
            return "Er is iets mis gegaan";
        }
    }
    
    public String Decrypt(String cipherText, String key) {
        try{
            // Sending the variabels to the modal
            String sDecryptedMessage = this.mdlEncryption.Decrypt(cipherText, key);

            // Returning encrypted text
            return sDecryptedMessage;
        } catch(Exception e){
            // Returning error message
            return "Er is iets mis gegaan";
        }
    }
}
