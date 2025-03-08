package com.example.hackathon;

import com.example.hackathon.domain.Course;
import com.example.hackathon.domain.CourseLinks;
import com.example.hackathon.repos.CourseLinksRepository;
import com.example.hackathon.repos.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HackathonApplication implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CourseLinksRepository courseLinksRepository;

    public static void main(String[] args) {
        SpringApplication.run(HackathonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course c=new Course();
        c.setTitle("C++ fundamentals");
        c.setDescription("C++ is one of the world's most popular programming languages.\n" +
                "C++ can be found in today's operating systems, Graphical User Interfaces, and embedded systems.");
        courseRepository.save(c);
        CourseLinks cl=new CourseLinks();
        cl.setCourse(c);
        cl.setLink("https://github.com/sj467-jena/hackathon");
        cl.setDescription("This website will offer ble ble ble");
        courseLinksRepository.save(cl);
        c.setLinks(List.of(cl));
        courseRepository.save(c);

        c=new Course();
        c.setTitle("React");
        c.setDescription("A powerful frontend framework");
        courseRepository.save(c);

        c=new Course();
        c.setTitle("Java");
        c.setDescription("Best language in the world");
        courseRepository.save(c);

        c=new Course();
        c.setTitle("Python");
        c.setDescription("snake");
        courseRepository.save(c);

    }
}
