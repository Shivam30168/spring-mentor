package com.example.mentor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.mentor.Models.Mentor;



@Controller
public class MentorController {
    @GetMapping("/")
    public String home(){
        
        return "index";
         
    }
    @PostMapping("/mentors")
public Mentor postMethodName(@RequestBody Mentor mentor) {
    Mentor m = new Mentor();
    m.setName(mentor.getName()); // Set the name from the request body
    m.setAge(mentor.getAge()); // Set the age from the request body
    m.setGender(mentor.getGender()); // Set the gender from the request body
    m.setMobileno(mentor.getMobileno()); // Set the mobile number from the request body
    m.setJobrole(mentor.getJobrole()); // Set the job role from the request body
    
    // Perform any other necessary operations
    
    // Return the created Mentor object
    return m;
}

    
}
