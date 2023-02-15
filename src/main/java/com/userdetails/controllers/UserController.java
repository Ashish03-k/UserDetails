package com.userdetails.controllers;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.entities.Users;
import com.userdetails.services.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	// To save user details in database
	
	@PostMapping("/save")
	public String  saveUser(@RequestBody Users users) {
		userservice.saveUser(users);
		return "user "+users.getUserName()+" saved successfully in database";
	}
   
	// To retrieve all user details from database
	
	@GetMapping("/getall")
	public List<Users> getAllUser(){
		List<Users> user = userservice.getUser();
		return user;
		
	}
	
	// To retrieve n number of user details provided as a parameter
	
	@GetMapping("/getbylimit/{limit}")
	public Stream<Users> getByLimit(@PathVariable int limit){
		Stream<Users> user=userservice.getByLimit(limit);
				return user;
		
	}
	
	// To retrieve user details whose age is more than n. i.e. more than provided parameterized age 
	
	@GetMapping("/age/{age}")
	public List<Users> getByAge(@PathVariable int age){
		List<Users> user = userservice.getByAge(age);
		return user;
		
	}
	
	// To retrieve user details based on id. i.e. user name
	
	@GetMapping("/getbyname/{name}")
	public Users getByName(@PathVariable String name) {
		Users byName = userservice.getByName(name);
		return byName;
		
	}
	
	
	
}
