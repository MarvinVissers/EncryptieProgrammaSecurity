/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitymarvinvissers.Interfaces;

/**
 *
 * @author visse
 */
public interface EncryptInterface {
    
    /**
     * 
     * @param cleartext Tekst that needs to be encrypted
     * @param key Key to encrypt the cleartext with
     * @return Encrypted string
     */
    public String Encrypt(String cleartext, String key);
    
    /**
     * 
     * @param ciphertext Text that needs to be decrypted
     * @param key Key to decrypt ciphertext with
     * @return Decrypted string
     */
    public String Decrypt(String ciphertext, String key);
}
