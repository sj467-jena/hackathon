package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.repos.CourseLinkRepository;
import com.example.hackathonbackend.repos.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CourseLinkRepository courseLinksRepository;

    @RequestMapping("/searchCourses")
    public String searchCourses(Model model, @RequestParam(required = false, defaultValue = "null") String query) {
        if(query.equalsIgnoreCase("null"))
        {
            model.addAttribute("courses", courseRepository.findAll());
            System.out.println(courseRepository.findById(1));
        }
        else
        {
            model.addAttribute("courses",courseRepository.findByQuery(query));
            System.out.println(courseRepository.findByQuery(query));
        }
        return "search.html";
    }

    @RequestMapping("/softdev")
    public String softdev(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "softdev.html";
    }
}
