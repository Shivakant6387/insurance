package com.example.icici.lombard.dto.proposal.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDetail {
    private String CustomerType;
    private String CustomerName;
    private Date DateOfBirth;
    private String PinCode;
    private String PANCardNo;
    private String Email;
    private String MobileNumber;
    private String AddressLine1;
    private String CountryCode;
    private String StateCode;
    private String CityCode;
}
