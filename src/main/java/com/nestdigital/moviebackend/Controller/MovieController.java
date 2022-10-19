package com.nestdigital.moviebackend.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @CrossOrigin
    @PostMapping("/movieadd")
    public String movie(){
        return"test";
    }
}
