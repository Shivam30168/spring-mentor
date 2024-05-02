package com.example.mentor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.mentor.Models.MentorRequest;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    
}
