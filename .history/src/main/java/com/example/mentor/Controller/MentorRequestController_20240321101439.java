package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Service.MentorRequestService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MentorRequestController {
    
    @Autowired
    MentorRequestService mentorRequestService;

    @GetMapping("/approverequest")
    public String approvereq(@RequestParam("mentorid") int mentorid,HttpSession model,HttpServletRequest request) {
        Mentor mentor = mentorRequestService.approveReq(mentorid);
        if(mentor!=null){
            model.setAttribute("approveStatus", "Mentor Approved");
        }
        else{
            model.setAttribute("approveStatus", "Unable to Approve Mentor");
        }
        return "redirect:/allmentorrequest";
    }

    @GetMapping("/rejectrequest")
    public String rejectreq(@RequestParam("mentorid") int mentorid,HttpSession model,HttpServletRequest request) {
        int status = mentorRequestService.disApproveReq(mentorid);
        if(status>0){
            model.setAttribute("rejectStatus", "Mentor Rejected");
        }
        else{
            model.setAttribute("rejectStatus", "Unable to Rejecte Mentor");
        }
        return "redirect:/allmentorrequest" ;
    }

    @GetMapping("/allmentorrequest")
    public String allMentorRequest( String Term,Model model){
        List<MentorRequest> mrs;
        if (Term != null && !Term.isEmpty()) {
            mrs = mentorRequestService.searchMentorRequestByName(Term);
        } else {
            mrs = mentorRequestService.getallmentorRequests();
        }
        model.addAttribute("allmentorRequests", mrs);
        return "allMentorRequest";        
    }
    
    

}
