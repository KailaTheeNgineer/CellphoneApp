package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model, carrier, phoneNumber, owner;

  public CellPhone() {
      this.serialNumber = 0;
      this.model = "";
      this.carrier = "";
      this.phoneNumber = "";
      this.owner = "";
  }
    public int getserialNumber() {
         return this.serialNumber;
      }
    public String getmodel() {
          return this.model;
    }
    public String getcarrier(){
           return this.carrier;
    }
    public String getphoneNumber(){
        return this.phoneNumber;
    }
    public String getowner(){
        return this.owner;
    }

    public void setserialNumber(int serialNumber){
      this.serialNumber = serialNumber;
    }
    public void setmodel(String model){
        this.model = model;
    }
    public void setcarrier(String carrier){
        this.carrier = carrier;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setowner(String owner){
        this.owner = owner;
    }










  }



