package com.psm.stand.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class SalesMock {
    private CarMock car;
    private String date;
    private EntityMock client;


    public static ArrayList<SalesMock> getSales() {
        ArrayList<EntityMock> clients = EntityMock.getClients();
        ArrayList<CarMock> cars = CarMock.getCars();
        ArrayList<SalesMock> sales = new ArrayList<>();
        int count = 0;
        for (CarMock c: cars) {
            sales.add(new SalesMock(c, "01/02/2018", clients.get(count++)));
        }
        return sales;
    }
}
