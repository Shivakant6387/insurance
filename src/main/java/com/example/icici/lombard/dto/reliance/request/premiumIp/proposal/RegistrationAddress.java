package com.example.icici.lombard.dto.reliance.request.premiumIp.proposal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationAddress {
    private Integer AddressType;
    private String Address1;
    private String Address2;
    private String Address3;
    private Integer CityID;
    private Integer DistrictID;
    private Integer StateID;
    private Integer Pincode;
    private String Country;
    private String NearestLandmark;
}
