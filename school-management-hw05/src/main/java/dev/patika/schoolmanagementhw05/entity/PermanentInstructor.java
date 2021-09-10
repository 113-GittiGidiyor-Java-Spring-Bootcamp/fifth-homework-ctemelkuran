package dev.patika.schoolmanagementhw05.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PermanentInstructor extends Instructor{
    private double fixedSalary;

}
