package com.example.mentor.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Repository.MentorRepository;




@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    public MentorRequest addmentorRequest(MentorRequest mRequest){
        MentorRequest mentorRequest =null;
        if(mRequest!=null){
            mRequest.setStatus("disapproved");
            mentorRepository.save(mRequest);
        }
        return mentorRequest;
    }
}
