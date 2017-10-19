package com.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tracker.model.Activity;
import com.tracker.model.Exercise;
import com.tracker.service.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println(exercise.getMinutes());
		System.out.println(exercise.getActivity());
		return "addMinutes";
	}

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {

		
		return exerciseService.findAllActivitites();
	}
	// @RequestMapping(value="/addMoreMinutes")
	// public String addMoreMinutes(@ModelAttribute("exercise") Exercise
	// exercise){
	// System.out.println(exercise.getMinutes()+" ++");
	// return "addMinutes";
	// }
}
