package com.example.hackathonbackend;

import com.example.hackathonbackend.domain.Course;
import com.example.hackathonbackend.repos.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackathonBackendApplication implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(HackathonBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course c=new Course();
        c.setTitle("C++");
        c.setDescription("C++ can be found in today's operating systems, Graphical User Interfaces, and embedded systems.\n" +
                "C++ is an object-oriented programming language which gives a clear structure to programs and allows code to be reused, lowering development costs.");
        courseRepository.save(c);

        c=new Course();
        c.setTitle("Java");
        c.setDescription("The best language in the world");
        courseRepository.save(c);

        c=new Course();
        c.setTitle("Python");
        c.setDescription("snake");
        courseRepository.save(c);

        c=new Course();
        c.setTitle("JavaScript");
        c.setDescription("JavaScript");
        courseRepository.save(c);
    }
}
