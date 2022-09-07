package com.APIAgenda.agendaback.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.APIAgenda.agendaback.entity.ApiResponse;
import com.APIAgenda.agendaback.entity.User;
import com.APIAgenda.agendaback.service.AgricultorService;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class AgricultorController {
	
	@Autowired
	AgricultorService service;

	@PostMapping("/validation")
	public ResponseEntity<?> login(@RequestBody User user){
		return new ResponseEntity<ApiResponse>(service.login(user), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> guardarAgricultor(@RequestBody User user){
		return new ResponseEntity<User>(service.guardarAgricultor(user), HttpStatus.OK);
	}
	
	@GetMapping("/getById")
	public ResponseEntity<?> getById(@RequestParam Long userId){
		return new ResponseEntity<User>(service.getUserById(userId), HttpStatus.OK);
	}
	
}