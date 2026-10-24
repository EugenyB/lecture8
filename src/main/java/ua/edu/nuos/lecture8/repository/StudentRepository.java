package ua.edu.nuos.lecture8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.nuos.lecture8.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByFirstName(String lastName);

    List<Student> findAllByFirstNameStartingWith(String prefix);

    List<Student> findByRatingBetween(Double ratingStart, Double ratingEnd);

}