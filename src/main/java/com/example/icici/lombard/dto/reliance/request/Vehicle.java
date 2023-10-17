package com.example.icici.lombard.dto.reliance.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String Registration_Number;
    private String Registration_date;
    private Integer SeatingCapacity;
    private Integer TypeOfFuel;
    private Boolean ISNewVehicle;
}
