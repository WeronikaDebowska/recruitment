package com.testJava.recruitment.DAO;

import com.testJava.recruitment.Model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorDAO extends JpaRepository<Actor, Long> {
}