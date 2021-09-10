package dev.patika.schoolmanagementhw05.mappers;

import dev.patika.schoolmanagementhw05.dto.CourseDTO;
import dev.patika.schoolmanagementhw05.entity.Course;
import dev.patika.schoolmanagementhw05.service.CourseService;
import dev.patika.schoolmanagementhw05.service.InstructorService;
import dev.patika.schoolmanagementhw05.service.StudentService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

// MapStruct has the best average working time
@Mapper (componentModel = "spring")
public abstract class CourseMapper {

    @Autowired
    protected CourseService courseService;

    @Autowired
    protected StudentService studentService;

    @Autowired
    protected InstructorService instructorService;

    /**
     *
     * @param courseDTO gets converted to
     * @return Course entity
     */
    // target is the students attribute in Course entity
    @Mapping(target = "students", expression = "java(courseService.findAllStudentsByStudentId(courseDTO.getEnrolledStudentIds()))")
    @Mapping(target = "instructor", expression = "java(courseDTO.getInstructorId())")
    public abstract Course mapFromCourseDTOtoCourse(CourseDTO courseDTO);

    public abstract CourseDTO mapFromCourseToCourseDTO(Course course);

 /*   @Mapping(target = "courseInstructor", expression = "java((instructorService.getCourseInstructorById(courseDTO.getInstructorId())))")
    @Mapping(target = "courseStudents",expression = "java(studentService.findAllCourseStudentsById(courseDTO.getStudentIds()))")*/
}
