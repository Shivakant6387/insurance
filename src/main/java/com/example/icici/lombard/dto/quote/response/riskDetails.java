package com.example.icici.lombard.dto.quote.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class riskDetails {
    private String basicOD;
    private String basicTP;
    private Integer paidDriver;
    private Integer employeesOfInsured;
    private Integer geographicalExtensionOD;
    private Integer geographicalExtensionTP;
    private Integer electricalAccessories;
    private Integer nonElectricalAccessories;
    private Integer consumables;
    private  Integer zeroDepreciation;
    private Integer returnToInvoice;
    private Integer roadSideAssistance;
    private Integer engineProtect;
    private Integer keyProtect;
    private Integer lossOfPersonalBelongings;
    private Integer paCoverForUnNamedPassenger;
    private Integer paCoverForOwnerDriver;
    private Integer voluntaryDiscount;
    private Integer antiTheftDiscount;
    private Integer automobileAssociationDiscount;
    private Integer handicappedDiscount;
    private Integer tppD_Discount;
    private Integer bonusDiscount;
}
