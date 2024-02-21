package com.noah.sarknext2.noah.sarknext2.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JWTService2 {
    public String extractUsername(String token){
        return null;
    };
    public String generateToken(UserDetails userDetails){
        return null;
    };

//    private Claims extractAllClaims(String token) {
//        return Jwts
//                .parserBuilder()
//                .setSigningKey(getSignInKey())
//                .build()
//                .parseClaimsJws(token)
//                .getBody()
//    }
}
