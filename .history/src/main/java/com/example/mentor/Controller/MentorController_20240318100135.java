package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mentor.Models.Mentor;

@Controller
public class MentorController {
    @GetMapping("/")
    public String home(){
        
        return "index";
         
    }
}
