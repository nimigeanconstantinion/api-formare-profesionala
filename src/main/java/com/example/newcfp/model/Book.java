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

Book

{

    @Id


    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String title;

//    @ManyToMany
//    @JoinTable(
//            name = "books_authors",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id")
//    )
//
//
//    private List<Author> authors;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Recenzii> recenziiList=new ArrayList<>();

    public void addRecenzie(Recenzii rec){
        this.recenziiList.add(rec);


    }
}
