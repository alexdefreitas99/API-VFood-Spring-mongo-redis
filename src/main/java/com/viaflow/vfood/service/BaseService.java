package com.viaflow.vfood.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface BaseService<T> {
	T createOrUpdate(T object);
	
	T findById(String id);
	
	void delete(String id);
	
	String deleteAllCache();
	
	Page<T> findAll(int page, int count, String field, String order);
}
