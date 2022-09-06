package com.APIAgenda.agendaback.Controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APIAgenda.agendaback.entity.Finca;
import com.APIAgenda.agendaback.service.FincaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/land")
public class FincaController {

	@Autowired
	FincaService service;
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarLand(@RequestBody Finca finca){
		return new ResponseEntity<Finca>(service.guardarFinca(finca), HttpStatus.CREATED);
	}
	
	@PutMapping(value="/AGD_FINCA/{id}")
	public ResponseEntity<?> actualizarFinca(@PathParam(value = "id")Long id, @RequestBody Finca finca){
		return new ResponseEntity<Finca>(service.actualizarFinca(finca, id), HttpStatus.OK);
	}
	
	@GetMapping(value = "/list/{userId}")
	public ResponseEntity<?> obtenerTodasFincasByUserId(@PathVariable(name = "userId") Long userId){
		return new ResponseEntity<List<Finca>>(service.getAllFincas(userId), HttpStatus.OK);
	}
}

