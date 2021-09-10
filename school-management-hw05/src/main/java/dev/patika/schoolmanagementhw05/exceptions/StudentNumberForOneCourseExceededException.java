package dev.patika.schoolmanagementhw05.exceptions;

public class StudentNumberForOneCourseExceededException extends RuntimeException{
    public StudentNumberForOneCourseExceededException(String message) {
        super(message);
    }
}
