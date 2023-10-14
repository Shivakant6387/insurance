package com.example.icici.lombard.dto.proposal.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralInformation {
    private String vehicleModel;
    private String manufacturerName;
    private String manufacturingYear;
    private String vehicleDescription;
    private String rtoLocation;
    private int showRoomPrice;
    private String policyInceptionDate;
    private String policyEndDate;
    private String transactionType;
    private String cubicCapacity;
    private String proposalDate;
    private int depreciatedIDV;
    private String tenure;
    private String tpTenure;
    private String registrationDate;
    private String percentageOfDepreciation;
    private String proposalNumber;
    private String customerId;
}
