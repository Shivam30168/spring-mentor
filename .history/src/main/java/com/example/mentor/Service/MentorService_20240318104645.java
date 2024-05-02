package com.example.mentor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Repository.MentorRepository;

import java.util.List;

@Service
public class MentorService {

    private final MentorRepository mentorRepository;

    
    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }
}
