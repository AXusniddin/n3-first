package uz.nt.firstspring.project.student.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private Integer id;
    private Integer age;
    private String name;
    private String birthDate;
    private String course;
}
