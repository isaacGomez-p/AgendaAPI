package com.APIAgenda.agendaback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIAgenda.agendaback.entity.Planilla;

@Repository
public interface IPlanillaRepository extends JpaRepository<Planilla, Long>{

}