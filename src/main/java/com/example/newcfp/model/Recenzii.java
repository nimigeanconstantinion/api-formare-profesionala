package com.example.newcfp.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "Recenzie")
@Table(name = "recenzie")
public class Recenzii {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "rec_gen")
    @SequenceGenerator(name = "rec_gen",initialValue = 1)
    private long id;

    private String obs;
}
