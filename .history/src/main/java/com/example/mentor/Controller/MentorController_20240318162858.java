package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MentorController {

    @GetMapping("/")
    public String home(){
        
        return "index";        
    }   

    @GetMapping("/addmentor")
    public String addMentor(){
        
        return "addMentor";        
    }

    @GetMapping("/allmentorrequest")
    public String allMentorRequest(){
        
        return "allMentorRequest";        
    }

    @GetMapping("/allmentors")
    public String allMentors(){
        
        return "allMentors";        
    }
    
}
