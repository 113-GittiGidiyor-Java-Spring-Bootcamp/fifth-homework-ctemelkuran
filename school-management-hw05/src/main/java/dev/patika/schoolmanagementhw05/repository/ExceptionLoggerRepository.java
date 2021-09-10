package dev.patika.schoolmanagementhw05.repository;

import dev.patika.schoolmanagementhw05.entity.ExceptionLogger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExceptionLoggerRepository extends JpaRepository<ExceptionLogger, Long> {
    List<ExceptionLogger> findExceptionLoggersByExceptionType(String exceptionType);
}
