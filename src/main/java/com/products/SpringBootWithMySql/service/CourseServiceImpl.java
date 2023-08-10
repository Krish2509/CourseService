package com.products.SpringBootWithMySql.service;

import com.products.SpringBootWithMySql.entity.Course;
import com.products.SpringBootWithMySql.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;
    @Override
    public String upsert(Course course) {
        courseRepository.save(course);
        return "Success";
    }

    @Override
    public Course getById(Integer courseId) {
        Optional<Course> findById = courseRepository.findById(courseId);
        return findById.orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public String deleteById(Integer courseId) {
        if (courseRepository.existsById(courseId)) {
            courseRepository.deleteById(courseId);
            return "Deleted Successfully";
        } else {
            return "No Record Found";
        }
    }
}
