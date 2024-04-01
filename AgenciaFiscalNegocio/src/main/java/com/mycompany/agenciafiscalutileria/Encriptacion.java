/*
 * Encriptacion.java
 */
package com.mycompany.agenciafiscalutileria;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Esta clase proporciona métodos para encriptar y desencriptar datos utilizando
 * el algoritmo AES. Se utiliza una clave secreta para cifrar y descifrar los
 * datos. La clave secreta debe tener 16, 24 o 32 caracteres.
 *
 * @author f_aco
 */
public class Encriptacion {

    /**
     * Algoritmo utilizado para la encriptación y desencriptación.
     */
    private static final String ALGORITHM = "AES";

    /**
     * Clave secreta utilizada para la encriptación y desencriptación.
     */
    private static final String SECRET_KEY = "1234567890123456";

    /**
     * Constructor por defecto
     */
    public Encriptacion() {
    }

    /**
     * Encripta el texto proporcionado utilizando la clave secreta.
     *
     * @param data Texto a encriptar.
     * @return Texto encriptado.
     * @throws Exception Si ocurre un error durante el proceso de encriptación.
     */
    public static String encrypt(String data) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    /**
     * Desencripta el texto encriptado proporcionado utilizando la clave
     * secreta.
     *
     * @param encryptedData Texto encriptado.
     * @return Texto desencriptado.
     * @throws Exception Si ocurre un error durante el proceso de
     * desencriptación.
     */
    public static String decrypt(String encryptedData) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
}
