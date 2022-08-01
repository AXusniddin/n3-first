package uz.nt.firstspring.project.student.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {
    private int code;
    private boolean success;
    private String message;
}
