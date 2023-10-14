package com.example.icici.lombard.dto.quote.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwRoQuoteMandatoryRequest {
    private String BusinessType;
    private String DealId;
    private Date DeliveryOrRegistrationDate;
    private Date FirstRegistrationDate;
    private Date PolicyStartDate;
    private Date PolicyEndDate;
    private String ManufacturingYear;
    private String VehicleMakeCode;
    private String Tenure;
    private String GSTToState;
    private String CustomerType;
    private String VehicleModelCode;
    private String RTOLocationCode;
    private String ExShowRoomPrice;
    private String CorrelationId;
    private Boolean IsNoPrevInsurance;
}
