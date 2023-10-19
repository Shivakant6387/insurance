package com.example.icici.lombard.dto.reliance.request.gcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MotorPolicyRequest {
    private ClientDetails clientDetails;
    private Policy policy;
    private Risk risk;
    private Vehicle vehicle;
    private Cover  cover;
    private PreviousInsuranceDetails previousInsuranceDetails;
    private Integer ProductCode;
    private Integer UserID;
    private String LstCoveragePremium;
    private Boolean ValidateFlag;
    private Integer SourceSystemID;
    private String AuthToken;
    private String LstTaxComponentDetails;
}
