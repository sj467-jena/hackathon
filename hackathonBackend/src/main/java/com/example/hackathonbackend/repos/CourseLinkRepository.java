package com.example.hackathonbackend.repos;

import com.example.hackathonbackend.domain.Course;
import com.example.hackathonbackend.domain.CourseLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseLinkRepository extends JpaRepository<Course, Integer> {
}


