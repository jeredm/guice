/*
 * Copyright 2017 Maplewood Software, Inc.
 * All rights reserved
 * Jesu Juva
 */
package com.github.jeredm.guice.service;

import java.util.List;

import com.github.jeredm.guice.obj.Car;
import com.google.inject.ImplementedBy;

/**
 * A service for working with Car objects.
 * 
 * @author Jered Myers
 * @since May 15, 2017
 */
@ImplementedBy(CarService.class)
public interface ICarService
{
	/**
	 * Gets a list of cars.
	 * 
	 * @return a list of cars
	 */
	public List<Car> getCars();
}
