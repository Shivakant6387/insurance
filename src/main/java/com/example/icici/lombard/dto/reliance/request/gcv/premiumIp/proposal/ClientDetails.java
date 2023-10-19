package com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.proposal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDetails {
    private Integer ClientType;
    private String LastName;
    private String MidName;
    private String ForeName;
    private String CorporateName;
    private Integer OccupationID;
    private String DOB;
    private String Gender;
    private String PhoneNo;
    private String MobileNo;
    private ClientAddress clientAddress;
    private String EmailID;
    private String Salutation;
    private Integer MaritalStatus;
    private Integer Nationality;
    private String PanNo;
    private Integer AadhaarNo;
    private Integer RegisteredUnderGST;
    private String RelatedParty;
    private String GSTIN;
    private Integer GroupCorpID;
    private Boolean IsExistingRGICustomer;
}
