package com.tracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tracker.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.tracker.service.ExerciseService#findAllActivitites()
	 */
	public List<Activity> findAllActivitites(){
		List<Activity> activities = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		Activity swim = new Activity();
		swim.setDesc("swim");
		activities.add(swim);
		Activity bike = new Activity();
		bike.setDesc("bike");
		activities.add(bike);
		return activities;
	}
}
