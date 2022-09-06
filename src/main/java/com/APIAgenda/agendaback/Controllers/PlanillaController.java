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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APIAgenda.agendaback.entity.NumeroPlanilla;
import com.APIAgenda.agendaback.entity.Planilla;
import com.APIAgenda.agendaback.service.PlanillaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/spreedsheet")
public class PlanillaController {

	@Autowired
	PlanillaService service;
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarPlanilla(@RequestBody Planilla planilla){
		return new ResponseEntity<Planilla>(service.guardarPlanilla(planilla), HttpStatus.CREATED);
	}
	
	@PutMapping(value="/list/{id}")//TODO revisar nombre 
	public ResponseEntity<?> putPlanilla(@PathParam(value = "id") Long id, @RequestBody Planilla planilla){
		return new ResponseEntity<Planilla>(service.actualizarPlanilla(planilla, id), HttpStatus.OK);
	}
	
	@PostMapping("/AGD_N_Planilla")
	public ResponseEntity<?> guardarNumPlanilla(@RequestBody NumeroPlanilla numeroPlanilla){
		return new ResponseEntity<NumeroPlanilla>(service.guardarNumeroPlanilla(numeroPlanilla), HttpStatus.CREATED);
	}
	
	@GetMapping("/AGD_N_Planilla/{idUser}")
	public ResponseEntity<?> obtenerPlanillasByUser(@PathParam(value = "idUser") Long idUser){
		return new ResponseEntity<List<NumeroPlanilla>>(service.getAllNumerosPlanillaByUser(idUser), HttpStatus.OK);
	}
	
	@GetMapping(value="/AGD_Planilla_de_aplicacion/{id}")
	public ResponseEntity<?> obtenerPlanillasById(@PathParam(value="id") Long id){
		return new ResponseEntity<List<Planilla>>(service.getAllPlanillas(id), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/AGD_Planilla_de_aplicacion/{planilla_id}")
	public ResponseEntity<?> borrarPlanilla(@PathVariable(name = "planilla_id") Long idPlanilla){
		service.deletePlanilla(idPlanilla);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
