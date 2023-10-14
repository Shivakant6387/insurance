package com.example.icici.lombard.dto.quote.request;

import java.time.LocalDate;

public class TWQuoteRequest {

    private String BusinessType;
    private String DealId;
    private  String DeliveryOrRegistrationDate;
    private String FirstRegistrationDate;
    private LocalDate PolicyStartDate;
    private LocalDate PolicyEndDate;
    private String ManufacturingYear ;
    private String VehicleMakeCode;
   private String Tenure;
   private String GSTToState;
   private  String CustomerType;
   private String VehicleModelCode;
   private String RTOLocationCode;
   private String ExShowRoomPrice;
   private String  CorrelationId;
   private Boolean IsNoPrevInsurance;

    public TWQuoteRequest() {
    }

    public TWQuoteRequest(String businessType, String dealId, String deliveryOrRegistrationDate, String firstRegistrationDate, LocalDate policyStartDate, LocalDate policyEndDate, String manufacturingYear, String vehicleMakeCode, String tenure, String GSTToState, String customerType, String vehicleModelCode, String RTOLocationCode, String exShowRoomPrice, String correlationId, Boolean isNoPrevInsurance) {
        BusinessType = businessType;
        DealId = dealId;
        DeliveryOrRegistrationDate = deliveryOrRegistrationDate;
        FirstRegistrationDate = firstRegistrationDate;
        PolicyStartDate = policyStartDate;
        PolicyEndDate = policyEndDate;
        ManufacturingYear = manufacturingYear;
        VehicleMakeCode = vehicleMakeCode;
        Tenure = tenure;
        this.GSTToState = GSTToState;
        CustomerType = customerType;
        VehicleModelCode = vehicleModelCode;
        this.RTOLocationCode = RTOLocationCode;
        ExShowRoomPrice = exShowRoomPrice;
        CorrelationId = correlationId;
        IsNoPrevInsurance = isNoPrevInsurance;
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

    public String getDeliveryOrRegistrationDate() {
        return DeliveryOrRegistrationDate;
    }

    public void setDeliveryOrRegistrationDate(String deliveryOrRegistrationDate) {
        DeliveryOrRegistrationDate = deliveryOrRegistrationDate;
    }

    public String getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public void setFirstRegistrationDate(String firstRegistrationDate) {
        FirstRegistrationDate = firstRegistrationDate;
    }

    public LocalDate getPolicyStartDate() {
        return PolicyStartDate;
    }

    public void setPolicyStartDate(LocalDate policyStartDate) {
        PolicyStartDate = policyStartDate;
    }

    public LocalDate getPolicyEndDate() {
        return PolicyEndDate;
    }

    public void setPolicyEndDate(LocalDate policyEndDate) {
        PolicyEndDate = policyEndDate;
    }

    public String getManufacturingYear() {
        return ManufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        ManufacturingYear = manufacturingYear;
    }

    public String getVehicleMakeCode() {
        return VehicleMakeCode;
    }

    public void setVehicleMakeCode(String vehicleMakeCode) {
        VehicleMakeCode = vehicleMakeCode;
    }

    public String getTenure() {
        return Tenure;
    }

    public void setTenure(String tenure) {
        Tenure = tenure;
    }

    public String getGSTToState() {
        return GSTToState;
    }

    public void setGSTToState(String GSTToState) {
        this.GSTToState = GSTToState;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getVehicleModelCode() {
        return VehicleModelCode;
    }

    public void setVehicleModelCode(String vehicleModelCode) {
        VehicleModelCode = vehicleModelCode;
    }

    public String getRTOLocationCode() {
        return RTOLocationCode;
    }

    public void setRTOLocationCode(String RTOLocationCode) {
        this.RTOLocationCode = RTOLocationCode;
    }

    public String getExShowRoomPrice() {
        return ExShowRoomPrice;
    }

    public void setExShowRoomPrice(String exShowRoomPrice) {
        ExShowRoomPrice = exShowRoomPrice;
    }

    public String getCorrelationId() {
        return CorrelationId;
    }

    public void setCorrelationId(String correlationId) {
        CorrelationId = correlationId;
    }

    public Boolean getNoPrevInsurance() {
        return IsNoPrevInsurance;
    }

    public void setNoPrevInsurance(Boolean noPrevInsurance) {
        IsNoPrevInsurance = noPrevInsurance;
    }
}
