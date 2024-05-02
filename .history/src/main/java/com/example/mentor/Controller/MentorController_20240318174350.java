package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.mentor.Models.MentorRequest;


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
    
    @PostMapping("/addmentor")
    public String addMentorRequest(@ModelAttribute("MentorRequest") MentorRequest mentorrequest ){
        
        System.out.println(mentorrequest);
        return "index";
    }
    
}
