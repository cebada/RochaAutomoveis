package com.psm.stand.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class EntityMock {
    private String name;
    private String entityType;

    public static ArrayList<EntityMock> getClients() {
        ArrayList<EntityMock> clients = new ArrayList<>();
        clients.add(new EntityMock("João", "Client"));
        clients.add(new EntityMock("Manuel", "Client"));
        clients.add(new EntityMock("Diogo", "Client"));
        clients.add(new EntityMock("Eduardo", "Client"));
        clients.add(new EntityMock("Tiago", "Client"));
        return clients;
    }

    public static ArrayList<EntityMock> getPartners() {
        ArrayList<EntityMock> partners = new ArrayList<>();
        partners.add(new EntityMock("João", "Chapeiro"));
        partners.add(new EntityMock("Manuel", "Pintor"));
        partners.add(new EntityMock("Diogo", "Pintor"));
        return partners;
    }
}
