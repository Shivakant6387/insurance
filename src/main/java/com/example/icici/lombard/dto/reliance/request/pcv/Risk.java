package com.example.icici.lombard.dto.reliance.request.pcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Risk {
    private int VehicleMakeID;
    private int VehicleModelID;
    private int CubicCapacity;
    private String Zone;
    private int RTOLocationID;
    private int ExShowroomPrice;
    private int IDV;
    private String DateOfPurchase;
    private int ManufactureMonth;
    private int ManufactureYear;
    private String EngineNo;
    private String Chassis;
    private boolean IsVehicleHypothicated;
    private int FinanceType;
    private String FinancierName;
    private String FinancierAddress;
    private String FinancierCity;
    private boolean IsRegAddressSameasCommAddress;
    private boolean IsRegAddressSameasPermanentAddress;
    private boolean IsPermanentAddressSameasCommAddress;
    private String VehicleVariant;
    private int StateOfRegistrationID;
    private String Rto_RegionCode;
}
