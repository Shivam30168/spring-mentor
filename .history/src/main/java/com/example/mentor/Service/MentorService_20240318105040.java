package com.example.mentor.Service;


import org.springframework.stereotype.Service;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Repository.MentorRepository;

import java.util.List;

import javax.management.monitor.Monitor;

@Service
public class MentorService {

    private final MentorRepository mentorRepository;

    
    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    @SuppressWarnings("null")
    public Mentor createMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }
}
