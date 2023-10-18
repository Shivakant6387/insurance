package com.example.icici.lombard.dto.reliance.request.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NCBEligibility {
    private Integer NCBEligibilityCriteria;
    private String NCBReservingLetter;
    private Integer PreviousNCB;
    private Integer CurrentNCB;
}
