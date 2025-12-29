package com.example.coursecrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    // Custom query methods
    List<Course> findByInstructor(String instructor);

    List<Course> findByIsAvailable(Boolean isAvailable);

    List<Course> findByPriceLessThan(Double price);

    List<Course> findByTitleContainingIgnoreCase(String keyword);

    List<Course> findByDurationGreaterThan(Integer duration);
}