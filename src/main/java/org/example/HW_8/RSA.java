package org.example.HW_8;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Base64;

public class RSA {
    public static void main(String[] args) {
        KeyPairGenerator keyPairGenerator;

        {
            try {
                keyPairGenerator = KeyPairGenerator.getInstance("RSA"); // генерация ключа RSA
                keyPairGenerator.initialize(2048); // размер ключа в битах
                KeyPair keyPair = keyPairGenerator.generateKeyPair();

                PublicKey publicKey = keyPair.getPublic(); // открытый ключ

                byte[] publicKeyBytes = publicKey.getEncoded(); // экспорт в байты

                String publicKeyBase = Base64.getEncoder().encodeToString(publicKeyBytes); // преобразование в строку
                System.out.println("Открытый ключ (Base64):" + publicKeyBase);


            } catch (NoSuchAlgorithmException e) {
                System.out.println("ERROR");
                throw new RuntimeException(e);
            }
        }
    }


}

