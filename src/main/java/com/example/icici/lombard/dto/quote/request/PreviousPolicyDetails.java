package com.example.icici.lombard.dto.quote.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PreviousPolicyDetails {
    private Date PreviousPolicyStartDate;
    private Date PreviousPolicyEndDate;
    private String PreviousPolicyType;
    private String BonusOnPreviousPolicy;
    private String PreviousPolicyNumber;
    private Boolean ClaimOnPreviousPolicy;
    private String TotalNoOfODClaims;
    private String NoOfClaimsOnPreviousPolicy;
    private String PreviousInsurerName;
    private Date PreviousVehicleSaleDate;
    private int PreviousPolicyTenure;
}
