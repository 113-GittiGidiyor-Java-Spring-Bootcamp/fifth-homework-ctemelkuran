package dev.patika.schoolmanagementhw05.mappers;

import dev.patika.schoolmanagementhw05.dto.InstructorDTO;
import dev.patika.schoolmanagementhw05.entity.Instructor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface InstructorMapper {

    Instructor mapFromInstructorDTOtoInstructor(InstructorDTO instructorDTO);
    InstructorDTO mapFromInstructorToInstructorDTO(Instructor instructor);

}
