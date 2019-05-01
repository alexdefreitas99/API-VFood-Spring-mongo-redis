package com.viaflow.vfood.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Response<T> {
	
	private T data;
	
	private List<String> errors;

	public Response() {
		super();
		this.errors = new ArrayList<>();
	}
}
