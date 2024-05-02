package com.example.mentor.Controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Service.MentorService;



@Controller
public class MentorController {
    @GetMapping("/")
    public String home(){
        
        return "index";
         
    }
    private final MentorService mentorService ;
    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }
    @GetMapping
    public List<Mentor> getAllMentors() {
        
        return mentorService.getAllMentors();
    }
    
    @PostMapping("/men")
    @ResponseBody
    public Mentor postMethodName(@RequestBody Mentor mentor) {
        Mentor m = new Mentor();
        m.setName(mentor.getName());
        m.setAge(mentor.getAge());
        m.setGender(mentor.getGender());
        m.setMobileno(mentor.getMobileno());
        m.setJobrole(mentor.getJobrole());

    return m;
}


    
}
