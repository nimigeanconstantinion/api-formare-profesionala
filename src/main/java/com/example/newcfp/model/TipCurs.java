package com.example.newcfp.model;

public enum TipCurs {
    T1("competente comune"),
    T2("perfectionare"),
     T3("specializare"),
     T4("initiere"),
             T5("calificare");
    private String label;
    private TipCurs(String label){
        this.label=label;
    }

}
