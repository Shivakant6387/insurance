package com.example.icici.lombard.dto.quote.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InsuranceTWQuoteRequest {
    private String VehicleDescription;
    private String EngineNumber;
    private String ChassisNumber;
    private String RegistrationNumber;
    private String NomineeDetails;
    private String financierDetails;
    private String CustomerDetails;
    private String SPDetails;
    private int ExShowRoomPrice;
    private String ServiceTaxExemptionCategory;
    private Boolean IsHandicapDisc;
    private String BodyType;
    private int Tenure;
    private int TPTenure;
    private Boolean IsLegalLiabilityToPaidEmployee;
    private int NoOfEmployee;
    private String LossOfPersonalBelongingPlanName;
    private Boolean IsPACoverUnnamedPassenger;
    private int  SIPACoverUnnamedPassenger;
    private Boolean IsProposal;
    private Date PolicyStartDate;
    private Date PolicyEndDate;
    private String DealId;
    private String VehicleModelCode;
    private String VehicleMakeCode;
    private int RTOLocationCode;
    private int ManufacturingYear;
    private Date DeliveryOrRegistrationDate;
    private Date FirstRegistrationDate;
    private String BusinessType;
    private String CustomerType;
    private Boolean IsValidDrivingLicense;
    private Boolean IsMoreThanOneVehicle;
    private Boolean IsPACoverOwnerDriver;
    private Boolean IsNoPrevInsurance;
    private Boolean IsEngineProtectPlus;
    private Boolean IsFiberGlassFuelTank;
    private String GSTToState;
    private Boolean IsAntiTheftDisc;
    private Boolean IsConsumables;
    private Boolean IsAutomobileAssocnFlag;
    private String AutomobileAssociationNumber;
    private Boolean IsVoluntaryDeductible;
    private String KeyProtectPlan;
    private String RSAPlanName;
    private String VoluntaryDeductiblePlanName;
    private Boolean IsLegalLiabilityToPaidDriver;
    private int NoOfDriver;
    private Boolean IsTransferOfNCB;
    private int TransferOfNCBPercent;
    private Boolean IsExtensionCountry;
    private String ExtensionCountryName;
    private Boolean IsRTIApplicableflag;
    private String ZeroDepPlanName;
    private int TPPDLimit;
    private Boolean IsHaveElectricalAccessories;
    private int SIHaveElectricalAccessories;
    private Boolean IsHaveNonElectricalAccessories;
    private int SIHaveNonElectricalAccessories;
    private Long OtherLoading;
    private int OtherDiscount;
    private Boolean IsPACoverWaiver;
    private String CorrelationId;
    private PreviousPolicyDetails previousPolicyDetails;
}
