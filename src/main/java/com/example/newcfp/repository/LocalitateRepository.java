package com.example.newcfp.repository;

import com.example.newcfp.model.Localitate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalitateRepository extends JpaRepository<Localitate,Long> {
}
