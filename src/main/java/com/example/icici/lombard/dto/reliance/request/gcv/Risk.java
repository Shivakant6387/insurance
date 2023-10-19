package com.example.icici.lombard.dto.reliance.request.gcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Risk {
    private Integer VehicleMakeID;
    private Integer VehicleModelID;
    private Integer CubicCapacity;
    private String Zone;
    private Integer RTOLocationID;
    private String ExShowroomPrice;
    private Integer IDV;
    private String DateOfPurchase;
    private Integer ManufactureMonth;
    private Integer ManufactureYear;
    private String EngineNo;
    private String Chassis;
    private Boolean IsVehicleHypothicated;
    private Integer FinanceType;
    private String FinancierName;
    private String FinancierAddress;
    private String FinancierCity;
    private Boolean IsRegAddressSameasCommAddress;
    private Boolean IsRegAddressSameasPermanentAddress;
    private Boolean IsPermanentAddressSameasCommAddress;
    private String VehicleVariant;
    private Integer StateOfRegistrationID;
    private String Rto_RegionCode;
}
