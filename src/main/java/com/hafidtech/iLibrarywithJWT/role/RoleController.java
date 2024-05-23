package com.hafidtech.iLibrarywithJWT.role;

import com.hafidtech.iLibrarywithJWT.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {
    private final IRoleService roleService;

    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAllRoles() {
        return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.FOUND);
    }
    @PostMapping("/create")
    public ResponseEntity<Role> createRole(@RequestBody Role role){
        return new ResponseEntity<>(roleService.createRole(role), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void createRole(@PathVariable("id") Long roleId) {
        roleService.deleteRole(roleId);

    }

    @PostMapping("/remove-all-users-from-role/{id}")
    public Role removeAllUsersFromRole(@PathVariable("id") Long roleId) {
        return roleService.removeAllUserFromRole(roleId);
    }

    @PostMapping("/remove-users-from-role")
    public User removeUserFromRole(@RequestParam("userId") Long userId,
                                   @RequestParam("roleId") Long roleId) {
        return roleService.removeUserFromRole(userId, roleId);
    }

    @PostMapping("/assign-users-to-role")
    public User assignUserFromRole(@RequestParam("userId") Long userId,
                                   @RequestParam("roleId") Long roleId) {
        return roleService.assignUserToRole(userId, roleId);
    }
}
