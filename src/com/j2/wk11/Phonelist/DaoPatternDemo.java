package com.j2.wk11.Phonelist;

public class DaoPatternDemo {
   public static void main(String[] args) {
      PeopleDao peopleDao = new PeopleDaoImpl();

      for (People people : peopleDao.getAllPeoples()) {
         System.out.println("Phonelist: [PhoneNumber : " + people.getPhoneNo() + ", Name : " + people.getName() + " ]");
      }


      People newpeople1 = new People("강주영", "010-8569-8715");
      peopleDao.updatePeople(newpeople1);
      for (People people : peopleDao.getAllPeoples()) {
          System.out.println("Phonelist: [PhoneNumber : " + people.getPhoneNo() + ", Name : " + people.getName() + " ]");
       }
      
      peopleDao.deletePeople(newpeople1);
      for (People people : peopleDao.getAllPeoples()) {
          System.out.println("Phonelist: [PhoneNumber : " + people.getPhoneNo() + ", Name : " + people.getName() + " ]");
       }
   }
}