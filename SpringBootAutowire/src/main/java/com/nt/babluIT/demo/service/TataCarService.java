package com.nt.babluIT.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nt.babluIT.demo.Interface.CarType;

@Service
@Primary
public class TataCarService implements CarType {

	@Override
	public String driveCar() {
		return "Tata car";

	}

}
