package com.example.demo3221.Service;

import com.example.demo3221.Entity.User;
import com.example.demo3221.Repo.UserRepo;
import com.example.demo3221.UserDto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    public void registration(UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setSurname(userDto.getSurname());
        user.setLastname(userDto.getLastname());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setEmail(userDto.getEmail());
        user.setNumber(userDto.getNumber());
        userRepo.save(user);
    }
}
