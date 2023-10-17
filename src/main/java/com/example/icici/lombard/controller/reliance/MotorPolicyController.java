package com.example.icici.lombard.controller.reliance;

import com.example.icici.lombard.dto.reliance.request.MotorPolicyRequest;
import com.example.icici.lombard.service.reliance.MotorPolicyServices;
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
    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE )
    public ResponseEntity<MotorPolicyRequest>getMotorPolicy(){
        System.out.println(motorPolicyServices.getMotorPolicy());
        return ResponseEntity.ok(motorPolicyServices.getMotorPolicy());
    }
}
