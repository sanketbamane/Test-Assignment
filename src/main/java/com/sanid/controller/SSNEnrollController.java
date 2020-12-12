package com.sanid.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sanid.constants.AppConstants;
import com.sanid.entity.Author;
import com.sanid.props.AppProperties;

import com.sanid.service.SSNService;

//import com.sanid.pojo.SSNEnroll;

@RestController
public class SSNEnrollController {

	@Autowired
	private AppProperties appProps;

	@Autowired
	private SSNService service;

	@PostMapping(value = "/ssnEnrollment")
	public ResponseEntity<String> handleEnrollmentBtn(@RequestBody Author author) {
		int ssn = service.saveAuthor(author);

		
		String msg = "Data insertion success!!! id is :- " + ssn;

		// logger.info("completed");
		return new ResponseEntity<>(msg, HttpStatus.OK);

	}
}