package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mentor.Models.Mentor;



@Controller
public class MentorController {
    @GetMapping("/")
    public String home(){
        
        return "index";
         
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

    // Perform any other necessary operations

    return m;
}


    
}
