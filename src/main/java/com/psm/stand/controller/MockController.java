package com.psm.stand.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.psm.stand.model.*;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;

@RestController
public class MockController {

    @GetMapping("/")
    public String index(){
        return "ok";
    }

    @GetMapping("/car-list")
    public ResponseEntity<ArrayList<CarMock>> getCars(){
        System.out.println("here");
        //return new ResponseEntity<CarMock>(HttpStatus.OK);
        return ResponseEntity.ok(CarMock.getCars());
    }

    @GetMapping("/clients")
    public ResponseEntity<ArrayList<EntityMock>> getClients(){
        return ResponseEntity.ok(EntityMock.getClients());
    }

    @GetMapping("/partners")
    public ResponseEntity<ArrayList<EntityMock>> getPartners(){
        return ResponseEntity.ok(EntityMock.getPartners());
    }

    @GetMapping("/sales")
    public ResponseEntity<ArrayList<SalesMock>> getSales(){
        return ResponseEntity.ok(SalesMock.getSales());
    }

    @GetMapping("/parts")
    public ResponseEntity<ArrayList<PartMock>> getParts(){
        return ResponseEntity.ok(PartMock.getParts());
    }

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody UserMock user) throws LoginException {
        if (user.getUsername().equals("joao") && user.getPassword().equals("123")) {
            return ResponseEntity.ok(new TokenMock("Some Token"));
        }
        throw new LoginException();
        /*return user.getUsername().equals("joao") && user.getPassword().equals("123") ?
                ResponseEntity<>(new TokenMock("Some Token"), HttpStatus.OK) :
                ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED;);*/
    }


    @ResponseStatus(value= HttpStatus.UNAUTHORIZED, reason="Invalid credentials")
    private static class LoginExcpetion extends RuntimeException {

        public LoginExcpetion() {
            super("Wrong Credentials!");
        }
    }
}

