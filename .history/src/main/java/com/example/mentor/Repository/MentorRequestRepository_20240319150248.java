package com.example.mentor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentor.Models.MentorRequest;

import jakarta.transaction.Transactional;

public interface MentorRequestRepository extends JpaRepository<MentorRequest, Integer>{
    

    @Transactional
    int deleteByMentorid(int mentorid);
}
