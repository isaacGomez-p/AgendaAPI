package com.APIAgenda.agendaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIAgenda.agendaback.entity.NumeroPlanilla;
import com.APIAgenda.agendaback.entity.Planilla;
import com.APIAgenda.agendaback.repository.INumeroPlanillaRepo;
import com.APIAgenda.agendaback.repository.IPlanillaRepository;

@Service
public class PlanillaService {

	@Autowired
	IPlanillaRepository planillaRepo;
	
	@Autowired
	INumeroPlanillaRepo numeroPlanillaRepo;
	
	public Planilla guardarPlanilla(Planilla planilla) {
		return planillaRepo.save(planilla);
	}
	public Planilla actualizarPlanilla(Planilla planilla, Long id) {
		Planilla oldPlanilla = planillaRepo.findById(id).get();
		oldPlanilla.setActivity(planilla.getActivity());
		oldPlanilla.setAgregar(planilla.isAgregar());
		oldPlanilla.setAgricultor_id(planilla.getAgricultor_id());
		oldPlanilla.setApplicationDate(planilla.getApplicationDate());
		oldPlanilla.setCode(planilla.getCode());
		oldPlanilla.setCodeNSpreadsheet(planilla.getCodeNSpreadsheet());
		oldPlanilla.setControl(planilla.getControl());
		oldPlanilla.setDose(planilla.getDose());
		oldPlanilla.setFechaAplicacionString(planilla.getFechaAplicacionString());
		oldPlanilla.setFechaString(planilla.getFechaString());
		oldPlanilla.setFertilization(planilla.getFertilization());
		oldPlanilla.setFilingDate(planilla.getFilingDate());
		oldPlanilla.setFincaNombre(planilla.getFincaNombre());
		oldPlanilla.setLandId(planilla.getLandId());
		oldPlanilla.setLote(planilla.getLote());
		oldPlanilla.setMadeBy(planilla.getMadeBy());
		oldPlanilla.setName(planilla.getName());
		oldPlanilla.setnSpreadsheet(planilla.getnSpreadsheet());
		oldPlanilla.setPlantingMaps(planilla.getPlantingMaps());
		oldPlanilla.setPrevention(planilla.getPrevention());
		oldPlanilla.setProducto(planilla.getProducto());
		oldPlanilla.setQuality(planilla.getQuality());
		oldPlanilla.setSpreadsheetId(planilla.getSpreadsheetId());
		oldPlanilla.setStatus(planilla.getStatus());
		oldPlanilla.setTotalDose(planilla.getTotalDose());
		oldPlanilla.setTotalMix(planilla.getTotalMix());
		return planillaRepo.save(oldPlanilla);
	}
	
	public NumeroPlanilla guardarNumeroPlanilla(NumeroPlanilla numPlan) {
		return numeroPlanillaRepo.save(numPlan);
	}
	
	public List<NumeroPlanilla> getAllNumerosPlanillaByUser(Long idUser){
		return numeroPlanillaRepo.findAllByUser_Id(idUser);
	}
	
	public Planilla getPlanillaId(Long idPlanilla) {
		return planillaRepo.findById(idPlanilla).get();
	}
	
	public void deletePlanilla(Long id) {
		System.out.println(id);
		Planilla planilla = planillaRepo.findById(id).get();
		planillaRepo.delete(planilla);
	}
	
	public List<Planilla> getAllPlanillas(Long id){
		System.out.println("ALL PLANILLAS POR ID_----------------" + id);
		return planillaRepo.findAll();
	}
}
