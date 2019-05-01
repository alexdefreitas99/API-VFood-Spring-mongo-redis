package com.viaflow.vfood.repository;

import org.springframework.stereotype.Repository;

import com.viaflow.vfood.model.Usuario;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}
