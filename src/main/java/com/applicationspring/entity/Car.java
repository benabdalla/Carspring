package com.applicationspring.entity;



import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
    @Id
    @Column(name="car_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_c;
    @Column(name="car_name")
    private String name;
    @Column(name="car_photo")
    private String photo;


    public Car(int id,String name,String photo) {
        this.id_c= id_c;
        this.photo = photo;
        this.name=name;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
