package com.example.icici.lombard.controller.reliance;

import com.example.icici.lombard.dto.reliance.request.CoverageList;
import com.example.icici.lombard.dto.reliance.request.MotorPolicyRequest;
import com.example.icici.lombard.service.reliance.CoverageListService;
import com.example.icici.lombard.service.reliance.MotorPolicyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/motorPolicy")
public class MotorPolicyController {
    @Autowired
    private MotorPolicyServices motorPolicyServices;
    @Autowired
    private CoverageListService coverageListService;
    @GetMapping(value = "/coverageList" ,produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<CoverageList>getcoverageList(CoverageList coverageList){
        return ResponseEntity.ok(coverageListService.getCoverageList(coverageList));
    }
    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE )
    public ResponseEntity<MotorPolicyRequest>getMotorPolicy(){
        System.out.println(motorPolicyServices.getMotorPolicy());
        return ResponseEntity.ok(motorPolicyServices.getMotorPolicy());
    }
}
