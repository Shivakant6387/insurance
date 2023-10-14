package com.example.icici.lombard.dto.proposal.request;

import java.util.Date;

public class TwProposalRequest {

    private String BusinessType;

    private String DealId;

    private Date DeliveryOrRegistrationDate;

    private Date FirstRegistrationDate;

    private Date PolicyStartDate;

    private Date PolicyEndDate;

    private String ManufacturingYear;

    private String RegistrationNumber;

    private String ChassisNumber;

    private String EngineNumber;

    private String VehicleModelCode;

    private String RtoLocationCode;

    private String Tenure;

    private String TpTenure;

    private String ExShowRoomPrice;

    private String VehicleMakeCode;

    private String CstToState;

    private String CustomerType;

    private String CorrelationId;
    private CustomerDetails CustomerDetails;

    public TwProposalRequest() {
    }

    public TwProposalRequest(String businessType, String dealId, Date deliveryOrRegistrationDate, Date firstRegistrationDate, Date policyStartDate, Date policyEndDate, String manufacturingYear, String registrationNumber, String chassisNumber, String engineNumber, String vehicleModelCode, String rtoLocationCode, String tenure, String tpTenure, String exShowRoomPrice, String vehicleMakeCode, String cstToState, String customerType, String correlationId, com.example.icici.lombard.dto.proposal.request.CustomerDetails customerDetails) {
        BusinessType = businessType;
        DealId = dealId;
        DeliveryOrRegistrationDate = deliveryOrRegistrationDate;
        FirstRegistrationDate = firstRegistrationDate;
        PolicyStartDate = policyStartDate;
        PolicyEndDate = policyEndDate;
        ManufacturingYear = manufacturingYear;
        RegistrationNumber = registrationNumber;
        ChassisNumber = chassisNumber;
        EngineNumber = engineNumber;
        VehicleModelCode = vehicleModelCode;
        RtoLocationCode = rtoLocationCode;
        Tenure = tenure;
        TpTenure = tpTenure;
        ExShowRoomPrice = exShowRoomPrice;
        VehicleMakeCode = vehicleMakeCode;
        CstToState = cstToState;
        CustomerType = customerType;
        CorrelationId = correlationId;
        CustomerDetails = customerDetails;
    }

    public String getBusinessType() {
        return BusinessType;
    }

    public void setBusinessType(String businessType) {
        BusinessType = businessType;
    }

    public String getDealId() {
        return DealId;
    }

    public void setDealId(String dealId) {
        DealId = dealId;
    }

    public Date getDeliveryOrRegistrationDate() {
        return DeliveryOrRegistrationDate;
    }

    public void setDeliveryOrRegistrationDate(Date deliveryOrRegistrationDate) {
        DeliveryOrRegistrationDate = deliveryOrRegistrationDate;
    }

    public Date getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public void setFirstRegistrationDate(Date firstRegistrationDate) {
        FirstRegistrationDate = firstRegistrationDate;
    }

    public Date getPolicyStartDate() {
        return PolicyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        PolicyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return PolicyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        PolicyEndDate = policyEndDate;
    }

    public String getManufacturingYear() {
        return ManufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        ManufacturingYear = manufacturingYear;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getChassisNumber() {
        return ChassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        ChassisNumber = chassisNumber;
    }

    public String getEngineNumber() {
        return EngineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        EngineNumber = engineNumber;
    }

    public String getVehicleModelCode() {
        return VehicleModelCode;
    }

    public void setVehicleModelCode(String vehicleModelCode) {
        VehicleModelCode = vehicleModelCode;
    }

    public String getRtoLocationCode() {
        return RtoLocationCode;
    }

    public void setRtoLocationCode(String rtoLocationCode) {
        RtoLocationCode = rtoLocationCode;
    }

    public String getTenure() {
        return Tenure;
    }

    public void setTenure(String tenure) {
        Tenure = tenure;
    }

    public String getTpTenure() {
        return TpTenure;
    }

    public void setTpTenure(String tpTenure) {
        TpTenure = tpTenure;
    }

    public String getExShowRoomPrice() {
        return ExShowRoomPrice;
    }

    public void setExShowRoomPrice(String exShowRoomPrice) {
        ExShowRoomPrice = exShowRoomPrice;
    }

    public String getVehicleMakeCode() {
        return VehicleMakeCode;
    }

    public void setVehicleMakeCode(String vehicleMakeCode) {
        VehicleMakeCode = vehicleMakeCode;
    }

    public String getCstToState() {
        return CstToState;
    }

    public void setCstToState(String cstToState) {
        CstToState = cstToState;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getCorrelationId() {
        return CorrelationId;
    }

    public void setCorrelationId(String correlationId) {
        CorrelationId = correlationId;
    }

    public com.example.icici.lombard.dto.proposal.request.CustomerDetails getCustomerDetails() {
        return CustomerDetails;
    }

    public void setCustomerDetails(com.example.icici.lombard.dto.proposal.request.CustomerDetails customerDetails) {
        CustomerDetails = customerDetails;
    }
}
