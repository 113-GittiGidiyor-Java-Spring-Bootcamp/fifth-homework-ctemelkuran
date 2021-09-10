package dev.patika.schoolmanagementhw05.exceptions;

public class CourseIsAlreadyExistException extends RuntimeException{
    public CourseIsAlreadyExistException(String message) {
        super(message);
    }
}
