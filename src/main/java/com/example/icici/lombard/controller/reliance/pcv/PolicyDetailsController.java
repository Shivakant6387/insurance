package com.example.icici.lombard.controller.reliance.pcv;

import com.example.icici.lombard.dto.reliance.request.pcv.PolicyDetails;
import com.example.icici.lombard.service.reliance.pcv.PolicyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcv/relaince")
public class PolicyDetailsController {

    private final PolicyDetailsService policyDetailsService;

    @Autowired
    public PolicyDetailsController(PolicyDetailsService policyDetailsService) {
        this.policyDetailsService = policyDetailsService;
    }
    @GetMapping(value = "/getPcvCoverageIpPolicyDetails",produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<PolicyDetails>getCoverageIpPolicyDetails(PolicyDetails policyDetails){
        return ResponseEntity.ok(policyDetailsService.getPcvPolicyDetails(policyDetails));
    }
}
