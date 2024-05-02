package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Service.MentorRequestService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MentorRequestController {
    
    @Autowired
    MentorRequestService mentorRequestService;

    @GetMapping("/approverequest")
    public String approvereq(@RequestParam("mentorid") int mentorid,Model model,HttpServletRequest request) {
        Mentor mentor = mentorRequestService.approveReq(mentorid);
        if(mentor!=null){
            model.addAttribute("approveStatus", "Mentor Approved");
        }
        else{
            model.addAttribute("approveStatus", "Unable to Approve Mentor");
        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @GetMapping("/rejectrequest")
    public String rejectreq(@RequestParam("mentorid") int mentorid,Model model,HttpServletRequest request) {
        int status = mentorRequestService.disApproveReq(mentorid);
        if(status>0){
            model.addAttribute("rejectStatus", "Mentor Rejected");
        }
        else{
            model.addAttribute("rejectStatus", "Unable to Rejecte Mentor");
        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @GetMapping("/allmentorrequest")
    public String allMentorRequest(@RequestParam(required = false) String searchTerm,Model model){
        List<MentorRequest> mrs;
        if (searchTerm != null && !searchTerm.isEmpty()) {
            mrs = mentorRequestService.searchMentorRequestByName(searchTerm);
        } else {
            mrs = mentorRequestService.getallmentorRequests();
        }
        model.addAttribute("allmentorRequests", mrs);
        return "allMentorRequest";        
    }
    
    

}
