package com.bridgelabz;

public class ContactPerson {
    private String FirstName;
    private String LastName;
    private String Address;
    private String City;
    private String State;
    private String ZIPCode;
    private String MobileNo;
    private String emailId;


    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }


    public void setLastName(String lastName) {
        this.LastName = lastName;
    }


    public void setAddress(String address) {
        this.Address = address;
    }


    public void setCity(String city) {
        this.City = city;
    }


    public void setState(String state) {
        this.State = state;
    }


    public void setZIPCode(String zIPCode) {
        this.ZIPCode = zIPCode;
    }


    public void setMobileNo(String mobileNo) {
        this.MobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City
                + ", State=" + State + ", ZIPCode=" + ZIPCode + ", MobileNo=" + MobileNo + ", emailId=" + emailId + "]";
    }
}
