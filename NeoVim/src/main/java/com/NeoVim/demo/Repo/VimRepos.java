package com.NeoVim.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.NeoVim.demo.Model.NeoVim;

@Repository
public interface VimRepos extends JpaRepository <NeoVim, Integer>{
	
	@Query(value = "select * from main where name = :name", nativeQuery=true)
	NeoVim show(@Param ("name") String name);

}