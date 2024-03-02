package com.example.demo3221.UserDto;

import com.example.demo3221.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String lastname;
    private String surname;
    private String email;
    private String password;
    private String number;
    private Set<Role> roles;

}
