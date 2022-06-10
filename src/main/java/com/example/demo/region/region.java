package com.example.demo.region;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class region {
	@Id
	public String _id;
		
		private String Region_Id ;
		private String Region_Name;
		private String City;
		private String country_Name;
		
		

}
