package dev.patika.schoolmanagementhw05.repository;

import dev.patika.schoolmanagementhw05.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("SELECT " +
            "  CASE " +
            "   WHEN " +
            "       COUNT(c)>0 " +
            "   THEN " +
            "       TRUE " +
            "   ELSE " +
            "       FALSE " +
            "   END " +
            "FROM Course c " +
            "WHERE c.courseCode = :courseCode")
    boolean selectExistsCourseCode(String courseCode);

}
