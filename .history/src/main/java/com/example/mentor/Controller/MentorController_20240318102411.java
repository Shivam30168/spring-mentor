package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MentorController {
    @GetMapping("/")
    public String home(){
        
        return "index";
         
    }
    @PostMapping("path")
    public String postMethodName(@RequestBody String Mentor) {
        //TODO: process POST request
        
        return Mentor;
    }
    
}
