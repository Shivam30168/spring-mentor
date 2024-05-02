package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Service.MentorRequestService;
import com.example.mentor.Service.MentorService;


@Controller
public class MentorController {

    @Autowired
    MentorRequestService mentorRequestService;

    @Autowired
    MentorService mService;

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
        List<MentorRequest> mrs = mentorRequestService.getallmentorRequests();
        model.addAttribute("allmentorRequests", mrs);
        return "allMentorRequest";        
    }

    @GetMapping("/allmentors")
    public String allMentors(Model model){
        List<Mentor> m=mService.getAllMentor();
        model.addAttribute("allmentor", m);
        if (model.containsAttribute("deletemessage")) {
            String message = (String) model.getAttribute("deletemessage");
            System.out.println("message------------"+message);
            model.addAttribute("deletemessage", message);
        }
        return "allMentors";        
    }
    
    @PostMapping("/addmentor")
    public String addMentorRequest(@ModelAttribute("MentorRequest") MentorRequest mentorrequest,Model model ){
        MentorRequest mr =mentorRequestService.addmentorRequest(mentorrequest);
        if(mr != null) {
            model.addAttribute("message", "Mentor request added successfully.");
        } else {
            model.addAttribute("message", "Failed to add mentor request. Please try again.");
        }
        return "addMentor";
    }
    
   @GetMapping("/deletementor")
public String deletementor(@RequestParam("id") int id, RedirectAttributes redirectAttributes) {
    int mentor = mService.deletementor(id);
    if (mentor > 0) {
        redirectAttributes.addFlashAttribute("deletemessage", "Successfully Deleted");
    } else {
        redirectAttributes.addFlashAttribute("deletemessage", "Unable to delete Mentor");
    }
    return "redirect:/allmentors";
}
}
