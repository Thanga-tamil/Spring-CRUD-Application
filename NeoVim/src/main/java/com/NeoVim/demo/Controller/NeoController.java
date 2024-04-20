package com.NeoVim.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NeoVim.demo.Model.NeoVim;
import com.NeoVim.demo.Service.VimService;

@RestController
@RequestMapping(path = "data")
@CrossOrigin(origins = "*")
public class NeoController {

	@Autowired
	public VimService vimService;
	
	@PostMapping("/add")
	public NeoVim postSerVal(@RequestBody NeoVim vim) {
		return vimService.postVal(vim);
	}
	
	@PostMapping("/adds")
	public List<NeoVim> postSerVals(@RequestBody List<NeoVim> vims){
		return vimService.postVals(vims);
	}
	
	@GetMapping("/{name}")
	public NeoVim getSerVal(@PathVariable String name) {
		return vimService.getVal(name);
	}
	
	@GetMapping("/names")
	public List<NeoVim> getSerVals(){
		return vimService.getVals();
	}
	
	@PutMapping("/update")
	public NeoVim updateSerVal(@RequestBody NeoVim vi) {
		return vimService.updateVal(vi);
	}
	
	
	
	@DeleteMapping("/del/{id}")
	public String delSerVal(@PathVariable int id) {
		return vimService.delVal(id);
	}
	
	@DeleteMapping("/delete")
	public String delSerVals() {
		return vimService.delVals();
	}
}
