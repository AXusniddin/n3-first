package uz.nt.firstspring.project.first.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Integer id;

    private String name;

    private String AuthorName;

    private Double price;
}
