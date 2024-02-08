package com.example.newcfp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity

public

class

Author

{

    @Id


    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String name;

    public void addBook(Book book){
        this.books.add(book);

    }

//    @ManyToMany(mappedBy = "authors")
//
//
//    private List<Book> books;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books=new ArrayList<>();
}
