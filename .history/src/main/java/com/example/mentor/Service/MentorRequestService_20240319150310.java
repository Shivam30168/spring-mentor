package com.example.mentor.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentor.Models.Mentor;
import com.example.mentor.Models.MentorRequest;
import com.example.mentor.Repository.MentorRequestRepository;




@Service
public class MentorRequestService {

    @Autowired
    private MentorService mentorService;

    @Autowired
    private MentorRequestRepository mentorRequestRepository;

    public MentorRequest addmentorRequest(MentorRequest mRequest) {
        if (mRequest != null) {
            mRequest.setStatus("disapproved");
            return mentorRequestRepository.save(mRequest);
        }
        return null; 
    }

    public List<MentorRequest> getallmentorRequests(){
        return mentorRequestRepository.findAll();
    }

    public Mentor approveReq(int mentorid){
        Optional<MentorRequest> mentordata=mentorRequestRepository.findById(mentorid);
        if (mentordata.isPresent()) 
        {
            MentorRequest mentorRequest=mentordata.get();
            Mentor m=new Mentor(mentorid, mentorRequest.getName(), mentorRequest.getMobileno(), mentorRequest.getAge(), mentorRequest.getGender(), mentorRequest.getJobrole());
            mentorRequestRepository.deleteById(mentorid);
            return mentorService.addMentor(m);
        }
        else
        {
            return null;
        }
    }

    public int disApproveReq(int mentorid)
    {
        return mentorRequestRepository.deleteByMentorid(mentorid);
    }
    
}
