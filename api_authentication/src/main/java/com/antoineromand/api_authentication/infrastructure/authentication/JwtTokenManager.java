package com.antoineromand.api_authentication.infrastructure.authentication;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.*;

public class JwtTokenManager extends TokenManager {

    @Override
    public String createToken(PrivateKey privateKey, String data, long expiration) {
        Date tokenCreateTime = new Date();
        Date tokenValidity = new Date(tokenCreateTime.getTime() + TimeUnit.MINUTES.toMillis(expiration));
        return Jwts.builder()
                .subject(data)
                .expiration(tokenValidity)
                .signWith(privateKey, Jwts.SIG.RS256)
                .compact();
    }

    @Override
    public boolean verifyToken(String token, PublicKey publicKey) {
        try {
            Jwts.parser().verifyWith(publicKey).build().parseSignedClaims(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }

    @Override
    public String extractIdentifier(String token, PublicKey publicKey) {
        Jws<Claims> claims = Jwts.parser().verifyWith(publicKey).build().parseSignedClaims(token);
        return claims.getPayload().getSubject();
    }

}
