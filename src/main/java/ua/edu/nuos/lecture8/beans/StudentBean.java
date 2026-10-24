package ua.edu.nuos.lecture8.beans;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ua.edu.nuos.lecture8.entity.Student;
import ua.edu.nuos.lecture8.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class StudentBean {

    StudentRepository repository;

    public void generateStudents() {
        var students = new ArrayList<Student>();
        students.add(new Student("John", "Doe", 20, 74.5));
        students.add(new Student("Jane", "Doe", 21, 84.5));
        students.add(new Student("Piter", "Parker", 22, 94.5));
        students.add(new Student("Alice", "Dan", 23, 68.5));

        repository.saveAll(students);
    }

    public List<Student> findAllByFirstName(String firstName) {
        return repository.findAllByFirstName(firstName);
    }

    public List<Student> findAllByFirstNameStartingWith(String prefix) {
        return repository.findAllByFirstNameStartingWith(prefix);
    }

    public List<Student> findByRatingBetween(Double ratingStart, Double ratingEnd) {
        return repository.findByRatingBetween(ratingStart, ratingEnd);
    }
}
