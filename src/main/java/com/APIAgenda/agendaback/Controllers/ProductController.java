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

import com.APIAgenda.agendaback.entity.Producto;
import com.APIAgenda.agendaback.service.ProductoService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

	@Autowired
	ProductoService service;

	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarProducto(@RequestBody Producto producto){
		return new ResponseEntity<Producto>(service.guardarProducto(producto), HttpStatus.CREATED);
	}
	
	@PutMapping(value="/AGD_Producto/{id}")
	public ResponseEntity<?> actualizarProducto(@PathParam(value = "id") Long id, @RequestBody Producto producto){
		return new ResponseEntity<Producto>(service.actualizarProducto(producto, id), HttpStatus.OK);
	}
	
	@GetMapping(value="/AGD_Producto/{idUser}")
	public ResponseEntity<?> obtenerTodosProductosUser(@PathParam(value="idUser")Long iduser){
		return new ResponseEntity<List<Producto>>(service.getAllProductoByUserId(iduser), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/AGD_Producto/{producto_id}")
	public ResponseEntity<?> deleteProducto(@PathVariable(name = "producto_id") Long id){
		service.deleteProducto(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
