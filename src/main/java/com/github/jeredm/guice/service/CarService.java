package com.github.jeredm.guice.service;

import java.util.ArrayList;
import java.util.List;

import com.github.jeredm.guice.obj.Car;

/**
 * The implementation of the car service.
 * 
 * @author Jered Myers
 * @since May 15, 2017
 */
public class CarService implements ICarService
{
	/** {@inheritDoc} */
	@Override
	public List<Car> getCars()
	{
		List<Car> cars = new ArrayList<>();

		Car buick = new Car();
		buick.setYear("2018");
		buick.setMake("Buick");
		buick.setModel("Envision");
		cars.add(buick);

		Car ford = new Car();
		ford.setYear("2017");
		ford.setMake("Ford");
		ford.setModel("Escort");
		cars.add(ford);

		return cars;
	}

}
