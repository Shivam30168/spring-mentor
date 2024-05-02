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
    @PostMapping("men")
    public String postMethodName(@RequestBody String Mentor) {
        Mentor m = new Mentor();
        m.setName("Shivam");
        m.setAge(23);
        m.setGender('M');
        m.setMobileno(893745757);
        m.setJobrole("Developer");

        
        return Mentor;
    }
    
}
