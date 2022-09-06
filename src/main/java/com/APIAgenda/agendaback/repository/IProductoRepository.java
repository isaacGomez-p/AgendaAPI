package com.APIAgenda.agendaback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIAgenda.agendaback.entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{

	
	List<Producto> findAllByUser_Id(Long idUser);

}