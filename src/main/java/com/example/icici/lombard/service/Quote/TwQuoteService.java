package com.example.icici.lombard.service.Quote;

import com.example.icici.lombard.dto.quote.request.*;
import com.example.icici.lombard.dto.quote.response.TWQuoteResponse;
import com.example.icici.lombard.dto.proposal.response.GeneralInformation;
import com.example.icici.lombard.dto.proposal.response.RiskDetails;
import org.springframework.stereotype.Service;

@Service
public class TwQuoteService implements TwQuoteServiceImp{
    @Override
    public TWQuoteRequest getTwQuote(TWQuoteRequest twQuote) {
        return twQuote;
    }

    @Override
    public InsuranceTWQuoteRequest getInsuranceTwQoute(InsuranceTWQuoteRequest request) {
        request.setPreviousPolicyDetails(new PreviousPolicyDetails());
        return request;
    }

    @Override
    public TwQuoteDetailsRequest getTwQuoteDetailsRequest(TwQuoteDetailsRequest twQuoteDetailsRequest) {
        return twQuoteDetailsRequest;
    }

    @Override
    public TwRoQuoteMandatoryRequest getTwRoQuoteMandatory(TwRoQuoteMandatoryRequest request) {
        return request;
    }

    @Override
    public TwNBQuoteMandatory getTwNBQuoteAddons(TwNBQuoteMandatory twNBQuoteAddons) {
        return twNBQuoteAddons;
    }

    public TWQuoteResponse insuranceTwQuote(TWQuoteRequest request) {

        TWQuoteResponse response = new TWQuoteResponse();

        int totalOwnDamagePremium = calculateOwnDamagePremium(request);
        int totalLiabilityPremium = calculateLiabilityPremium(request);
        int packagePremium = totalOwnDamagePremium + totalLiabilityPremium;
        int totalTax = calculateTax(packagePremium);
        int finalPremium = packagePremium + totalTax;
        response.setRiskDetails(new RiskDetails());
        response.setCorrelationId(request.getCorrelationId());
        response.setGeneralInformation(new GeneralInformation());
        response.setTotalOwnDamagePremium(totalOwnDamagePremium);
        response.setTotalLiabilityPremium(totalLiabilityPremium);
        response.setPackagePremium(packagePremium);
        response.setSpecialDiscount(0);
        response.setTotalTax(totalTax);
        response.setFinalPremium(finalPremium);
        response.setRoadSideAssistanceService(null);
        response.setDeviationMessage("False");
        response.setIsQuoteDeviation(true);
        response.setBreakingFlag(false);
        response.setMessage("");
        response.setStatus("Success");
        return response;
    }

    private int calculateTax(int packagePremium) {
        double taxRate = 0.18;
        return (int) (packagePremium * taxRate);
    }

    private int calculateLiabilityPremium(TWQuoteRequest request) {
        int liabilityPremium = 5000;
        return liabilityPremium;
    }

    private int calculateOwnDamagePremium(TWQuoteRequest request) {
        int ownDamagePremium = 500;
        return ownDamagePremium;
    }
}
