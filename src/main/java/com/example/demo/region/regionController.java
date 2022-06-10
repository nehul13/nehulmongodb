package com.example.demo.region;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class regionController {
	
	@Autowired
	private regionRepository regionRepo;
	
	
	@GetMapping("/region")
    public List <region> getAllregion()
	{
		return regionRepo.findAll();
	}
    @PostMapping("/region")
    public region saveregion( @RequestBody region region)
    
    {
    	return regionRepo.save(region);
    	
    }
    
    @PutMapping("/region/{id}")
    public region updateStudent( @RequestBody region region, @PathVariable String id)
    
    {
    	region currentregion;
    	currentregion = regionRepo.findById(id).get();
    	currentregion.setRegion_Id(region.getRegion_Id());
    	currentregion.setRegion_Name(region.getRegion_Name());
    	currentregion.setCity(region.getCity());
    	currentregion.setCountry_Name(region.getCountry_Name());
    	
    	
    	return regionRepo.save(currentregion);
    	
    }
    @DeleteMapping("/region/{id}")
    public void deleteregionbyid( @PathVariable String id)
    
    {
    	regionRepo.deleteById(id);
    	
    }

}
