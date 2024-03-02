package com.example.demo3221.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@RequiredArgsConstructor
public class WebController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
        @GetMapping("/")
                public String showForm(PersonForm personForm){
            return "form";

        }
        @PostMapping("/")
                public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult){
            if(bindingResult.hasErrors()){
                return "form";
            }
            return "redirect:/login";
        }



    }



