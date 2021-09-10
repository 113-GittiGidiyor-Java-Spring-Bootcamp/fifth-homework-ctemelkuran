package dev.patika.schoolmanagementhw05.service;

import dev.patika.schoolmanagementhw05.entity.ExceptionLogger;
import dev.patika.schoolmanagementhw05.entity.Instructor;
import dev.patika.schoolmanagementhw05.mappers.ExceptionLoggerMapper;
import dev.patika.schoolmanagementhw05.repository.ExceptionLoggerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExceptionLoggerService {
    private final ExceptionLoggerRepository exceptionLoggerRepository;
    private final ExceptionLoggerMapper exceptionLoggerMapper;

    public Optional<ExceptionLogger> createLog(ExceptionLogger exceptionLogger){
        return Optional.of(exceptionLoggerRepository.save(exceptionLogger));
    }

    public List<ExceptionLogger> findAll() {
        List<ExceptionLogger> exceptionLoggerList = new ArrayList<>();
        Iterable<ExceptionLogger> exceptionLoggerIterable = exceptionLoggerRepository.findAll();
        exceptionLoggerIterable.iterator().forEachRemaining(exceptionLoggerList::add);
        return exceptionLoggerList;

    }
/*
    public List<ExceptionLoggerDTO> findAllLogsOrderedByDate(){
        return exceptionLoggerRepository.findAllBy
    }*/
}
