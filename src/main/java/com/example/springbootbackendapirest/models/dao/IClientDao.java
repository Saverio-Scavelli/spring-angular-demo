package com.example.springbootbackendapirest.models.dao;

import com.example.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Cliente, Long> {



}
