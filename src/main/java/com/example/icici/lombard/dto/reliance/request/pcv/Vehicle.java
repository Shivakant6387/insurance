package com.example.icici.lombard.dto.reliance.request.pcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String Registration_Number;
    private String Registration_date;
    private int SeatingCapacity;
    private int TypeOfFuel;
    private boolean ISNewVehicle;
}
