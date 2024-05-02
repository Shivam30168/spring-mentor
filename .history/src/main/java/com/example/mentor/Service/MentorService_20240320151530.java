package com.example.mentor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Repository.MentorRepository;

@Service
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
    
    public List<Mentor> getAllMentor()
    {
        return mentorRepository.findAll();
    }
    public int deletementor(int id)
    {
        return mentorRepository.deleteByid(id);
    }

    public List<Mentor> searchMentorByName(String searchTerm) {
        return mentorRepository.findByNameContainingIgnoreCase(searchTerm);
    }
    
}
