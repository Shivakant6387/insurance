package com.example.icici.lombard.dto.reliance.request.pcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyDetails {
    private ClientDetails clientDetails;
    private Policy policy;
    private Risk risk;
    private Vehicle vehicle;
    private Object Cover;
    private PreviousInsuranceDetails previousInsuranceDetails;
    private int ProductCode;
    private int UserID;
    private int LstCoveragePremium;
    private boolean ValidateFlag;
    private int SourceSystemID;
    private String AuthToken;
    private String LstTaxComponentDetails;
}
