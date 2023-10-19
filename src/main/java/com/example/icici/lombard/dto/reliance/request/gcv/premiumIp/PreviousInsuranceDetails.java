package com.example.icici.lombard.dto.reliance.request.gcv.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousInsuranceDetails {
    private Integer PrevInsuranceID;
    private String IsVehicleOfPreviousPolicySold;
    private Boolean IsNCBApplicable;
    private Integer PrevYearInsurer;
    private String PrevYearPolicyNo;
    private Integer PrevYearInsurerAddress;
    private String DocumentProof;
    private Integer PrevYearPolicyType;
    private String PrevYearPolicyStartDate;
    private String MTAReason;
    private String PrevYearPolicyEndDate;
    private Integer PrevYearNCB;
    private String IsInspectionDone;
    private String InspectionDate;
    private String Inspectionby;
    private String InspectorName;
    private String IsNCBEarnedAbroad;
    private String ODLoading;
    private Boolean IsClaimedLastYear;
    private String ODLoadingReason;
    private String PreRateCharged;
    private String PreSpecialTermsAndConditions;
    private String IsTrailerNCB;
    private Integer InspectionID;
}
