package dev.patika.schoolmanagementhw05.mappers;

import dev.patika.schoolmanagementhw05.dto.StudentDTO;
import dev.patika.schoolmanagementhw05.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student mapFromStudentDTOtoStudent(StudentDTO studentDTO);
    StudentDTO mapFromStudentToStudentDTO(Student student);
}
