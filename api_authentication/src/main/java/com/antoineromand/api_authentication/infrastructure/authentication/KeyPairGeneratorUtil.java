package com.antoineromand.api_authentication.infrastructure.authentication;

import java.security.*;

public class KeyPairGeneratorUtil {

    public KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        return generator.generateKeyPair();
    }

}
