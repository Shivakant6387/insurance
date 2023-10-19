package com.example.icici.lombard.dto.reliance.request.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LstPricingResponse {
    private Integer CoverID;
    private Double Premium;
    private Double Premium2Year;
    private Double Premium3Year;
    private String CoverageName;
    private Integer SumInsured;
    private Double OriginalPremium;
    private Double EndorsementPremium;
    private Double PremiumDifference;
}
