package com.crud.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.demo.Model.Crud;

@Repository
public interface CrudRepository extends JpaRepository <Crud, Integer>{
	
	@Query(value = "SELECT * FROM main WHERE name = :name", nativeQuery=true)
	Crud display(@Param ("name") String name);
}
