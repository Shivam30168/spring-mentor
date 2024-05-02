package com.example.mentor.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Service.MentorService;

import java.util.List;

import javax.management.monitor.Monitor;

@RestController
@RequestMapping("/mentors")
public class MentorController {

    private final MentorService mentorService;

    @Autowired
    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping
    public List<Mentor> getAllMentors() {
        return mentorService.getAllMentors();
    }

    @PostMapping
    public Mentor createMentor(@RequestBody Mentor mentor) {
        return mentorService.createMentor(mentor);
    }

    // Add other CRUD operations (e.g., getById, update, delete) if needed
}
