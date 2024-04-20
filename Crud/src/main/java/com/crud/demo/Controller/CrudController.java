package com.crud.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.Model.Crud;
import com.crud.demo.Service.CrudService;

@RestController
@RequestMapping(path = "data")
public class CrudController {
	
	@Autowired
	public CrudService crudService;
	
	@GetMapping("/names")
	public List<Crud> getSerVals(){
		return crudService.getvalues();
	}
	
	@GetMapping("/{name}")
	public Crud getSerVal(@PathVariable String name){
		return crudService.getvalue(name);
	}
	
	@PostMapping("/add")
	public Crud postSerVal(@RequestBody Crud crud) {
		return crudService.postValue(crud);
	}
	
	@PostMapping("/adds")
	public List<Crud> postSerVals(@RequestBody List<Crud> cruds) {
		return crudService.postValues(cruds);
	}
	
	@DeleteMapping("/del/{id}")
	public String delSerVal(@PathVariable int id) {
		return crudService.delVal(id);
	}

}
