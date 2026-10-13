package elelief.typemoon.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Map;

public class Jwtutil {
    private static final String SECRET_KEY = "RUxFTElFRg==";
    private static final long EXPRATION_TIME = 60*12*60;
    private static final ZonedDateTime now=ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    private static final Instant expiration=now.plusSeconds(EXPRATION_TIME).toInstant();
    public static String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .addClaims(claims)
                .setExpiration(Date.from(expiration))
                .compact();
    }

    public static Claims parseToken(String token) throws Exception {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }
}
