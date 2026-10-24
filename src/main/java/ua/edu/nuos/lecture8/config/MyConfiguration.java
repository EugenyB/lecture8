package ua.edu.nuos.lecture8.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.edu.nuos.lecture8.beans.StudentBean;
import ua.edu.nuos.lecture8.entity.Student;

import java.util.List;

@Configuration
class MyConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(StudentBean studentBean) {
        return args -> {
            //studentBean.generateStudents();

//            List<Student> students = studentBean.findAllByFirstNameStartingWith("J");
            List<Student> students = studentBean.findByRatingBetween(77.0, 99.0);
            students.forEach(s-> {
                System.out.println(s.getFirstName() + " " + s.getLastName() +" "+ s.getGroup().getName());
            });
        };
    }
}
