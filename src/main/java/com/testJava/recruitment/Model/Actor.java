package com.testJava.recruitment.Model;

import javax.persistence.*;

@Entity
@Table(name = "Actor")
public class Actor {

    @Id
    String nconst;
    String primaryName;
    Integer birthYear;
    Integer deathYear;
    String primaryProfession;
    String knownForTitles;
}