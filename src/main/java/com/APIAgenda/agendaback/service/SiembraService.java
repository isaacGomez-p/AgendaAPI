package com.APIAgenda.agendaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIAgenda.agendaback.entity.Siembra;
import com.APIAgenda.agendaback.repository.ISiembraRepository;

@Service
public class SiembraService {

	@Autowired
	ISiembraRepository siembraRepo;
	
	public Siembra guardarSiembra(Siembra siembra) {
		return siembraRepo.save(siembra);
	}
	
	public List<Siembra> getSiembraByIdFinca(Long idFinca) {
		return siembraRepo.findAllByLand_LandId(idFinca);
	}
	
	public void deleteSiembra(Long idSiembra) {
		System.out.println("ID SIEMBRA DELETE ____ " + idSiembra);
		Siembra siembra = siembraRepo.findById(idSiembra).get();
		siembraRepo.delete(siembra);
	}
}
