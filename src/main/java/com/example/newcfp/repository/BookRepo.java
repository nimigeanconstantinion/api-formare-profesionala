package com.example.newcfp.repository;

import com.example.newcfp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
