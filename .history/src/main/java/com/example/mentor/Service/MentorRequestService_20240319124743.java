package com.example.mentor.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Repository.MentorRequestRepository;




@Service
public class MentorRequestService {

    @Autowired
    private MentorRequestRepository mentorRequestRepository;

    public MentorRequest addmentorRequest(MentorRequest mRequest) {
        if (mRequest != null) {
            mRequest.setStatus("disapproved");
            return mentorRequestRepository.save(mRequest);
        }
        return null; 
    }

    public List<MentorRequest> getallmentor(MentorRequest mRequest){
        return null;
    }
}
