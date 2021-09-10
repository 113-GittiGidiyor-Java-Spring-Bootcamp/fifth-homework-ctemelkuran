package dev.patika.schoolmanagementhw05.mappers;

import dev.patika.schoolmanagementhw05.dto.ExceptionLoggerDTO;
import dev.patika.schoolmanagementhw05.entity.ExceptionLogger;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExceptionLoggerMapper {
    ExceptionLogger fromExceptionLoggerToDto(ExceptionLoggerDTO exceptionLoggerDTO);
}
