/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import securitymarvinvissers.Interfaces.EncryptInterface;

/**
 *
 * @author visse
 */
public class EncryptionModal implements EncryptInterface {

    @Override
    public String Encrypt(String cleartext, String key) {
        String ciphertext = "";
        
        // Creating the full key
        String newKey = key + cleartext;
        String finalKey = newKey.replaceAll("\\s+", "");
        
        // Setting everything in uppercase to make sure the encryption goes well
        cleartext.toUpperCase();
        finalKey.toUpperCase();
        
        //System.out.println(finalKey);
        try {            
            // Walking through te text            
            for (int i = 0; i < cleartext.length(); i++) { 
                // converting in range 0-25 
                int x = (cleartext.charAt(i) + finalKey.charAt(i)) % 26; 

                // convert into alphabets(ASCII) 
                x += 'A'; 

                ciphertext+=(char)(x); 
            } 
            
            // Returning encrypted message
            return ciphertext;
        } catch(Exception e) {
            System.out.println(e);
            return "Encryption failed";
        }
    }

    @Override
    public String Decrypt(String ciphertext, String key) {
        String cleartext = "";
        
        // Setting everything in uppercase to make sure the encryption goes well
        ciphertext.toUpperCase();
        key.toUpperCase();
        
         try {            
            // Walking through te text            
            for (int i = 0; i < ciphertext.length(); i++) { 
                // Creating the full key
                String newKey = key + cleartext;
                String finalKey = newKey.replaceAll("\\s+", "");

                System.out.println(finalKey);
                
                // Walking through te text            
                // converting in range 0-25 
                int x = (ciphertext.charAt(i) - finalKey.charAt(i) + 26) %26; 

                // convert into alphabets(ASCII) 
                x += 'A'; 

                cleartext+=(char)(x); 
            }   
            
            // Giving the cleartext back
            return cleartext;
        } catch(Exception e) {
            System.out.println(e);
            return "Decryption failed";
        }
    }  
}
