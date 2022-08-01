package uz.nt.firstspring.project.first.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;

    private String name;

    private Integer AuthorId;

    private Double price;
}
