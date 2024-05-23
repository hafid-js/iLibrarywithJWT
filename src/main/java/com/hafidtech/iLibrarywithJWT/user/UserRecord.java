package com.hafidtech.iLibrarywithJWT.user;


import com.hafidtech.iLibrarywithJWT.role.Role;

import java.util.Set;

public record UserRecord(Long id, String firstName, String lastName, String email, Set<Role> roles){

}
