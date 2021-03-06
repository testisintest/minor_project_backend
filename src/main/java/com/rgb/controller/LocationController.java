package com.rgb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgb.model.Location;
import com.rgb.service.LocationService;

@RestController
public class LocationController {

	@Autowired 
	private LocationService locationService;
	
	
	@RequestMapping(value="/places/locations")
	public List<Location> getLocation(){
		return locationService.getAllLocation();
	}
}
