package com.nt.babluIT.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.babluIT.demo.Interface.CarType;

@RestController
@RequestMapping(value = "/car")
public class CarServiceController {

	@Autowired
	@Qualifier(value = "hondaCarService")
	private CarType carType; // byType

	/*@Autowired
	private CarType hondaCarService;  //byName
	*/

	/*private final CarType carType;
	
	public CarServiceController(@Qualifier(value = "hondaCarService") CarType carType) {
		this.carType = carType;
	}  //constructor Injection */

	/*private CarType tataCarService;
	
	public CarServiceController(CarType tataCarService) {
		this.tataCarService = tataCarService;
	} //constructor Injection */

	/*@Autowired
	private CarType carType;  //@Primary Injection
	*/

	/*private CarType carType;
	
	@Autowired
	public void setCarType(@Qualifier(value = "hondaCarService") CarType carType) {
		this.carType = carType;
	} // setter injection
	*/
	@GetMapping
	public String getCarName() {
		return carType.driveCar();
	}

}
