package com.example.icici.lombard.controller.care;

import com.example.icici.lombard.dto.care.request.IntPolicyDataIO;
import com.example.icici.lombard.dto.care.request.Root;
import com.example.icici.lombard.service.care.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/care")
public class CareController {
    @Autowired
    private CareService careService;
    @GetMapping("/getIntPolicyDataIO")

    public ResponseEntity<Root> getCareService(Root intPolicyDataIO) {

        return ResponseEntity.ok(careService.getIntPolicyDataIO(intPolicyDataIO));
    }
}
