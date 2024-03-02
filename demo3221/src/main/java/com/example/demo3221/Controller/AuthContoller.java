package com.example.demo3221.Controller;

import com.example.demo3221.Service.UserService;
import com.example.demo3221.UserDto.UserDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class AuthContoller {
    private final UserService userService;
    @GetMapping("/registration")
    public String registerForm(UserDto userDto){
        return "registration";
    }
    @PostMapping("/registration")
    public String saveUser(@Valid UserDto userDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "registration";
        }
        userService.registration(userDto);
        return "redirect:/results";
    }
}
