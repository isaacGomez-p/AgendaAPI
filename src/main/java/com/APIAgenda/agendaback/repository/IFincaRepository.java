package com.APIAgenda.agendaback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIAgenda.agendaback.entity.Finca;

@Repository
public interface IFincaRepository extends JpaRepository<Finca, Long>{

	
	List<Finca> findAllByUser_Id(Long id);

}