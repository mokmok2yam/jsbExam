package com.back.jsb_exam;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String content;
    @ManyToOne
    private Question question;


}
