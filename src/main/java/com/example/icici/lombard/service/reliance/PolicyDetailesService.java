package com.example.icici.lombard.service.reliance;

import com.example.icici.lombard.dto.reliance.request.ClientDetails;
import com.example.icici.lombard.dto.reliance.request.Policy;
import com.example.icici.lombard.dto.reliance.request.premiumIp.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyDetailesService {
    public PolicyDetails getPolicyDetails(PolicyDetails policyDetails) {
        policyDetails.setCoverDetails(new CoverDetails());
        policyDetails.setTrailerDetails(new TrailerDetails());
//        policyDetails.setCoverDetails(policyDetails.getCoverDetails());
//        policyDetails.setTrailerDetails(policyDetails.getTrailerDetails());
        policyDetails.setClientDetails(new ClientDetails());
        policyDetails.setPolicy(new Policy());
        policyDetails.setRisk(new Risk());
        policyDetails.setVehicle(new Vehicle());
        List<BifuelKit> list = new ArrayList<>();
        list.add(new BifuelKit());
        List<PACoverToOwner> paCoverToOwnerList = new ArrayList<>();
        paCoverToOwnerList.add(new PACoverToOwner());
        List<PAToNamedPassenger> paToNamedPassengerList = new ArrayList<>();
        paToNamedPassengerList.add(new PAToNamedPassenger());
        List<PAToUnNamedPassenger> paToUnNamedPassengerList = new ArrayList<>();
        paToUnNamedPassengerList.add(new PAToUnNamedPassenger());
        List<PAToPaidDriver> paToPaidDriverList = new ArrayList<>();
        paToPaidDriverList.add(new PAToPaidDriver());
        List<PAToPaidCleaner> paToPaidCleanerList = new ArrayList<>();
        paToPaidCleanerList.add(new PAToPaidCleaner());
        List<LiabilityToPaidDriver> liabilityToPaidDriverList = new ArrayList<>();
        liabilityToPaidDriverList.add(new LiabilityToPaidDriver());
        List<LiabilityToEmployee> liabilityToEmployeeList = new ArrayList<>();
        liabilityToEmployeeList.add(new LiabilityToEmployee());
        List<NFPPIncludingEmployees> nfppIncludingEmployeesList = new ArrayList<>();
        nfppIncludingEmployeesList.add(new NFPPIncludingEmployees());
        List<WorkmenCompensationExcludingDriver> workmenCompensationExcludingDriverList = new ArrayList<>();
        workmenCompensationExcludingDriverList.add(new WorkmenCompensationExcludingDriver());
        List<PAToConductor> paToConductorList = new ArrayList<>();
        paToConductorList.add(new PAToConductor());
        List<LiabilityToConductor> liabilityToConductorList = new ArrayList<>();
        liabilityToConductorList.add(new LiabilityToConductor());
        List<LiabilitytoCoolie> liabilitytoCoolieList = new ArrayList<>();
        liabilitytoCoolieList.add(new LiabilitytoCoolie());
        List<LegalLiabilitytoCleaner> legalLiabilitytoCleanerList = new ArrayList<>();
        legalLiabilitytoCleanerList.add(new LegalLiabilitytoCleaner());
        policyDetails.setCover(new Cover(true
                , true, true,
                true, true,
                true, true,
                true, true,
                true, true,
                true, true,
                true, true,
                true, true,
                new ArrayList<>(list), new ArrayList<>(paCoverToOwnerList),
                new ArrayList<>(paToNamedPassengerList), new ArrayList<>(paToUnNamedPassengerList),
                new ArrayList<>(paToPaidDriverList), new ArrayList<>(paToPaidCleanerList),
                new ArrayList<>(liabilityToPaidDriverList), new ArrayList<>(liabilityToEmployeeList),
                new ArrayList<>(nfppIncludingEmployeesList), new ArrayList<>(workmenCompensationExcludingDriverList),
                new ArrayList<>(paToConductorList), new ArrayList<>(liabilityToConductorList),
                new ArrayList<>(liabilitytoCoolieList), new ArrayList<>(legalLiabilitytoCleanerList)));
        policyDetails.setPreviousInsuranceDetails(new PreviousInsuranceDetails());
        policyDetails.setNcbEligibility(new NCBEligibility());

        return policyDetails;
    }
}
