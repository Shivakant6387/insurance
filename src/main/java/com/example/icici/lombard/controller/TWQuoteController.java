package com.example.icici.lombard.controller;

import com.example.icici.lombard.dto.quote.request.*;
import com.example.icici.lombard.dto.quote.response.TWQuoteResponse;
import com.example.icici.lombard.service.Quote.TwQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/twquote")
public class TWQuoteController {
    private final TwQuoteService twQuoteService;

    @Autowired
    public TWQuoteController(TwQuoteService twQuoteService) {
        this.twQuoteService = twQuoteService;
    }

    @GetMapping("/getTwQuote")
    public ResponseEntity<TWQuoteRequest> getTWQuote(TWQuoteRequest twQuote) {
        TWQuoteRequest quote = twQuoteService.getTwQuote(twQuote);
        return ResponseEntity.ok(quote);
    }

    @PostMapping("/getTwQuotes")
    public ResponseEntity<TWQuoteResponse> insuranceTwQuite(@RequestBody TWQuoteRequest request) {
        TWQuoteResponse response = twQuoteService.insuranceTwQuote(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getInsuranceTwQuotes")
    public ResponseEntity<InsuranceTWQuoteRequest> getInsuranceTWQuote(InsuranceTWQuoteRequest request) {
        InsuranceTWQuoteRequest insuranceTWQuoteRequest = twQuoteService.getInsuranceTwQoute(request);
        return ResponseEntity.ok(insuranceTWQuoteRequest);
    }

    @GetMapping("/getTwQuoteDetailsRequest")
    public ResponseEntity<TwQuoteDetailsRequest> getTwQuoteDetailsRequest(TwQuoteDetailsRequest request) {
        return ResponseEntity.ok(twQuoteService.getTwQuoteDetailsRequest(request));
    }
    @GetMapping("/getTwRoQuoteMandatory")
    public ResponseEntity<TwRoQuoteMandatoryRequest>getTwRoQuoteMandatory(TwRoQuoteMandatoryRequest request){
        return ResponseEntity.ok(twQuoteService.getTwRoQuoteMandatory(request));
    }
    @GetMapping("/getTwNBQuoteMandatory")
    public ResponseEntity<TwNBQuoteMandatory> getTwNBQuoteMandatory(TwNBQuoteMandatory twNBQuoteAddons){
        return ResponseEntity.ok(twQuoteService.getTwNBQuoteAddons(twNBQuoteAddons));
    }
    @PostMapping("/getInsuranceTwQuote")
    public ResponseEntity<TWQuoteResponse> getInsuranceTwQuote(@RequestBody TWQuoteRequest request) {
        TWQuoteResponse response = twQuoteService.insuranceTwQuote(request);
        return ResponseEntity.ok(response);
    }
}
