package com.example.mentor.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Repository.MentorRepository;




@Controller
public class MentorController {

    MentorRepository repo;

    @GetMapping("/")
    public String home(){
        
        return "index";
         
    }
    public Mentor mentor(@PathVariable int Id, MentorRepository mentorRepository){
        Optional<Mentor> ab = mentorRepository.findById(Id);
        return ab;
    }
    
    
}
