package com.example.icici.lombard.dto.reliance.request.pcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreviousInsuranceDetails {
    private int PrevYearInsurer;
    private String PrevYearPolicyNo;
    private String PrevYearPolicyStartDate;
    private String PrevYearPolicyEndDate;
    private boolean IsClaimedLastYear;
}
