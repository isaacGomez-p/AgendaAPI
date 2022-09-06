package com.APIAgenda.agendaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIAgenda.agendaback.entity.Finca;
import com.APIAgenda.agendaback.repository.IFincaRepository;

@Service
public class FincaService {

	@Autowired
	IFincaRepository fincaRepo;
	
	public Finca guardarFinca(Finca finca) {
		return fincaRepo.save(finca);
	}
	
	public Finca actualizarFinca(Finca finca, Long id) {
		Finca oldFinca = fincaRepo.findById(id).get();
		oldFinca.setAgregar(finca.isAgregar());
		oldFinca.setCode(finca.getCode());
		oldFinca.setEdicion(finca.isEdicion());
		oldFinca.setLandId(finca.getLandId());
		oldFinca.setName(finca.getName());
		oldFinca.setStatus(finca.getStatus());
		oldFinca.setUser(finca.getUser());
		return fincaRepo.save(oldFinca);
	}
	
	public List<Finca> getAllFincas(Long id){
		return fincaRepo.findAllByUser_Id(id);
	}
	
}

