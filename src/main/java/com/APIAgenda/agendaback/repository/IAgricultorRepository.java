package com.APIAgenda.agendaback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIAgenda.agendaback.entity.User;

@Repository
public interface IAgricultorRepository extends JpaRepository<User, Long>{

}
