package com.example.icici.lombard.dto.reliance.request.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LstTaxComponentDetails {
    private List<TaxComponent> taxComponent;
    private List<TaxComponent2Year> taxComponent2Year;
    private List<TaxComponent3Year> taxComponent3Year;
}
