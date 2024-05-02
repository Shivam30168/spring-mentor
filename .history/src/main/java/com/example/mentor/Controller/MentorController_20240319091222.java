package com.example.mentor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Service.MentorRequestService;


@Controller
public class MentorController {

    @Autowired
    MentorRequestService mService;

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
        
        
        return "index";
    }
    
}
