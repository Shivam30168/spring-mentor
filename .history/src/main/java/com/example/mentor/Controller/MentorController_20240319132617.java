package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String allMentorRequest(Model model){
        List<MentorRequest> mentorRequests = mService.getallmentorRequests();
        model.addAttribute("mentorRequests", mentorRequests);
        return "allMentorRequest";        
    }

    @GetMapping("/allmentors")
    public String allMentors(){
        
        return "allMentors";        
    }
    
    @PostMapping("/addmentor")
    public String addMentorRequest(@ModelAttribute("MentorRequest") MentorRequest mentorrequest,Model model ){
        System.out.println("Received mentor request: " + mentorrequest);
        MentorRequest mr =mService.addmentorRequest(mentorrequest);
        System.out.println("Service returned: " + mr);
        if(mr != null) {
            model.addAttribute("message", "Mentor request added successfully.");
        } else {
            model.addAttribute("message", "Failed to add mentor request. Please try again.");
        }
        return "addMentor";
    }
    
}
