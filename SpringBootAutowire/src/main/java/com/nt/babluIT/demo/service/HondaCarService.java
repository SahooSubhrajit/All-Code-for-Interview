package com.nt.babluIT.demo.service;

import org.springframework.stereotype.Service;

import com.nt.babluIT.demo.Interface.CarType;

@Service
public class HondaCarService implements CarType {

	@Override
	public String driveCar() {
		return "Honda car";
	}

}
