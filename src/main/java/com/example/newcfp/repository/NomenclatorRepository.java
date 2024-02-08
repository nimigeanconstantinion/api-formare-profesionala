package com.example.newcfp.repository;

import com.example.newcfp.model.Nomenclator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomenclatorRepository extends JpaRepository<Nomenclator,Long> {
}
