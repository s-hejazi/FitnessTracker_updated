package com.tracker.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tracker.model.Goal;

@Controller
@SessionAttributes("Goal") // which attribute to store in session (same as model)
public class GoalController {

	//initialization method, when page loads
	@RequestMapping(value="/addGoal", method = RequestMethod.GET)
	public String addGoal(Model model){
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("Goal",goal);
		return "addGoal";
	}
	//when posting back, check for validation
	@RequestMapping(value="/addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("Goal") Goal goal, BindingResult result){// we have the goal here
		System.out.println(goal.getMinutes());
		if(result.hasErrors()){
			return "addGoal";
		}
		return "redirect:addMinutes.html";
	}
}

//result: result of validation