package com.example.icici.lombard.dto.reliance.request.premiumIp;

import com.example.icici.lombard.dto.reliance.request.ClientDetails;
import com.example.icici.lombard.dto.reliance.request.Policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyDetails {
    private CoverDetails coverDetails;
    private TrailerDetails trailerDetails;
//    private String CoverDetails;
//    private String TrailerDetails;
    private ClientDetails clientDetails;
    private Policy policy;
    private Risk risk;
    private Vehicle vehicle;
    private Cover cover;
    private PreviousInsuranceDetails previousInsuranceDetails;
    private Integer ProductCode;
    private Integer UserID;
    private NCBEligibility ncbEligibility;
    private String LstCoveragePremium;
    private Boolean ValidateFlag;
    private Integer SourceSystemID;
    private String AuthToken;
    private String LstTaxComponentDetails;
    private String LstAddOnCoverDetails;
}
