package com.APIAgenda.agendaback.Controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APIAgenda.agendaback.entity.Siembra;
import com.APIAgenda.agendaback.service.SiembraService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/plantingMap")
public class SiembraController {
	
	@Autowired
	SiembraService service;
	
	@PostMapping(value="/save")
	public ResponseEntity<?> guardarSiembra(@RequestBody Siembra siembra){
		return new ResponseEntity<Siembra>(service.guardarSiembra(siembra), HttpStatus.CREATED);
	}
	
	@GetMapping(value="/AGD_Plano_de_siembra/{idFinca}")
	public ResponseEntity<?> getAllSiembrasFinca(@PathParam(value="idFinca") Long idFinca){
		return new ResponseEntity<List<Siembra>>(service.getSiembraByIdFinca(idFinca), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/AGD_Plano_de_siembra")
	public ResponseEntity<?> deleteSiembra(@PathVariable(name = "plano_id") Long idSiembra){
		service.deleteSiembra(idSiembra);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
