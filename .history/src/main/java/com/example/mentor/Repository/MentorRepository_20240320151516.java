package com.example.mentor.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentor.Models.Mentor;

import jakarta.transaction.Transactional;


public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    
    @Transactional
    int deleteByid(int id);

    List<Mentor> findByNameContainingIgnoreCase(String name);
    
}
