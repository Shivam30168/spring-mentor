package com.example.mentor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.mentor.Models.Mentor;
import com.example.mentor.Service.MentorService;

@Controller
public class MentorSearchController {
    
     @Autowired
    private MentorService mentorService;

    @GetMapping("/searchMentor")
    public String searchMentor(@RequestParam("name") String name, Model model) {
        List<Mentor> searchResults = mentorService.searchMentorByName(name);
        model.addAttribute("allMentors", searchResults);
        return "allMentors"; // Return the same JSP page to display search results
    }
}
