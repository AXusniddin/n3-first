package uz.nt.firstspring.project.first.controller;

import org.springframework.web.bind.annotation.*;
import uz.nt.firstspring.project.first.dto.BookDto;
import uz.nt.firstspring.project.first.model.Author;
import uz.nt.firstspring.project.first.model.Book;
import uz.nt.firstspring.project.student.dto.ResponseDto;

import java.util.ArrayList;
import java.util.List;

@RestController("/book")
public class BookController {

    private List<Book> books = new ArrayList();
    private List<Author> authors = new ArrayList();

    @GetMapping("/getBookId")
    public BookDto getById(@RequestParam Integer id){
        books.add(new Book(1, "Halol luqma", 1,500000D));
        books.add(new Book(2, "Piyoz nega xomush", 4, 400000D));
        books.add(new Book(3, "7 qavat", 2,  300000D));

        authors.add(new Author(1, "Rauf", "Jidasu", "1956"));
        authors.add(new Author(2, "O'tkir", "Xoshimov", "1965"));
        authors.add(new Author(3, "Abdulla ", "Qodiriy", "1894"));
        authors.add(new Author(4, "Hoshimjon", "Akbarov", "1999"));


        for(Book book : books){
            if(book.getId() == id){
                for(Author author : authors) {
                    if (id == author.getId()) ;
                    return new BookDto(book.getId(), book.getName(), author.getName() + " " + author.getLastname(), book.getPrice());
                }
            }
        }

        return null;

    }


//    @GetMapping("/allbook")
//    public BookDto allBook(){
//
//    }

}
