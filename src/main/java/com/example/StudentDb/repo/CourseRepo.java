package com.example.StudentDb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentDb.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {

}
