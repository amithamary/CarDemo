package com.UST.CarDemo.repository;

import com.UST.CarDemo.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Cars,Integer> {
}
