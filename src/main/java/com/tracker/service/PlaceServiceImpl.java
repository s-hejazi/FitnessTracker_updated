package com.tracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tracker.model.Place;

@Service
public class PlaceServiceImpl implements PlaceService {

	List<Place> placeList =  new ArrayList<Place>();
	/* (non-Javadoc)
	 * @see com.tracker.service.PlaceService#addService()
	 */
	public void addPlaces(){
		if(placeList.isEmpty()){
		Place place1 = new Place();
		place1.setAddress(3468);	
		place1.setName("home");
		Place place2 = new Place();
		place2.setAddress(1400);	
		place2.setName("uni");
		placeList.add(place1);
		placeList.add(place2);
		}
		}
	/* (non-Javadoc)
	 * @see com.tracker.service.PlaceService#getPlaces()
	 */
	public List<Place> getPlaces(){
		return placeList;
	}
	public void addPlace(Place place){
		placeList.add(place);
	}
	}

