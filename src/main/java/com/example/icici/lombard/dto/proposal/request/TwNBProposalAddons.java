package com.example.icici.lombard.dto.proposal.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwNBProposalAddons {
    private String EngineNumber;
    private String RegistrationNumber;
    private String ChassisNumber;
    private String VehicleModelCode;
    private String RTOLocationCode;
    private String ManufacturingYear;
    private String ExShowRoomPrice;
    private String DealId;
    private String BusinessType;
    private String VehicleMakeCode;
    private String Tenure;
    private String TPTenure;
    private String PACoverTenure;
    private Date DeliveryOrRegistrationDate;
    private Date FirstRegistrationDate;
    private Date PolicyStartDate;
    private Date PolicyEndDate;
    private String GSTToState;
    private String CustomerType;
    private String CorrelationId;
    private Boolean IsRTIApplicableflag;
    private String ZeroDepPlanName;
    private String RSAPlanName;
    private Boolean IsAntiTheftDisc;
    private Boolean IsHandicapDisc;
    private Boolean IsExtensionCountry;
    private Boolean IsMoreThanOneVehicle;
    private Boolean IsLegalLiabilityToPaidDriver;
    private Boolean IsLegalLiabilityToPaidEmployee;
    private int NoOfEmployee;
    private Boolean IsTransferOfNCB;
    private int NoOfDriver;
    private Boolean IsConsumables;
    private Boolean IsValidDrivingLicense;
    private Boolean IsAutomobileAssocnFlag;
    private Boolean IsPACoverUnnamedPassenger;
    private int SIPACoverUnnamedPassenger;
    private Boolean IsHaveElectricalAccessories;
    private int  SIHaveElectricalAccessories;
    private Boolean IsHaveNonElectricalAccessories;
    private int SIHaveNonElectricalAccessories;
    private Boolean IsEngineProtectPlus;
    private int OtherLoading;
    private int TPPDLimit;
    private CustomerDetail customerDetail;
}
