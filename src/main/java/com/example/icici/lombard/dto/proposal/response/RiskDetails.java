package com.example.icici.lombard.dto.proposal.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiskDetails {
    private int basicOD;
    private int basicTP;
    private int paidDriver;
    private int employeesOfInsured;
    private int geographicalExtensionOD;
    private int geographicalExtensionTP;
    private int electricalAccessories;
    private int nonElectricalAccessories;
    private int consumables;
    private int zeroDepreciation;
    private int returnToInvoice;
    private int roadSideAssistance;
    private int engineProtect;
    private int keyProtect;
    private int lossOfPersonalBelongings;
    private int paCoverForUnNamedPassenger;
    private int paCoverForOwnerDriver;
    private int voluntaryDiscount;
    private int antiTheftDiscount;
    private int automobileAssociationDiscount;
    private int handicappedDiscount;
    private int tppD_Discount;
    private int bonusDiscount;
}
