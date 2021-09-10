package dev.patika.schoolmanagementhw05.repository;

import dev.patika.schoolmanagementhw05.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    /**
     * @param phoneNumber is unique for every instructor
     * @return boolean if instructor's phone number exists or not
     *
     * @author ctemelkuran
     */
    boolean existsInstructorByPhoneNumber(String phoneNumber);

}
