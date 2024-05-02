package com.example.mentor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentor.Models.Mentor;

import jakarta.transaction.Transactional;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
 
    
}
