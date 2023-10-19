package com.example.icici.lombard.service.reliance;

import com.example.icici.lombard.dto.reliance.request.premiumIp.*;
import com.example.icici.lombard.dto.reliance.request.premiumIp.proposal.*;
import com.example.icici.lombard.dto.reliance.request.premiumIp.proposal.Cover;
import com.example.icici.lombard.dto.reliance.request.premiumIp.proposal.PolicyDetails;
import com.example.icici.lombard.dto.reliance.request.premiumIp.proposal.Risk;
import com.example.icici.lombard.dto.reliance.request.premiumIp.proposal.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProposalPolicyDetailsService {
    public PolicyDetails getProposalPolicyDetails(PolicyDetails policyDetails) {
        CommunicationAddress communicationAddress = new CommunicationAddress();
        communicationAddress.setAddressType(0);
        communicationAddress.setAddress1("Sai Nivas");
        communicationAddress.setAddress2("Kk Road");
        communicationAddress.setAddress3("Yogi Dham");
        communicationAddress.setCityID(238881);
        communicationAddress.setDistrictID(321);
        communicationAddress.setStateID(21);
        communicationAddress.setPincode(400006);
        communicationAddress.setCountry("India");
        communicationAddress.setNearestLandmark(communicationAddress.getNearestLandmark());
        PermanentAddress permanentAddress = new PermanentAddress();
        permanentAddress.setAddressType(0);
        permanentAddress.setAddress1("Sai Nivas");
        permanentAddress.setAddress2("Kk Road");
        permanentAddress.setAddress3("Yogi Dham");
        permanentAddress.setCityID(238881);
        permanentAddress.setDistrictID(321);
        permanentAddress.setStateID(21);
        permanentAddress.setPincode(400006);
        permanentAddress.setCountry("India");
        permanentAddress.setNearestLandmark(communicationAddress.getNearestLandmark());
        RegistrationAddress registrationAddress = new RegistrationAddress();
        permanentAddress.setAddressType(0);
        registrationAddress.setAddress1("Sai Nivas");
        registrationAddress.setAddress2("Kk Road");
        registrationAddress.setAddress3("Yogi Dham");
        registrationAddress.setCityID(238881);
        registrationAddress.setDistrictID(321);
        registrationAddress.setStateID(21);
        registrationAddress.setPincode(400006);
        registrationAddress.setCountry("India");
        InspectionAddress inspectionAddresse = new InspectionAddress();
        ClientAddress clientAddress = new ClientAddress(communicationAddress, permanentAddress, registrationAddress, inspectionAddresse);
        ClientDetails clientDetails = new ClientDetails();
        clientDetails.setClientType(0);
        clientDetails.setLastName("Test");
        clientDetails.setMidName("Test");
        clientDetails.setForeName("Priyanka");
        clientDetails.setCorporateName(clientDetails.getCorporateName());
        clientDetails.setOccupationID(2048);
        clientDetails.setDOB("05/05/1983");
        clientDetails.setGender("Female");
        clientDetails.setPhoneNo(clientDetails.getPhoneNo());
        clientDetails.setMobileNo("7710849150");
        clientDetails.setEmailID("priyanka.deshmukh@relianceada.com");
        clientDetails.setSalutation("Mrs.");
        clientDetails.setMaritalStatus(1951);
        clientDetails.setNationality(1949);
        clientDetails.setPanNo("AWLPD4567A");
        clientDetails.setAadhaarNo(clientDetails.getAadhaarNo());
        clientDetails.setRegisteredUnderGST(1);
        clientDetails.setRelatedParty(clientDetails.getRelatedParty());
        clientDetails.setGSTIN("27AASCS2460H1Z0");
        clientDetails.setGroupCorpID(clientDetails.getGroupCorpID());
        clientDetails.setIsExistingRGICustomer(clientDetails.getIsExistingRGICustomer());
        clientDetails.setClientAddress(clientAddress);
        policyDetails.setClientDetails(clientDetails);
        policyDetails.setPolicy(new Policy(5, "09/04/2021", "07/04/2022", 9202, "Direct", 2349, 1, false, false, ""));
        Risk risk = new Risk();
        risk.setVehicleMakeID(124);
        risk.setVehicleModelID(37020);
        risk.setColour(risk.getColour());
        risk.setOtherColour(risk.getOtherColour());
        risk.setGrossVehicleWeight(3510);
        risk.setIsBHVehicle(false);
        risk.setCubicCapacity(2596);
        risk.setZone("A");
        risk.setRTOLocationID(571);
        risk.setExShowroomPrice(987756);
        risk.setIDV(0);
        risk.setDateOfPurchase("01/04/2017");
        risk.setLicensedCarryingCapacity(risk.getLicensedCarryingCapacity());
        risk.setNoOfWheels(4);
        risk.setManufactureMonth(04);
        risk.setManufactureYear(2017);
        risk.setEngineNo("E4567897687674574747");
        risk.setChassis("C5678757656558578787");
        risk.setTrailerIDV(risk.getTrailerIDV());
        risk.setIsVehicleHypothicated(true);
        risk.setFinanceType(1);
        risk.setFinancierName("YES BANK LIMITED");
        risk.setFinancierAddress("MUMBAI");
        risk.setFinancierCity("MUMBAI");
        risk.setIsRegAddressSameasCommAddress(true);
        risk.setIsRegAddressSameasPermanentAddress(true);
        risk.setIsPermanentAddressSameasCommAddress(true);
        risk.setStateOfRegistrationID(21);
        policyDetails.setRisk(risk);
        Vehicle vehicle = new Vehicle();
        vehicle.setRegistration_Number("MH-01-AR-4674");
        vehicle.setRegistrationNumber_New(vehicle.getRegistrationNumber_New());
        vehicle.setRegistration_date("01/04/2017");
        vehicle.setSeatingCapacity(2);
        vehicle.setTypeOfFuel(5);
        vehicle.setBodyType(98);
        vehicle.setISmanufacturerfullybuild(true);
        vehicle.setGCVSubTypeOfVehicleID(1);
        vehicle.setGCVGoodTypeOfVehicleID(2);
        vehicle.setISNewVehicle(false);
        policyDetails.setVehicle(vehicle);

        List<BifuelKit>bifuelKit=new ArrayList<>();
        bifuelKit.add(new BifuelKit("CNG",false,25000));

        List<PACoverToOwner>paCoverToOwnerList=new ArrayList<>();
        paCoverToOwnerList.add(new PACoverToOwner());

        List<PAToNamedPassenger>paToNamedPassengerList=new ArrayList<>();
        paToNamedPassengerList.add(new PAToNamedPassenger());

        List<PAToUnNamedPassenger>paToUnNamedPassengerList=new ArrayList<>();
        paToUnNamedPassengerList.add(new PAToUnNamedPassenger(2,200000));

        List<PAToPaidDriver>paToPaidDriverList=new ArrayList<>();
        paToPaidDriverList.add(new PAToPaidDriver(1,150000));

        List<PAToPaidCleaner>paToPaidCleanerList=new ArrayList<>();
        paToPaidCleanerList.add(new PAToPaidCleaner(1,10000));

        List<LiabilityToPaidDriver>liabilityToPaidDriverList=new ArrayList<>();
        liabilityToPaidDriverList.add(new LiabilityToPaidDriver(1,150000));

        List<LiabilityToEmployee>liabilityToEmployeeList=new ArrayList<>();
        liabilityToEmployeeList.add(new LiabilityToEmployee(1));

        List<NFPPIncludingEmployees>nfppIncludingEmployeesList=new ArrayList<>();
        nfppIncludingEmployeesList.add(new NFPPIncludingEmployees(0));

        List<NFPPExcludingEmployees>nfppExcludingEmployees=new ArrayList<>();
        nfppExcludingEmployees.add(new NFPPExcludingEmployees());

        List<WorkmenCompensationExcludingDriver>workmenCompensationExcludingDriverList=new ArrayList<>();
        workmenCompensationExcludingDriverList.add(new WorkmenCompensationExcludingDriver(0));

        List<PAToConductor>paToConductorList=new ArrayList<>();
        paToConductorList.add(new PAToConductor(1,10000));

        List<LiabilityToConductor>liabilityToConductorList=new ArrayList<>();
        liabilityToConductorList.add(new LiabilityToConductor(2));

        List<LiabilitytoCoolie>liabilitytoCoolieList=new ArrayList<>();
        liabilitytoCoolieList.add(new LiabilitytoCoolie());

        List<LegalLiabilitytoCleaner>legalLiabilitytoCleanerList=new ArrayList<>();
        legalLiabilitytoCleanerList.add(new LegalLiabilitytoCleaner(1,50000));

        Cover cover=new Cover(true,
                true,
                true,
                true,
                true,
                true,
                true,
                true,
                false,
                false,
                false,
                false,
                true,
                true,
                true,
                false,
                false,
                bifuelKit,
                paCoverToOwnerList,
                paToNamedPassengerList,
                paToUnNamedPassengerList,
                paToPaidDriverList,
                paToPaidCleanerList,
                liabilityToPaidDriverList,
                liabilityToEmployeeList,
                nfppIncludingEmployeesList,
                nfppExcludingEmployees,
                workmenCompensationExcludingDriverList,
                paToConductorList,
                liabilityToConductorList,
                liabilitytoCoolieList,
                legalLiabilitytoCleanerList
                );
        policyDetails.setCover(cover);

        PreviousInsuranceDetails previousInsuranceDetails=new PreviousInsuranceDetails();
        previousInsuranceDetails.setPrevInsuranceID(1);
        previousInsuranceDetails.setIsNCBApplicable(true);
        previousInsuranceDetails.setPrevYearPolicyNo("4256789708879875456546587");
        previousInsuranceDetails.setPrevYearInsurerAddress(238881);
        previousInsuranceDetails.setPrevYearPolicyStartDate("09/04/2019");
        previousInsuranceDetails.setPrevYearPolicyEndDate("08/04/2020");
        previousInsuranceDetails.setPrevYearNCB(2);
        policyDetails.setPreviousInsuranceDetails(previousInsuranceDetails);
        policyDetails.setNcbEligibility(new NCBEligibility());
        policyDetails.setUserID(100002);

        NCBEligibility ncbEligibility=new NCBEligibility();
        ncbEligibility.setNCBEligibilityCriteria(2);
        ncbEligibility.setPreviousNCB(2);
        policyDetails.setNcbEligibility(ncbEligibility);

        policyDetails.setValidateFlag(false);
        policyDetails.setSourceSystemID(100002);
        policyDetails.setAuthToken("Pass@123");
        return policyDetails;
    }
}