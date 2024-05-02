package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.mentor.Models.Mentor;
import com.example.mentor.Service.MentorService;

@Controller
public class MentorSearchController {
    
     @Autowired
    private MentorService mentorService;

    @GetMapping("/searchMentor")
    public ResponseEntity<List<Mentor>> searchMentor(@RequestParam("name") String name) {
        List<Mentor> mentors = mentorService.searchMentorByName(name);
        return new ResponseEntity<>(mentors, HttpStatus.OK);
    }
}
