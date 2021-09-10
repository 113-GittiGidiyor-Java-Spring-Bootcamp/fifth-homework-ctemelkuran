package dev.patika.schoolmanagementhw05.exceptions;

public class InstructorIsAlreadyExistException extends RuntimeException{
    public InstructorIsAlreadyExistException(String message) {
        super(message);
    }
}
