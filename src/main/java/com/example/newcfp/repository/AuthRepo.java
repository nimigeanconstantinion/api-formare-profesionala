package com.example.newcfp.repository;

import com.example.newcfp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepo extends JpaRepository< Author,Long> {
}
