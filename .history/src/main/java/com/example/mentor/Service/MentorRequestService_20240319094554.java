package com.example.mentor.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Repository.MentorRequestRepository;




@Service
public class MentorRequestService {

    @Autowired
    private MentorRequestRepository mentorRequestRepository;

    public MentorRequest addmentorRequest(MentorRequest mRequest){
        MentorRequest mentorRequest =null;
        if(mRequest!=null){
            mRequest.setStatus("disapproved");
            mentorRequestRepository.save(mRequest);
        }
        return mentorRequest;
    }
}
