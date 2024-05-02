package com.example.mentor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Service.MentorRequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MentorApproveController {
    
    @Autowired
    MentorRequestService mentorRequestService;

    @GetMapping("/approverequest")
    public String getMethodName(@RequestParam("mentorid") int mentorid,Model model) {
        Mentor mentor = mentorRequestService.approveReq(mentorid);
        if(mentor!=null){
            model.addAttribute("approveStatus", "Mentor Approved");
        }
        else{
            model.addAttribute("approveStatus", "Unable to Approve Mentor");
        }
        return "allMentorRequest";
    }
    
    

}
