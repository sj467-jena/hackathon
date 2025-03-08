package com.example.hackathon.repos;

import com.example.hackathon.domain.CourseLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseLinksRepository extends JpaRepository<CourseLinks, Integer> {
}
