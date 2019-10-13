package com.applicationspring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.applicationspring.entity.Car;
public interface Incar extends JpaRepository<Car,Integer>{
}
