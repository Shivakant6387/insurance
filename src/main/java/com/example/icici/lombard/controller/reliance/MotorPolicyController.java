package com.example.icici.lombard.controller.reliance;

import com.example.icici.lombard.dto.reliance.request.gcv.CoverageList;
import com.example.icici.lombard.dto.reliance.request.gcv.MotorPolicyRequest;
import com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.MotorPolicy;
import com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.PolicyDetails;
import com.example.icici.lombard.service.reliance.CoverageListService;
import com.example.icici.lombard.service.reliance.MotorPolicyServices;
import com.example.icici.lombard.service.reliance.PolicyDetailesService;
import com.example.icici.lombard.service.reliance.ProposalPolicyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motorPolicy")
public class MotorPolicyController {
    @Autowired
    private MotorPolicyServices motorPolicyServices;
    @Autowired
    private CoverageListService coverageListService;
    @Autowired
    private PolicyDetailesService policyDetailesService;
    @Autowired
    private ProposalPolicyDetailsService proposalPolicyDetailsService;

    @GetMapping(value = "/coverageList", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<CoverageList> getcoverageList(CoverageList coverageList) {
        return ResponseEntity.ok(coverageListService.getCoverageList(coverageList));
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<MotorPolicyRequest> getMotorPolicy() {
        System.out.println(motorPolicyServices.getMotorPolicy());
        return ResponseEntity.ok(motorPolicyServices.getMotorPolicy());
    }

    @GetMapping(value = "/getPolicyDetails", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<PolicyDetails> getPolicyDetails(PolicyDetails policyDetails) {
        return ResponseEntity.ok(policyDetailesService.getPolicyDetails(policyDetails));
    }

    @GetMapping(value = "/getMotorPolicy", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<MotorPolicy> getMotorPolicys() {
        return ResponseEntity.ok(motorPolicyServices.getMotorPolicys());
    }
    @GetMapping(value = "/getProposalPolicyDetails",produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.proposal.PolicyDetails> getAllPolicyDetails(com.example.icici.lombard.dto.reliance.request.gcv.premiumIp.proposal.PolicyDetails policyDetails){
        return ResponseEntity.ok(proposalPolicyDetailsService.getProposalPolicyDetails(policyDetails));
    }
}
