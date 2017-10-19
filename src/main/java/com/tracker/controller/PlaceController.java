package com.tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tracker.model.Place;
import com.tracker.service.PlaceService;

@Controller
public class PlaceController {

	@Autowired
	private PlaceService placeService;
	
	@RequestMapping(value="/placeItems", method=RequestMethod.GET)
	public @ResponseBody List<Place> displayPlace(){
		placeService.addPlaces();
		return placeService.getPlaces();
		
	}
	@RequestMapping(value="/place", method= RequestMethod.GET)
	public String showPlace(Model model){
		model.addAttribute("newPlace", new Place());
		return "place";
	}

	@RequestMapping(value="/place", method=RequestMethod.POST)
	public String addPlace(@Valid @ModelAttribute("newPlace") Place place, 
			BindingResult result, Model model){
		System.out.println("place post controller");
		if(!result.hasErrors()){
		placeService.addPlace(place);
		model.addAttribute("name", place.getName());
		model.addAttribute("address", place.getAddress());

		return "place";
		}
		else{
			System.out.println("error in address posting");
		}
		return "place";
		
	}

}
