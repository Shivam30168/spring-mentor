package com.example.mentor.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.mentor.Models.Mentor;

public class MentorController {
    @GetMapping()
    public Mentor home(){
        Mentor m = new Mentor();
        m.setName("Shivam");
        return m;
         
    }
}
