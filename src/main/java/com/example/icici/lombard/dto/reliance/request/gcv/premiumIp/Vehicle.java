package com.example.icici.lombard.dto.reliance.request.gcv.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String Registration_Number;
    private Integer RegistrationNumber_New;
    private String Registration_date;
    private RoadTypes roadTypes;
    private Permit permit;
    private Integer SeatingCapacity;
    private String MiscTypeOfVehicle;
    private Integer TypeOfFuel;
    private Integer MiscTypeOfVehicleID;
    private Integer BodyType;
    private Integer BodyIDV;
    private Integer ChassisIDV;
    private Integer BodyPrice;
    private Integer ChassisPrice;
    private Boolean ISmanufacturerfullybuild;
    private Integer GCVSubTypeOfVehicleID;
    private Integer GCVGoodTypeOfVehicleID;
    private Boolean ISNewVehicle;
}
