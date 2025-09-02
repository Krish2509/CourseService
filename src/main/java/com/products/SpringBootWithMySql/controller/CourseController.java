package com.products.SpringBootWithMySql.controller;


import com.products.SpringBootWithMySql.entity.Course;
import com.products.SpringBootWithMySql.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        var status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/course/{courseID}")
    public ResponseEntity<Course> getCourseById(@PathVariable Integer courseId) {
        var course = courseService.getById(courseId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        var allCourses = courseService.getAllCourses();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }

    @PutMapping("/course")
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        var status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("/course/{courseID}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer courseId) {
        var status = courseService.deleteById(courseId);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }


}
