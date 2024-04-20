package com.crud.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.Model.Crud;
import com.crud.demo.Repo.CrudRepository;

@Service
public class CrudService {

	@Autowired
	public CrudRepository crudRepository;
	
	public List<Crud> getvalues(){
		return crudRepository.findAll();
	}
	
	public Crud getvalue(String name) {
		return crudRepository.display(name);
	}
	
	public Crud postValue(Crud crud) {
		return crudRepository.save(crud);
	}
	
	public List<Crud> postValues(List<Crud> cruds) {
		return crudRepository.saveAll(cruds);
	}
	
	public String delVal(int id) {
		crudRepository.deleteById(id);
		return "Deleted id : " + id;
	}
}
