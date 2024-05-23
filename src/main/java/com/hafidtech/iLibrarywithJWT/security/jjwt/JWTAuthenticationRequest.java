package com.hafidtech.iLibrarywithJWT.security.jjwt;

import lombok.Data;

@Data
public class JWTAuthenticationRequest {
    private String userName;
    private String password;
}
