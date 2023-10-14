package com.example.icici.lombard.dto.proposal.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousPolicyDetails {
    private String PreviousPolicyType;
    private String PreviousInsurerName;
    private String PreviousPolicyNumber;
    private int PreviousPolicyTenure;
    private Date PreviousPolicyStartDate;
    private Date PreviousPolicyEndDate;
    private Boolean ClaimOnPreviousPolicy;
}
