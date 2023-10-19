package com.example.icici.lombard.service.reliance;

import com.example.icici.lombard.dto.reliance.request.gcv.*;
import com.example.icici.lombard.dto.reliance.request.gcv.Cover;
import com.example.icici.lombard.dto.reliance.request.gcv.PreviousInsuranceDetails;
import com.example.icici.lombard.dto.reliance.request.gcv.Risk;
import com.example.icici.lombard.dto.reliance.request.gcv.Vehicle;
import com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotorPolicyServices {
    public MotorPolicyRequest getMotorPolicy() {
        MotorPolicyRequest request = new MotorPolicyRequest();
        request.setClientDetails(new ClientDetails(0));
        request.setPolicy(new Policy(5, "24/06/2019", "23/06/2020", 9202, "Direct", 2349, 1, false, "", ""));
        request.setRisk(new Risk(124, 37020, 200, "B", 561, "", 50000, "01/01/2017", 1, 2017, "E87988955555", "C1324655655", true, 1, "Hdfc Bank", "KALYAN", "", true, true, true, "LX", 21, "MH05"));
        request.setCover(new Cover(true));
        request.setVehicle(new Vehicle("MH-05-AS-2544", "01/01/2017", 2, 1, false));
        request.setPreviousInsuranceDetails(new PreviousInsuranceDetails(5, "HDFC321321654654649", "22/06/2018", "23/06/2019", "2023"));
        request.setProductCode(2349);
        request.setUserID(100002);
        request.setValidateFlag(false);
        request.setSourceSystemID(100002);
        request.setAuthToken("Pass@123");
        return request;
    }

    public MotorPolicy getMotorPolicys() {

        MotorPolicy motorPolicy = new MotorPolicy();
        motorPolicy.setNetPremium(16371);
        motorPolicy.setBasicPremium(0);
        motorPolicy.setOriginalPremium(motorPolicy.getOriginalPremium());
        motorPolicy.setEndorsedPremium(motorPolicy.getEndorsedPremium());
        motorPolicy.setFinalPremium(18373);
        motorPolicy.setECessAmount(0);
        motorPolicy.setHECessAmount(0);
        motorPolicy.setTotalPremium(motorPolicy.getTotalPremium());
        motorPolicy.setTotalOD(0);
        motorPolicy.setServiceTaxRate(0);
        motorPolicy.setEducationalCessRate(0);
        motorPolicy.setHigherEducationalCessRate(0);
        motorPolicy.setTotalScheduleODPremium(motorPolicy.getTotalScheduleODPremium());
        motorPolicy.setTotalODPremium(0.0);
        motorPolicy.setServiceTaxAmount(0);
        motorPolicy.setTotalLiabilityPremium(16371.0);
        motorPolicy.setTotalPackagePremium(16371.0);
        motorPolicy.setTotalAddonPremium(0.00);
        motorPolicy.setTotalChangeAmount(motorPolicy.getTotalOD());
        motorPolicy.setInspectionCharges(0.0);
        motorPolicy.setInspectionChargesapplicable(false);
        motorPolicy.setErrorMessages(motorPolicy.getErrorMessages());
        motorPolicy.setIsEligible(motorPolicy.getIsEligible());
        motorPolicy.setReferalMessages(motorPolicy.getReferalMessages());
        motorPolicy.setStatus(1);
        motorPolicy.setTraceID("E2349M0421499769");
        motorPolicy.setErrorCode(motorPolicy.getErrorCode());
        motorPolicy.setIDV(0);
        motorPolicy.setBodyIDV(motorPolicy.getBodyIDV());
        motorPolicy.setChassisIDV(motorPolicy.getChassisIDV());
        motorPolicy.setMinIDV(motorPolicy.getMinIDV());
        motorPolicy.setMaxIDV(motorPolicy.getMaxIDV());
        motorPolicy.setMinBodyIDV(motorPolicy.getMinBodyIDV());
        motorPolicy.setMaxBodyIDV(motorPolicy.getMaxBodyIDV());
        motorPolicy.setMinChassisIDV(motorPolicy.getMinChassisIDV());
        motorPolicy.setMaxChassisIDV(motorPolicy.getMaxChassisIDV());
        motorPolicy.setProposalNo(motorPolicy.getProposalNo());
        motorPolicy.setSalesTaxAmount(motorPolicy.getSalesTaxAmount());
        motorPolicy.setSalesTaxRate(motorPolicy.getSalesTaxRate());
        motorPolicy.setSurchargeAmount(motorPolicy.getSurchargeAmount());
        motorPolicy.setSurchrgeRate(motorPolicy.getSurchrgeRate());
        motorPolicy.setIsClaimedInLastPolicy(false);
        motorPolicy.setSwachhBharatCess(0);
        motorPolicy.setSwachhBharatCessRate(0);
        motorPolicy.setKrishiKalyanCess(0);
        motorPolicy.setKrishiKalyanCessRate(0);
        List<TaxComponent> taxComponent = new ArrayList<>();
        taxComponent.add(new TaxComponent("SGST(TP)", 6, 944.76));
        List<TaxComponent2Year> taxComponent2Year = new ArrayList<>();
        taxComponent2Year.add(new TaxComponent2Year());
        List<TaxComponent3Year> taxComponent3Year = new ArrayList<>();
        taxComponent3Year.add(new TaxComponent3Year());
        LstPricingResponse lstPricingResponse = new LstPricingResponse();
        lstPricingResponse.setCoverID(124);
        lstPricingResponse.setPremium(50.0);
        lstPricingResponse.setPremium2Year(lstPricingResponse.getPremium2Year());
        lstPricingResponse.setPremium3Year(lstPricingResponse.getPremium3Year());
        lstPricingResponse.setCoverageName("Liability to Cleaner");
        lstPricingResponse.setSumInsured(lstPricingResponse.getSumInsured());
        lstPricingResponse.setOriginalPremium(lstPricingResponse.getOriginalPremium());
        lstPricingResponse.setEndorsementPremium(lstPricingResponse.getEndorsementPremium());
        lstPricingResponse.setPremiumDifference(lstPricingResponse.getPremiumDifference());
        List<LstTaxComponentDetails> lstTaxComponentDetails = new ArrayList<>();
        lstTaxComponentDetails.add(new LstTaxComponentDetails());
        motorPolicy.setLstTaxComponentDetails(new LstTaxComponentDetails(taxComponent, taxComponent2Year, taxComponent3Year));
        motorPolicy.setLstPricingResponse(lstPricingResponse);
        return motorPolicy;
    }
}
