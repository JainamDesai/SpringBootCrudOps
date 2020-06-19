package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


import com.example.demo.model.Alien;
@Component


//jpa Repository use for crud oppration.

//It is one Repository in which multiple methodes are vailable.
public interface Alienrepo extends JpaRepository<Alien,Integer> {
	
	
	
	public List<Alien> findByname(String name);
	
	

}
