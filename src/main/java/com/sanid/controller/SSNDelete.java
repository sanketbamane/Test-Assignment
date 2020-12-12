package com.sanid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sanid.service.SSNService;

@RestController
public class SSNDelete {

	@Autowired
	private SSNService service;

	@DeleteMapping("/SSNDelete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		service.deleteById(id);
		
		String msg = "Data deleted successfully!!!";

		// logger.info("completed");
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
