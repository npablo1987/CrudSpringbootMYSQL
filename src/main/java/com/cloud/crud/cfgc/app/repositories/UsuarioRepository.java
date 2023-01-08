package com.cloud.crud.cfgc.app.repositories;

import com.cloud.crud.cfgc.app.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {



}
