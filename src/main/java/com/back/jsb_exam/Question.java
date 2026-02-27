package com.back.jsb_exam;

import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject;
    private String content;


}
