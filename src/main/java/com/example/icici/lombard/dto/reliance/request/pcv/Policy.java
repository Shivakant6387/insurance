package com.example.icici.lombard.dto.reliance.request.pcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    private int BusinessType;
    private String Cover_From;
    private String Cover_To;
    private int Branch_Code;
    private String AgentName;
    private int productcode;
    private int OtherSystemName;
    private boolean isMotorQuote;
    private Object isMotorQuoteFlow;
    private  PolicyTenure policyTenure;
}
