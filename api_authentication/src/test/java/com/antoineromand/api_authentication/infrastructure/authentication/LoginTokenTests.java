package com.antoineromand.api_authentication.infrastructure.authentication;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTokenTests {
    private String token;
    private KeyPair keyPair;

    @BeforeAll
    public void setUp() throws NoSuchAlgorithmException {
        this.keyPair = generateKeyPair();
        this.token = generateToken(keyPair, "data", 60);
    }

    @Test
    public void isTokenGenerated() {
        assertTrue(this.token != null);
    }

    @Test
    public void isTokenValid() {
        try {
            Boolean result = verifyToken();
            assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void extractDataFromToken() {
        try {
            String data = new JwtTokenManager().extractIdentifier(this.token, this.keyPair.getPublic());
            assertNotNull(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isTokenUnvalid() {
        try {
            this.token = "invalid token";
            Boolean result = verifyToken();
            assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPair keyPair = new KeyPairGeneratorUtil().generateKeyPair();
        return keyPair;
    }

    private String generateToken(KeyPair keyPair, String data, long expiration) {
        return new JwtTokenManager().createToken(keyPair.getPrivate(), data, expiration);
    }

    private boolean verifyToken() {
        return new JwtTokenManager().verifyToken(this.token, this.keyPair.getPublic());
    }

}
