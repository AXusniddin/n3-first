package uz.nt.firstspring.project.student.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nt.firstspring.project.student.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByAge(Integer age);
}
