package dev.patika.schoolmanagementhw05.exceptions;

public class StudentAgeNotValidException extends RuntimeException{
    public StudentAgeNotValidException(String message) {
        super(message);
    }
}
