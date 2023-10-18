package com.example.icici.lombard.dto.reliance.request.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cover {
    private Boolean IsPAToUnnamedPassengerCovered;
    private Boolean IsPAToOwnerDriverCoverd;
    private Boolean IsLiabilityToPaidDriverCovered;
    private Boolean IsLiabilityToEmployeeCovered;
    private Boolean IsPAToDriverCovered;
    private Boolean IsPAToPaidCleanerCovered;
    private Boolean IsBasicLiability;
    private Boolean IsBiFuelKit;
    private Boolean IsWorkmenCompensationExcludingDriver;
    private Boolean IsLiabilityForAccidentsInclude;
    private Boolean IsLiabilityForAccidentsExclude;
    private Boolean IsLiabilitytoCoolie;
    private Boolean IsLiabilitytoCleaner;
    private Boolean IsLiabilityToConductor;
    private Boolean IsPAToConductorCovered;
    private Boolean IsNFPPIncludingEmployees;
    private Boolean IsNFPPExcludingEmployees;
    private List<BifuelKit> bifuelKit;
    private List<PACoverToOwner> paCoverToOwner;
    private List<PAToNamedPassenger> paToNamedPassenger;
    private List<PAToUnNamedPassenger>paToUnNamedPassengers;
    private List<PAToPaidDriver>paToPaidDrivers;
    private List<PAToPaidCleaner>paToPaidCleaners;
    private List<LiabilityToPaidDriver>liabilityToPaidDriver;
    private List<LiabilityToEmployee> liabilityToEmployee;
    private List<NFPPIncludingEmployees> nfppIncludingEmployees;
    private List<WorkmenCompensationExcludingDriver>workmenCompensationExcludingDriver;
    private List<PAToConductor>paToConductor;
    private List<LiabilityToConductor> liabilityToConductor;
    private List<LiabilitytoCoolie>liabilitytoCoolie;
    private List<LegalLiabilitytoCleaner>legalLiabilitytoCleaner;

}
