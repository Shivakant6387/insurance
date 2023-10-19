package com.example.icici.lombard.dto.reliance.request.premiumIp.proposal;

import com.example.icici.lombard.dto.reliance.request.premiumIp.Cover;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Boolean isMotorQuoteFlow;
    private String PolicyTenure;

}
