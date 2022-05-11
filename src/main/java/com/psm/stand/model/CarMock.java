package com.psm.stand.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class CarMock {
    private String brand;
    private String model;
    private String month;
    private int year;
    private int power;
    private double price;
    private boolean reserved;
    private String imgUrl;
    private int cc;
    private int mileage;
    private String fuelType;
    private String color;
    private String gearBox;
    private String plate;


    public static ArrayList<CarMock> getCars(){
        ArrayList<CarMock> cars = new ArrayList<>();
        cars.add(new CarMock(
                "VW",
                "Carocha",
                "June",
                1953,
                35,
                4500.0d,
                true,
                "test https://www.razaoautomovel.com/wp-content/uploads/2015/06/vw-original-beetle.jpg",
                600,
                632000,
                "Petrol",
                "White",
                "Manual",
                "12-AB-34"
        ));
        cars.add(new CarMock(
                "BMW",
                "323i",
                "March",
                1997,
                180,
                9000.0d,
                false,
                "https://www.netcarshow.com/BMW-323i-1995-1600-02.jpg",
                1900,
                230000,
                "Petrol",
                "Silver",
                "Manual",
                "GH-12-34"
        ));
        cars.add(new CarMock(
                "Audi",
                "A3",
                "June",
                2015,
                150,
                14500.0d,
                false,
                "https://www.razaoautomovel.com/wp-content/uploads/2013/10/Audi-A3-S-Line-2013-110.jpg",
                1600,
                100000,
                "Diesel",
                "Black",
                "Automatic",
                "AH-12-GH"
        ));
        return cars;
    }
}
