package com.example.hackathonbackend.domain;

import jakarta.persistence.*;
import jdk.jfr.ContentType;

@Entity
@Table
public class CourseLinks {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String link;
        private String description;

        @ManyToOne
        @JoinColumn
        private Course course;

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public Course getCourse() {
            return course;
        }

        public void setCourse(Course course) {
            this.course = course;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

}
