package ro.cars.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private int hp;

    @Column
    private CarType carType;

    public Car( String brand, String model, int hp, CarType carType) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.carType = carType;
    }

    public Car() {
    }
}


