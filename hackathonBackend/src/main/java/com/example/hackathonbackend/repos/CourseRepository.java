package com.example.hackathonbackend.repos;

import com.example.hackathonbackend.domain.Course;
import com.example.hackathonbackend.domain.CourseLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query("SELECT c FROM Course c WHERE LOWER(c.title) LIKE %:query% OR LOWER(c.description) LIKE %:query%")
    public List<CourseLinks> findByQuery(String query);
}
