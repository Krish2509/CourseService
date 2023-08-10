package com.products.SpringBootWithMySql.service;


import com.products.SpringBootWithMySql.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    public String upsert(Course course);
    public Course getById(Integer courseId);
    public List<Course> getAllCourses();
    public String deleteById(Integer courseId);

}
