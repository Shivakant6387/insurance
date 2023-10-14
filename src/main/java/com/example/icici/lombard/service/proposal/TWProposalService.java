package com.example.icici.lombard.service.proposal;
import com.example.icici.lombard.dto.proposal.request.CustomerDetails;
import com.example.icici.lombard.dto.proposal.request.TwProposalRequest;
import com.example.icici.lombard.dto.proposal.response.GeneralInformation;
import com.example.icici.lombard.dto.proposal.response.RiskDetails;
import com.example.icici.lombard.dto.proposal.response.TwProposalResponse;
import org.springframework.stereotype.Service;

@Service
public class TWProposalService implements TWProposalServiceImp {

 public TwProposalResponse calculateInsurance(TwProposalRequest request) {

  TwProposalResponse response = new TwProposalResponse();

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

 private int calculateLiabilityPremium(TwProposalRequest request) {
  int liabilityPremium = 5000;
  return liabilityPremium;
 }

 private int calculateOwnDamagePremium(TwProposalRequest request) {
  int ownDamagePremium = 500;
  return ownDamagePremium;
 }

 @Override
 public TwProposalRequest getAll(TwProposalRequest twProposalRequest) {
  twProposalRequest.setCustomerDetails(new CustomerDetails());
  return twProposalRequest;
 }
}
