package com.psm.stand.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class PartMock {
    private String name;
    private Double cost;
    private EntityMock Supplier;
    private String purchaseDate;

    public static ArrayList<PartMock> getParts() {
        ArrayList<PartMock> parts = new ArrayList<>();
        parts.add(new PartMock("Radiator XYZ", 100.50, new EntityMock("Supplier X", "Supplier"), "01/01/2019"));
        parts.add(new PartMock("Wheel XYZ", 80.20, new EntityMock("Supplier Y", "Supplier"), "01/01/2019"));
        parts.add(new PartMock("Radiator ABC", 130.0, new EntityMock("Supplier Y", "Supplier"), "01/01/2019"));
        parts.add(new PartMock("Gearbox X", 300.0, new EntityMock("Supplier Z", "Supplier"), "01/01/2019"));
        parts.add(new PartMock("Bumper Y", 150.99, new EntityMock("Supplier Z", "Supplier"), "01/01/2019"));
        return parts;
    }
}
