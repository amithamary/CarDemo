package com.UST.CarDemo.service;

import com.UST.CarDemo.model.Cars;
import com.UST.CarDemo.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    public Cars addCars(Cars cars) {
        return carRepo.save(cars);

    }

    public List<Cars> getAllCars() {
        return carRepo.findAll();
    }
}
