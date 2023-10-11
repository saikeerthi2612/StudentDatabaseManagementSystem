package com.example.StudentDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDb.entity.Course;

import com.example.StudentDb.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@PostMapping("/add")
	public Course addCourse(@RequestBody Course course) {
		return courseservice.saveCourse(course);
	}
	
	@GetMapping("/getCourse/{id}")
	public Course getCourseById(@PathVariable Long cId) {
		return courseservice.getById(cId);
	}
	
	@GetMapping("/getAll")
	public List<Course> fetchAllCourse() {
		return courseservice.getAllCourses();
	}
	
	@PutMapping("/updateCourse")
	public Course updateCourseDetails(@RequestBody Course course) {
		return courseservice.updateCourseDetails(course);
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public void deleteCourse(@PathVariable Long id) {
		 courseservice.deleteCourse(id);
	}
	

}
