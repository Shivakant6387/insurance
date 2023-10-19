package com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.proposal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientAddress {
    private CommunicationAddress communicationAddress;
    private PermanentAddress permanentAddress;
    private RegistrationAddress registrationAddress;
    private InspectionAddress inspectionAddresse;
}
