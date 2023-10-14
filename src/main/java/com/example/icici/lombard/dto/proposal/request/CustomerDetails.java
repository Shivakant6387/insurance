package com.example.icici.lombard.dto.proposal.request;



import java.util.Date;


public class CustomerDetails {
    private String CustomerType;

    private String CustomerName;

    private Date DateOfBirth;

    private String PinCode;

    private String PanCardNo;

    private String Email;

    private String MobileNumber;

    private String AddressLine1;

    private int CountryCode;

    private int StateCode;

    private int CityCode;

    private String Gender;

    private String MobileISD;

    private Object GstDetails;

    private String AadharNumber;

    private boolean IsCollectionOfForm60;

    private Object AadharEnrollmentNo;

    private String EIANumber;

    private Object CorelationId;

    public CustomerDetails(String customerType, String customerName, Date dateOfBirth, String pinCode, String panCardNo, String email, String mobileNumber, String addressLine1, int countryCode, int stateCode, int cityCode, String gender, String mobileISD, Object gstDetails, String aadharNumber, boolean isCollectionOfForm60, Object aadharEnrollmentNo, String EIANumber, Object corelationId) {
        CustomerType = customerType;
        CustomerName = customerName;
        DateOfBirth = dateOfBirth;
        PinCode = pinCode;
        PanCardNo = panCardNo;
        Email = email;
        MobileNumber = mobileNumber;
        AddressLine1 = addressLine1;
        CountryCode = countryCode;
        StateCode = stateCode;
        CityCode = cityCode;
        Gender = gender;
        MobileISD = mobileISD;
        GstDetails = gstDetails;
        AadharNumber = aadharNumber;
        IsCollectionOfForm60 = isCollectionOfForm60;
        AadharEnrollmentNo = aadharEnrollmentNo;
        this.EIANumber = EIANumber;
        CorelationId = corelationId;
    }

    public CustomerDetails() {
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }

    public String getPanCardNo() {
        return PanCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        PanCardNo = panCardNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int countryCode) {
        CountryCode = countryCode;
    }

    public int getStateCode() {
        return StateCode;
    }

    public void setStateCode(int stateCode) {
        StateCode = stateCode;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobileISD() {
        return MobileISD;
    }

    public void setMobileISD(String mobileISD) {
        MobileISD = mobileISD;
    }

    public Object getGstDetails() {
        return GstDetails;
    }

    public void setGstDetails(Object gstDetails) {
        GstDetails = gstDetails;
    }

    public String getAadharNumber() {
        return AadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        AadharNumber = aadharNumber;
    }

    public boolean isCollectionOfForm60() {
        return IsCollectionOfForm60;
    }

    public void setCollectionOfForm60(boolean collectionOfForm60) {
        IsCollectionOfForm60 = collectionOfForm60;
    }

    public Object getAadharEnrollmentNo() {
        return AadharEnrollmentNo;
    }

    public void setAadharEnrollmentNo(Object aadharEnrollmentNo) {
        AadharEnrollmentNo = aadharEnrollmentNo;
    }

    public String getEIANumber() {
        return EIANumber;
    }

    public void setEIANumber(String EIANumber) {
        this.EIANumber = EIANumber;
    }

    public Object getCorelationId() {
        return CorelationId;
    }

    public void setCorelationId(Object corelationId) {
        CorelationId = corelationId;
    }
}
