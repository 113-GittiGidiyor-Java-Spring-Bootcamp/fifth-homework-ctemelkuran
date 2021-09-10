package dev.patika.schoolmanagementhw05.controller;

import dev.patika.schoolmanagementhw05.entity.ExceptionLogger;
import dev.patika.schoolmanagementhw05.entity.Instructor;
import dev.patika.schoolmanagementhw05.service.ExceptionLoggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/exception-logs")
public class ExceptionLoggerController {


    private final ExceptionLoggerService exceptionLoggerService;


    @GetMapping
    public ResponseEntity<List<ExceptionLogger>> findAll(){
        return new ResponseEntity<>(exceptionLoggerService.findAll(), HttpStatus.OK);
    }

}
