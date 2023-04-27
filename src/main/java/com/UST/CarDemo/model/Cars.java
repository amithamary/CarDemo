package com.UST.CarDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cars {
    @Id
    @GeneratedValue
    private int carId;
    private String carName;
    private String yom;
    @ElementCollection
    private List<String> colors;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private String price;
    @ElementCollection
    private List<String> top;
    @ElementCollection
    private List<String> city;

}
