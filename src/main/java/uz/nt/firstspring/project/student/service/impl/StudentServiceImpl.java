package uz.nt.firstspring.project.student.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import uz.nt.firstspring.project.student.dto.ResponseDto;
import uz.nt.firstspring.project.student.dto.StudentDto;
import uz.nt.firstspring.project.student.entity.Student;
import uz.nt.firstspring.project.student.respository.StudentRepository;
import uz.nt.firstspring.project.student.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public ResponseDto addStudent(StudentDto studentDto){
        Student student = Student.builder()
                .age(studentDto.getAge())
                .birthDate(studentDto.getBirthDate())
                .course(studentDto.getCourse())
                .name(studentDto.getName())
                .id(studentDto.getId())
                .build();

        studentRepository.save(student);

        return ResponseDto.builder()
                .code(0)
                .success(true)
                .message("Successfully saved")
                .build();
    }

    @Override
    public List<StudentDto> getStudents(){

        List<Student> students  = studentRepository.findAll();
        return students.stream()
                .map(s -> StudentDto.builder()
                        .age(s.getAge())
                        .birthDate(s.getBirthDate())
                        .course(s.getCourse())
                        .name(s.getName())
                        .id(s.getId())
                        .build())
                    .collect(Collectors.toList());
    }

    @Override
    public ResponseDto updateStudent(@RequestBody StudentDto studentDto){
//        for(StudentDto s : students){
//            if(s.getId().equals(studentDto.getId())){
//                if(studentDto.getName() != null) s.setName(studentDto.getName());
//                if(studentDto.getAge() != null) s.setAge(studentDto.getAge());
//                if(studentDto.getCourse() != null) s.setCourse(studentDto.getCourse());
//                if(studentDto.getBirthDate() != null) s.setBirthDate(studentDto.getBirthDate());
//
//                return ResponseDto.builder()
//                        .code(0)
//                        .success(true)
//                        .message("Successfully updated!")
//                        .build();
//            }
//        }

        return ResponseDto.builder()
                .code(-1)
                .success(false)
                .message("Data not found!")
                .build();
    }

    @Override
    public ResponseDto deleteStudent(Integer id) {
//        for(StudentDto student : students){
        boolean deleted = false;
//            if(student.getId().equals(id)){
//                students.remove(student);
//                return ResponseDto.builder()
//                        .code(0)
//                        .success(true)
//                        .message("Successfully updated!")
//                        .build();
//            }
//        }


        return deleted ? ResponseDto.builder()
                .code(0)
                .success(true)
                .message("Successfully updated!")
                .build()
                :
                ResponseDto.builder()
                .code(-1)
                .success(false)
                .message("Data not found!")
                .build();
    }

}
