package uz.nt.firstspring.project.first.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Author {
    private Integer Id;

    private String name;

    private String lastname;

    private String bithrday;
}
