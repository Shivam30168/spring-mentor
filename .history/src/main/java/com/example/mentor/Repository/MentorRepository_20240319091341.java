package com.example.mentor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentor.Models.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    
}
