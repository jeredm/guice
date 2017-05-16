package com.github.jeredm.guice;

import java.util.ArrayList;
import java.util.List;

import com.github.jeredm.guice.obj.Car;
import com.github.jeredm.guice.service.ICarService;

/**
 * @author Jered Myers
 * @since May 15, 2017
 */
public class MockCarService implements ICarService
{
	/** {@inheritDoc} */
	@Override
	public List<Car> getCars()
	{
		List<Car> cars = new ArrayList<>();

		Car chevy = new Car();
		chevy.setYear("2016");
		chevy.setMake("Chevy");
		chevy.setModel("Cavalier");
		cars.add(chevy);
		
		return cars;
	}

}
