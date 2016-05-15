package com.j2.wk11.Phonelist;

public class People {
   private String name;
   private String PhoneNo;

   People(String name, String PhoneNo){
      this.name = name;
      this.PhoneNo = PhoneNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhoneNo() {
      return PhoneNo;
   }

   public void setPhoneNo(String PhoneNo) {
      this.PhoneNo = PhoneNo;
   }
}