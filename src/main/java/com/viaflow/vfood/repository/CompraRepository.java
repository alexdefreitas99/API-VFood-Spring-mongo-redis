package com.viaflow.vfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.viaflow.vfood.model.Compra;

public interface CompraRepository  extends MongoRepository<Compra, String>{

}
