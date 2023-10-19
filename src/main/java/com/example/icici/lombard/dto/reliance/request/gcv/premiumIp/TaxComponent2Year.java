package com.example.icici.lombard.dto.reliance.request.gcv.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxComponent2Year {
    private String TaxName;
    private Integer Rate;
    private Double Amount;
}
