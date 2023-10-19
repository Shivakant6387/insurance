package com.example.icici.lombard.dto.reliance.request.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MotorPolicy {
    private Integer NetPremium;
    private Integer BasicPremium;
    private String OriginalPremium;
    private String EndorsedPremium;
    private Integer FinalPremium;
    private Integer ECessAmount;
    private Integer HECessAmount;
    private Integer TotalPremium;
    private Integer TotalOD;
    private Integer ServiceTaxRate;
    private Integer EducationalCessRate;
    private Integer HigherEducationalCessRate;
    private Integer TotalScheduleODPremium;
    private Double TotalODPremium;
    private Integer ServiceTaxAmount;
    private Double TotalLiabilityPremium;
    private Double TotalPackagePremium;
    private Double TotalAddonPremium;
    private Integer TotalChangeAmount;
    private Double InspectionCharges;
    private Boolean InspectionChargesapplicable;
    private String ErrorMessages;
    private String IsEligible;
    private String ReferalMessages;
    private Integer status;
    private String TraceID;
    private String ErrorCode;
    private Integer IDV;
    private Integer BodyIDV;
    private Integer ChassisIDV;
    private Integer MinIDV;
    private Integer MaxIDV;
    private Integer MinBodyIDV;
    private Integer MaxBodyIDV;
    private Integer MinChassisIDV;
    private Integer MaxChassisIDV;
    private Integer ProposalNo;
    private Integer SalesTaxAmount;
    private Integer SalesTaxRate;
    private Integer SurchargeAmount;
    private Integer SurchrgeRate;
    private Boolean IsClaimedInLastPolicy;
    private Integer CurrentYearNCB;
    private Integer Current2YearNCB;
    private Integer Current3YearNCB;
    private String InspectionErrorMessage;
    private Integer SwachhBharatCess;
    private Integer SwachhBharatCessRate;
    private Integer KrishiKalyanCess;
    private Integer KrishiKalyanCessRate;
    private Integer InvoiceNo;
    private Integer NetPremium2Year;
    private Integer BasicPremium2Year;
    private Integer FinalPremium2Year;
    private Integer TotalOD2Year;
    private Integer TotalODPremium2Year;
    private Integer TotalLiabilityPremium2Year;
    private Integer TotalPackagePremium2Year;
    private Integer TotalAddonPremium2Year;
    private Integer SecondYearBasicVehicleIDV;
    private Integer NetPremium3Year;
    private Integer BasicPremium3Year;
    private Integer FinalPremium3Year;
    private Integer TotalOD3Year;
    private Integer TotalODPremium3Year;
    private Integer TotalLiabilityPremium3Year;
    private Integer TotalPackagePremium3Year;
    private Integer TotalAddonPremium3Year;
    private Integer ThirdYearBasicVehicleIDV;
    private Integer FourthYearBasicVehicleIDV;
    private Integer FifthYearBasicVehicleIDV;
    private LstTaxComponentDetails lstTaxComponentDetails;
    private LstPricingResponse lstPricingResponse;
    private Integer EndorsementNo;
    private Integer QuoteNo;
//    private List<LstPricingResponse>lstPricingResponses;
}
