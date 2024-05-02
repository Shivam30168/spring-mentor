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
    MentorService mService;

    @GetMapping("/searchmentor")
    public String searchMentor(@RequestParam("searchTerm") String searchTerm, Model model) {
    List<Mentor> searchResults = mService.searchMentorByName(searchTerm);
    model.addAttribute("searchResults", searchResults);
    return "searchResults"; // Create a new JSP page for displaying search results
}
}
