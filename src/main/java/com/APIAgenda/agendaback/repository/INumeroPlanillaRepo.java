package com.APIAgenda.agendaback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIAgenda.agendaback.entity.NumeroPlanilla;

@Repository
public interface INumeroPlanillaRepo extends JpaRepository<NumeroPlanilla, Long>{

	
	List<NumeroPlanilla> findAllByUser_Id(Long idUser);
	
}
