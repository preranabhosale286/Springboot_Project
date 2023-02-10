package com.example.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.enitity.Manger;
import com.example.service.MangerService;

@RestController
public class MangerController {
	@Autowired
	public MangerService mangerService;
	
	
	// add a Exam
	
	@PostMapping(value = "/exams")
	public Manger addController(@RequestBody Manger manger) {
		return mangerService.saveManger(manger);
	}

    // get all Exam
	
	@GetMapping(value = "/exams")
	public List<Manger> getAllController() {
		return mangerService.getAllManger();
	}

	// update a Exam
	
	@PutMapping(value = "/exams/{id}")
	public Manger updateController(@PathVariable int id, @RequestBody Manger manger) {
		return mangerService.updateManger(manger, id);
	}

	// delete a Exam

	@DeleteMapping(value = "/exams/{id}")
	public String deleteController(@PathVariable int id) {
		return mangerService.deleteManger(id);
	}

	
	
}


