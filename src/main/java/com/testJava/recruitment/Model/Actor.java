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

    /**
     * @return the nconst
     */
    public String getNconst() {
        return nconst;
    }

    /**
     * @return the primaryName
     */
    public String getPrimaryName() {
        return primaryName;
    }

    /**
     * @return the birthYear
     */
    public Integer getBirthYear() {
        return birthYear;
    }

    /**
     * @return the deathYear
     */
    public Integer getDeathYear() {
        return deathYear;
    }

    /**
     * @return the knownForTitles
     */
    public String getKnownForTitles() {
        return knownForTitles;
    }

    /**
     * @return the primaryProfession
     */
    public String getPrimaryProfession() {
        return primaryProfession;
    }
}