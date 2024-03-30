/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.agenciafiscalutileria;

/**
 *
 * @author f_aco
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        String originalText = "6554346578";
        System.out.println("Original Text: " + originalText);

//        String encryptedText = Encriptacion.encrypt(originalText);
//        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = Encriptacion.decrypt("y/awaUhAZgwdnlB4d//qZg==");
        System.out.println("Decrypted Text: " + decryptedText);

    }

}
