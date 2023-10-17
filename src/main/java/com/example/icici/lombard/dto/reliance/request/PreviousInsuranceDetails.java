package com.example.icici.lombard.dto.reliance.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousInsuranceDetails {
    private Integer PrevYearInsurer;
    private String PrevYearPolicyNo;
    private String PrevYearPolicyStartDate;
    private String PrevYearPolicyEndDate;
    private String IsClaimedLastYear;
}
