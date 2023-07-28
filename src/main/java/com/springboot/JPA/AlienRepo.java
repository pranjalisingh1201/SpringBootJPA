package com.springboot.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.JPA.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
