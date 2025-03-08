package com.example.hackathon.domain;

import jakarta.persistence.*;
import jdk.jfr.ContentType;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<CourseLinks> links=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CourseLinks> getLinks() {
        return links;
    }

    public void setLinks(List<CourseLinks> links) {
        this.links = links;
    }
}
