package com.example.icici.lombard.dto.reliance.request.gcv.premiumIp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PAToNamedPassenger {
    private Integer NoOfItems;
    private Integer SumInsured;
    private String PassengerName;
    private String NomineeName;
    private String NomineeDOB;
    private String NomineeRelationship;
    private String NomineeAddress;
    private String OtherRelation;
    private String AppointeeName;
}
