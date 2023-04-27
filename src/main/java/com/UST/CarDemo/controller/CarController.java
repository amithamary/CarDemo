package com.UST.CarDemo.controller;

import com.UST.CarDemo.model.Cars;
import com.UST.CarDemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getcars")
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping("/addcars")
    public Cars addCars(@RequestBody Cars cars){
        return carService.addCars(cars);
    }
    @GetMapping("/getcars")
    public List<Cars> getAllCars(){

        return carService.getAllCars();
    }

}
