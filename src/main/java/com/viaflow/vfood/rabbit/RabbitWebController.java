package com.viaflow.vfood.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.vfood.response.Response;

@RestController
@RequestMapping("/api/mq/minhafila")
@CrossOrigin(origins = "*")
public class RabbitWebController {

	@Autowired
	private RabbitService rabbitService;

	@GetMapping
	public ResponseEntity<Response<RabbitModel>> find() {
		Response<RabbitModel> response = new Response<>();
		response.setData(rabbitService.find());
		return ResponseEntity.ok(response);
	}

	@PutMapping
	public ResponseEntity<Response<RabbitModel>> put(@RequestBody String message) {
		Response<RabbitModel> response = new Response<>();
		RabbitModel obj = rabbitService.put(message);
		if (obj == null) {
			response.getErrors().add("Mensagem Não enviada a fila " + message);
			return ResponseEntity.badRequest().body(response);
		}
		response.setData(obj);
		return ResponseEntity.ok(response);
	}
}
