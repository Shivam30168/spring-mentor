package com.example.mentor.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Repository.MentorRepository;

public class MentorService {
    @Autowired
    private MentorRepository mentorRepository;

     public Mentor addMentor(Mentor mentor)
    {
        if (mentor != null) {
            return mentorRepository.save(mentor);
        }
        return null;
    }
}
