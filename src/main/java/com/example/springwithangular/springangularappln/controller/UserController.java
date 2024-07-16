package com.example.springwithangular.springangularappln.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springwithangular.springangularappln.model.User;
import com.example.springwithangular.springangularappln.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	private final UserRepository userrepo;

	public UserController(UserRepository userrepo) {
		super();
		this.userrepo = userrepo;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		List<User> users = (List<User>) userrepo.findAll();
		return users;
	}
	
	@PostMapping("/users")
	public void saveUser(@RequestBody User user) {
		userrepo.save(user);
	}
}
