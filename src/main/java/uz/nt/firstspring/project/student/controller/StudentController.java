package uz.nt.firstspring.project.student.controller;

import org.springframework.web.bind.annotation.*;
import uz.nt.firstspring.project.student.dto.ResponseDto;
import uz.nt.firstspring.project.student.dto.StudentDto;
import uz.nt.firstspring.project.student.service.impl.StudentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentServiceImpl service;

    public StudentController(StudentServiceImpl studentService) {
        this.service = studentService;
    }

    @PostMapping
    public ResponseDto addStudent(@RequestBody StudentDto studentDto){
      return service.addStudent(studentDto);
    }

    @GetMapping
    public List<StudentDto> getStudents(){
        return service.getStudents();
    }

    //Patch - Put
    @PatchMapping
    public ResponseDto updateStudent(@RequestBody StudentDto studentDto){
        return service.updateStudent(studentDto);
    }

    @DeleteMapping("/{id}")
    public ResponseDto deleteStudent(@PathVariable Integer id) {
        return service.deleteStudent(id);
    }

}

