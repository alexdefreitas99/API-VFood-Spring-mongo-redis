package com.viaflow.vfood.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viaflow.vfood.model.Perfil;

@Repository
public interface PerfilRepository extends MongoRepository<Perfil, String>{

}
