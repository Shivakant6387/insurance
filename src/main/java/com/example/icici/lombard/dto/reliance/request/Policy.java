package com.example.icici.lombard.dto.reliance.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    private Integer BusinessType;
    private String Cover_From;
    private String Cover_To;
    private Integer Branch_Code;
    private String AgentName;
    private Integer productcode;
    private Integer OtherSystemName;
    private Boolean isMotorQuote;
    private String isMotorQuoteFlow;
    private String policyTenure;

}
