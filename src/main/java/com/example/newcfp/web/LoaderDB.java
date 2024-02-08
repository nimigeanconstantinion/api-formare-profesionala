package com.example.newcfp.web;

import com.example.newcfp.model.*;
import com.example.newcfp.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/loader")
@Slf4j
public class LoaderDB {
    private NomenclatorRepository nomenclatorRepository;
    private LocalitateRepository localitateRepository;

    private AuthRepo authRepo;
    private BookRepo bookRepo;
    private RecenziiRepo recenziiRepo;
    public LoaderDB(NomenclatorRepository nomenclatorRepository,
                    LocalitateRepository localitateRepository,
                    AuthRepo authRepo,BookRepo bookRepo,RecenziiRepo recenziiRepo){
        this.nomenclatorRepository=nomenclatorRepository;
        this.localitateRepository=localitateRepository;
        this.authRepo=authRepo;
        this.bookRepo=bookRepo;
        this.recenziiRepo=recenziiRepo;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/nomenclator/addbulk")
    public ResponseEntity<List<Nomenclator>> addBulkNomenclator(@RequestBody List<Nomenclator> nom){
        try{
            nomenclatorRepository.saveAll(nom);
            return ResponseEntity.ok(nom);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/siruta/addbulk")
    public ResponseEntity<List<Localitate>> addBulkLoca(@RequestBody List<Localitate> nom){
        try{

            localitateRepository.saveAll(nom);
            return ResponseEntity.ok(nom);
        }catch (RuntimeException e){
            throw e;
        }
    }


    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/test")
    public ResponseEntity<Author> addTest(){
        try{

            Author a=new Author();
            a.setBooks(new ArrayList<>());
            Book b=new Book();
            b.setRecenziiList(new ArrayList<>());
            Recenzii r=new Recenzii();
            r.setObs("lwkqlkelk");
            b.setTitle("toimfm");
            b.addRecenzie(r);
            a.setName("Ionescu");
            a.addBook(b);
            authRepo.save(a);
            return ResponseEntity.ok(a);

        }catch (RuntimeException e){
            throw e;
        }
    }
}
