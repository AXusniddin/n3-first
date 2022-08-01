package uz.nt.firstspring.project.student.service;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;
import uz.nt.firstspring.project.student.dto.ResponseDto;
import uz.nt.firstspring.project.student.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {


    ResponseDto addStudent(StudentDto studentDto);


    List<StudentDto> getStudents();

    ResponseDto updateStudent(StudentDto studentDto);

   ResponseDto deleteStudent(Integer id);


}
