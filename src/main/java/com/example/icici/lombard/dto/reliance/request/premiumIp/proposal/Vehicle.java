package com.example.icici.lombard.dto.reliance.request.premiumIp.proposal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String Registration_Number;
    private String RegistrationNumber_New;
    private String Registration_date;
    private Integer SeatingCapacity;
    private Integer MiscTypeOfVehicle;
    private Integer TypeOfFuel;
    private Integer MiscTypeOfVehicleID;
    private Integer BodyType;
    private Integer BodyIDV;
    private Integer ChassisIDV;
    private Boolean ISmanufacturerfullybuild;
    private Integer GCVSubTypeOfVehicleID;
    private Integer GCVGoodTypeOfVehicleID;
    private Boolean ISNewVehicle;
}
