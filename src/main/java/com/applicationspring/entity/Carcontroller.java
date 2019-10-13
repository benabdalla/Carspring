package com.applicationspring.entity;

import com.applicationspring.Crudrep;
import com.applicationspring.dao.Incar;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class Carcontroller implements Crudrep {
    @Autowired
    private Incar card;
    @Override
    public void Ajout(Car car) {
card.save(car);
    }

    @Override
    public void modif(Car car) {
card.saveAndFlush(car);
    }

    @Override
    public List<Car> getCar() {
        return card.findAll();
    }


}
