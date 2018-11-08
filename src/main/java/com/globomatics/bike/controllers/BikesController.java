package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @GetMapping
    public List<Bike> list() {
        List<Bike> bikes = new ArrayList<>();

        return bikes;
    }
}
