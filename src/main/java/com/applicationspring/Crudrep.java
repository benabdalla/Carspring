package com.applicationspring;

import com.applicationspring.entity.Car;

import java.util.List;

public interface Crudrep {
    void Ajout(Car car);
    void modif(Car car);
    List<Car>getCar();



}
