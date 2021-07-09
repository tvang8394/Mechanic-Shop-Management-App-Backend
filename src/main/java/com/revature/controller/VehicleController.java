package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Vehicle;
import com.revature.services.VehicleService;

@RestController
@RequestMapping(path="/vehicles")
public class VehicleController {
	private VehicleService vs;
	
	@Autowired
	public VehicleController(VehicleService vs) {
		this.vs = vs;
	}
	
	@GetMapping
	public List<Vehicle> getAll() {
		return this.vs.getAll();
	}
	
	@GetMapping("/{id}")
	public Vehicle getById(@PathVariable("id") int id) {
		return this.vs.get(id);
	}
	
	@PutMapping("/add")
	public Vehicle add(@RequestBody Vehicle c) {
		return this.vs.add(c);
	}
	
	@PostMapping("/update")
	public Vehicle update(@RequestBody Vehicle c) {
		return this.vs.update(c);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		this.vs.delete(id);
	}
}