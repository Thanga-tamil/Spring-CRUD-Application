package com.NeoVim.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NeoVim.demo.Model.NeoVim;
import com.NeoVim.demo.Repo.VimRepos;

@Service
public class VimService {
	
	@Autowired
	public VimRepos vimRepos;
	
	public NeoVim postVal(NeoVim vim) {
		return vimRepos.save(vim);
	}
	
	public List<NeoVim> postVals(List<NeoVim> vims) {
		return vimRepos.saveAll(vims);
	}
	
	
	public NeoVim getVal(String name) {
		return vimRepos.show(name);
	}
	
	public List<NeoVim> getVals(){
		return vimRepos.findAll();
	}
	
	public NeoVim updateVal(NeoVim vi) {
		NeoVim change = vimRepos.findById(vi.getId()).orElse(null);
		change.setName(vi.getName());
		change.setAge(vi.getAge());
		return vimRepos.save(change);
	}
	
	
	
	public String delVal(int id) {
		vimRepos.deleteById(id);
		return "Deleted id : " + id;
	}
	
	public String delVals() {
		vimRepos.deleteAll();
		return "Nothing Here !";
	}
}

