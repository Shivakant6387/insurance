package com.example.icici.lombard.service.Quote;

import com.example.icici.lombard.dto.quote.request.*;

public interface TwQuoteServiceImp {
    TWQuoteRequest getTwQuote(TWQuoteRequest twQuote);
    InsuranceTWQuoteRequest getInsuranceTwQoute(InsuranceTWQuoteRequest request);
    TwQuoteDetailsRequest getTwQuoteDetailsRequest(TwQuoteDetailsRequest twQuoteDetailsRequest);
    TwRoQuoteMandatoryRequest getTwRoQuoteMandatory(TwRoQuoteMandatoryRequest request);
    TwNBQuoteMandatory getTwNBQuoteAddons(TwNBQuoteMandatory twNBQuoteAddons);
}
