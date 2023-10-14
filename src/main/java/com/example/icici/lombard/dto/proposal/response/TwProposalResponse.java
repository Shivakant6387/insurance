package com.example.icici.lombard.dto.proposal.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwProposalResponse {
    private RiskDetails riskDetails;
    private String correlationId;
    private GeneralInformation generalInformation;
    private int totalOwnDamagePremium;
    private int totalLiabilityPremium;
    private int packagePremium;
    private int specialDiscount;
    private int totalTax;
    private int finalPremium;
    private Object roadSideAssistanceService;
    private String deviationMessage;
    private boolean isQuoteDeviation;
    private boolean breakingFlag;
    private String message;
    private String status;

    public void setIsQuoteDeviation(boolean b) {

    }
}
