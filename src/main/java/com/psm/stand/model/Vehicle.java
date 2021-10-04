package com.psm.stand.model;


import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;

public class Vehicle {

    private long id;

    @Pattern(message = "Matrícula inválida!", regexp = "^(([A-Z]{2}-d{2}-(d{2}|[A-Z]{2}))|(d{2}-(d{2}-[A-Z]{2}|[A-Z]{2}-d{2})))$")
    private String plate;

    private String color;

    private String description;

    private Date plateDate;

    private Integer horsePower;

    //Enum
    private String brand;

    private String model;

    // enum
    private String category;

    //enum
    private String fuelType;

    private String vin;

    private String mileage;

    // enum
    private String gearBox;

    // enum
    private String type;

    private String motor;

    private String cc;

    private Integer seats;

    private Integer weight;

    //private Supplier seller;

    // review
    private String location;
}
