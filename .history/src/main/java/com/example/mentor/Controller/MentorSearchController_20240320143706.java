package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Service.MentorService;

@Controller
public class MentorSearchController {
    
     @Autowired
    private MentorService mentorService;

    @GetMapping("/searchMentor")
    @ResponseBody
    public List<Mentor> searchMentor(@RequestParam("name") String name) {
        return mentorService.searchMentorByName(name);
    }
}
