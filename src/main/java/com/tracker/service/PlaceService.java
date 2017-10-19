package com.tracker.service;

import java.util.List;

import com.tracker.model.Place;

public interface PlaceService {

	void addPlaces();

	List<Place> getPlaces();
	void addPlace(Place place);

}