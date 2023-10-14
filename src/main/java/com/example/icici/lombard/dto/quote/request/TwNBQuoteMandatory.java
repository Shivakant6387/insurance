package com.example.icici.lombard.dto.quote.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwNBQuoteMandatory {
    private String BusinessType;
    private String DealId;
    private Date DeliveryOrRegistrationDate;
    private Date FirstRegistrationDate;
    private Date PolicyStartDate;
    private Date PolicyEndDate;
    private String ManufacturingYear;
    private String VehicleModelCode;
    private String RTOLocationCode;
    private String Tenure;
    private String TPTenure;
    private int PACoverTenure;
    private String ExShowRoomPrice;
    private String VehicleMakeCode;
    private String GSTToState;
    private String CustomerType;
    private String CorrelationId;
}
