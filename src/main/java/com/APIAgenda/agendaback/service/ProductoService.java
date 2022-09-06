package com.APIAgenda.agendaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIAgenda.agendaback.entity.Producto;
import com.APIAgenda.agendaback.repository.IProductoRepository;

@Service
public class ProductoService {

	@Autowired
	IProductoRepository productoRepo;
	
	public Producto guardarProducto(Producto producto) {
		return productoRepo.save(producto);
	}
	
	public Producto actualizarProducto(Producto producto, Long id) {
		Producto oldProducto = productoRepo.findById(id).get();
		oldProducto.setCode(producto.getCode());
		oldProducto.setName(producto.getName());
		oldProducto.setProduct_id(producto.getProduct_id());
		oldProducto.setVariety(producto.getVariety());
		return productoRepo.save(oldProducto);
	}
	
	public List<Producto> getAllProductoByUserId(Long idUser){
		return productoRepo.findAllByUser_Id(idUser);
	}
	
	public void deleteProducto(Long idProducto) {
		Producto producto = productoRepo.findById(idProducto).get();
		productoRepo.delete(producto);
	}
}
