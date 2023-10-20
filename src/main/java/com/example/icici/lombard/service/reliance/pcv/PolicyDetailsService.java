package com.example.icici.lombard.service.reliance.pcv;

import com.example.icici.lombard.dto.reliance.request.pcv.*;
import org.springframework.stereotype.Service;

@Service
public class PolicyDetailsService {
    public PolicyDetails getPcvPolicyDetails(PolicyDetails policyDetails){
        policyDetails.setClientDetails(new ClientDetails(0));

        Policy policy=new Policy();
        policy.setBusinessType(5);
        policy.setCover_From("24/06/2019");
        policy.setCover_To("23/06/2020");
        policy.setBranch_Code(9202);
        policy.setAgentName("Direct");
        policy.setProductcode(2353);
        policy.setOtherSystemName(1);
        policy.setMotorQuote(false);
        policyDetails.setPolicy(policy);

        Risk risk=new Risk();
        risk.setVehicleMakeID(5);
        risk.setVehicleModelID(20527);
        risk.setCubicCapacity(200);
        risk.setZone("B");
        risk.setRTOLocationID(561);
        risk.setIDV(risk.getIDV());
        risk.setDateOfPurchase("01/01/2017");
        risk.setManufactureMonth(1);
        risk.setManufactureYear(2017);
        risk.setEngineNo("E87988955555");
        risk.setChassis("C1324655655");
        risk.setIsVehicleHypothicated(true);
        risk.setFinanceType(1);
        risk.setFinancierName("Hdfc Bank");
        risk.setFinancierAddress("KALYAN");
        risk.setIsRegAddressSameasCommAddress(true);
        risk.setIsRegAddressSameasPermanentAddress(true);
        risk.setIsPermanentAddressSameasCommAddress(true);
        risk.setVehicleVariant("LX");
        risk.setStateOfRegistrationID(21);
        risk.setRto_RegionCode("MH05");
        policyDetails.setRisk(risk);

        Vehicle vehicle=new Vehicle();
        vehicle.setRegistration_Number("MH-05-AS-2544");
        vehicle.setRegistration_date("01/01/2017");
        vehicle.setSeatingCapacity(2);
        vehicle.setTypeOfFuel(1);
        vehicle.setISNewVehicle(false);
        policyDetails.setVehicle(vehicle);

        policyDetails.setCover(policyDetails.getCover());

        PreviousInsuranceDetails previousInsuranceDetails=new PreviousInsuranceDetails();
        previousInsuranceDetails.setPrevYearInsurer(5);
        previousInsuranceDetails.setPrevYearPolicyNo("HDFC321321654654649");
        previousInsuranceDetails.setPrevYearPolicyStartDate("22/06/2018");
        previousInsuranceDetails.setPrevYearPolicyEndDate("23/06/2019");
        previousInsuranceDetails.setIsClaimedLastYear(true);
        policyDetails.setPreviousInsuranceDetails(previousInsuranceDetails);

        policyDetails.setProductCode(2353);
        policyDetails.setUserID(100002);
        policyDetails.setValidateFlag(false);
        policyDetails.setSourceSystemID(100002);
        policyDetails.setAuthToken("Pass@123");
        return policyDetails;
    }
}
