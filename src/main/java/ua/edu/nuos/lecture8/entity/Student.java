package ua.edu.nuos.lecture8.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private Double rating;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public Student(String firstName, String lastName, Integer age, Double rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rating = rating;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }
}