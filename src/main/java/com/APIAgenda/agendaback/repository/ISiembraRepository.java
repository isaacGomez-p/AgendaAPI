package com.APIAgenda.agendaback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.APIAgenda.agendaback.entity.Siembra;

@Repository
public interface ISiembraRepository extends JpaRepository<Siembra, Long>{
	@Query(value="select * from AG_SIEMBRA LEFT JOIN AG_FINCA ON AG_FINCA.ID = AG_SIEMBRA.LAND", nativeQuery=true)
	List<Siembra> findAllByLand_LandId(Long idFinca);

}