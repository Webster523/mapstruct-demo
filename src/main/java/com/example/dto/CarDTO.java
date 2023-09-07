package com.example.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CarDTO {
    private Long id;
    private String vin;
    private double price;
    private double totalPrice;
    private Date publishDate;
    private String brand;
    private List<PartDTO> partDTOS;
    private DriverDTO driverDTO;
}
