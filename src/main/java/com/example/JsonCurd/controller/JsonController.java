package com.example.JsonCurd.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JsonCurd.bean.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RequestMapping("/json")
@RestController
public class JsonController {
	
	@Value("${com.frute.json}")
	String fruitJson;
	
	@Value("${com.quiz.sport}")
	String quizSport;
	
	@Value("${com.employee}")
	String employee;
	
	ObjectMapper objMap=new ObjectMapper();
	
	@GetMapping("/jsonStringFromProp")
	public void getJsonStringFromProp() {
		System.out.println(" fruitJson == " + fruitJson );
		System.out.println(" quizSport == " + quizSport );
		
	}
	
	@GetMapping("/jsonString")
	public void getJsonFromProp() throws JsonMappingException, JsonProcessingException {
		
		Root root = objMap.readValue(employee, Root.class);
		
		System.out.println("Root " + root.toString());
		JSONObject json = new JSONObject(root);
		System.out.println("Java Object to Json " + json);
	}
	
	@PostMapping("/emp")
	public String saveEmployee(@RequestBody Root emp) {
		System.out.println("Employee --- " + emp);
		return   "success !!";
	}

}
