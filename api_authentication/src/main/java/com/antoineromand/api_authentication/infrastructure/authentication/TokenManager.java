package com.antoineromand.api_authentication.infrastructure.authentication;

import java.security.PrivateKey;
import java.security.PublicKey;

public abstract class TokenManager {
    public abstract String createToken(PrivateKey privateKey, String data, long expiration);

    public abstract boolean verifyToken(String token, PublicKey publicKey);

    public abstract String extractIdentifier(String token, PublicKey publicKey);
}
