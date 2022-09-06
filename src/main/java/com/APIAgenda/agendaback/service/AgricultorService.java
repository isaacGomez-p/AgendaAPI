package com.APIAgenda.agendaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIAgenda.agendaback.entity.ApiResponse;
import com.APIAgenda.agendaback.entity.User;
import com.APIAgenda.agendaback.repository.IAgricultorRepository;

@Service
public class AgricultorService {

	@Autowired
	IAgricultorRepository userRepo;
	
	public ApiResponse login(User user) {
		return null;
	}
	
	public List<User> getAllAgricultor(Long id) {
		return userRepo.findAll();
	}
	
	public User getUserById(Long id) {
		return userRepo.findById(id).get();
	}
	
	public User guardarAgricultor(User user) {
		return userRepo.save(user);
	}
	
	public User actualizarAgricultor(User user, Long id) {
		User agricultor = getUserById(id);
		agricultor.setCity(user.getCity());
		agricultor.setDept(user.getDept());
		agricultor.setDocument(user.getDocument());
		agricultor.setEmail(user.getEmail());
		agricultor.setFirstName(user.getFirstName());
		agricultor.setLastName(user.getLastName());
		agricultor.setProducts(user.getProducts());
		agricultor.setStatus(user.getStatus());
		agricultor.setPassword(user.getPassword());
		return userRepo.save(agricultor);
	}
}
