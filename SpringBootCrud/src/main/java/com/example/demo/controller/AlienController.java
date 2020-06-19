package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alien;
import com.example.demo.repo.Alienrepo;

@RestController
public class AlienController {
	
	
	//get object of Alienrepo class
	@Autowired
	Alienrepo alienrepo;
	
	//inset date into database
	
	
	@PostMapping("/alienadd")
	public String inserAlien(@RequestBody Alien alien)
	{
		alienrepo.save(alien);
		return "your data successfully saved";
	}
	
	//get all data from database
	@GetMapping("/getdata")
	public List<Alien> getAll()
	{
		
		List<Alien> list = alienrepo.findAll();
		return list; 
	}
	
	//get user by id
	@GetMapping("/getalienbyid/{id}")
	public Optional<Alien> getAlienByid(@PathVariable("id") Integer id)
	{
		return alienrepo.findById(id);
	}
	
	//get user by name
	@GetMapping("/getalienbyname/{name}")
	public List<Alien> getAlienname(@PathVariable("name") String name)
	{
		return 	(List<Alien>)alienrepo.findByname(name);
	}
	
	//delete user by id
	@DeleteMapping("/getdelete/{id}")
	public Alien deleteAlien(@PathVariable Integer id)
	{
		Alien alien = alienrepo.getOne(id);
		 alienrepo.delete(alien);
		 return alien;
	
	}
	
	//update user
	@PutMapping("/updateAlien/{id}")
	public Alien updateAlien(@PathVariable Integer id)
	{
		Alien alienUpdate = alienrepo.findById(id).get();
		alienUpdate.setLastname("patel");
		alienUpdate.setName("Krishna");
		alienrepo.save(alienUpdate);
		return alienUpdate;	
	}

}
 