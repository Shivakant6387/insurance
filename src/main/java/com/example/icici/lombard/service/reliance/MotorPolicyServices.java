package com.example.icici.lombard.service.reliance;

import com.example.icici.lombard.dto.reliance.request.*;
import org.springframework.stereotype.Service;

@Service
public class MotorPolicyServices {
    public MotorPolicyRequest getMotorPolicy() {
        MotorPolicyRequest request = new MotorPolicyRequest();
        request.setClientDetails(new ClientDetails(0));
        request.setPolicy(new Policy(5, "24/06/2019", "23/06/2020", 9202, "Direct", 2349, 1, false, "", ""));
        request.setRisk(new Risk(124, 37020, 200, "B", 561, "", 50000, "01/01/2017", 1, 2017, "E87988955555", "C1324655655", true, 1, "Hdfc Bank", "KALYAN", "", true, true, true, "LX", 21, "MH05"));
        request.setCover(new Cover(true));
        request.setVehicle(new Vehicle("MH-05-AS-2544", "01/01/2017", 2, 1, false));
        request.setPreviousInsuranceDetails(new PreviousInsuranceDetails(5, "HDFC321321654654649", "22/06/2018", "23/06/2019", "2023"));
        request.setProductCode(2349);
        request.setUserID(100002);
        request.setValidateFlag(false);
        request.setSourceSystemID(100002);
        request.setAuthToken("Pass@123");
        return request;
    }
}
