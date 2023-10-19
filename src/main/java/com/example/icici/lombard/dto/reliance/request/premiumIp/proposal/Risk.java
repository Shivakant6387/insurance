package com.example.icici.lombard.dto.reliance.request.premiumIp.proposal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Risk {
    private Integer VehicleMakeID;
    private Integer VehicleModelID;
    private String Colour;
    private String OtherColour;
    private Integer GrossVehicleWeight;
    private Boolean IsBHVehicle;
    private Integer CubicCapacity;
    private String Zone;
    private Integer RTOLocationID;
    private Integer ExShowroomPrice;
    private Integer IDV;
    private String DateOfPurchase;
    private Integer LicensedCarryingCapacity;
    private Integer NoOfWheels;
    private Integer ManufactureMonth;
    private Integer ManufactureYear;
    private String EngineNo;
    private String Chassis;
    private Integer TrailerIDV;
    private Boolean IsVehicleHypothicated;
    private Integer FinanceType;
    private String FinancierName;
    private String FinancierAddress;
    private String FinancierCity;
    private Boolean IsRegAddressSameasCommAddress;
    private Boolean IsRegAddressSameasPermanentAddress;
    private Boolean IsPermanentAddressSameasCommAddress;
    private Boolean IsInspectionAddressSameasCommAddress;
    private Integer SalesManagerCode;
    private String SalesManagerName;
    private String VehicleVariant;
    private Integer StateOfRegistrationID;
    private Integer BodyIDV;
    private Integer ChassisIDV;
    private Integer Rto_RegionCode;

}
