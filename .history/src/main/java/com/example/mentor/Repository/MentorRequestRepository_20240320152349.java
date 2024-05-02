package com.example.mentor.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentor.Models.MentorRequest;

import jakarta.transaction.Transactional;

public interface MentorRequestRepository extends JpaRepository<MentorRequest, Integer>{
    

    @Transactional
    int deleteByMentorid(int mentorid);

    List<MentorRequest> findByNameContainingIgnoreCase(String searchTerm);
}
