package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class MentorController {
    @GetMapping("/")
    public String home(){
        
        return "index";
         
    }
    
    
}
