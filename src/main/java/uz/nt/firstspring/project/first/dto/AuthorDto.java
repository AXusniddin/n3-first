package uz.nt.firstspring.project.first.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuthorDto {
        private Integer Id;

        private String name;

        private String lastname;

        private String bithrday;

}
