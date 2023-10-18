package com.example.icici.lombard.dto.reliance.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoverDetail {
    private String CoverageName;
    private int CoverageID;
    private boolean Ismandatory;
    private ListValues ListValues;
}
