package com.j2.wk11.Phonelist;

import java.util.ArrayList;
import java.util.List;

public class PeopleDaoImpl implements PeopleDao {
 

   List<People> peoples;

   public PeopleDaoImpl(){
      peoples = new ArrayList<People>();
      People student1 = new People("강주영","010-7112-0493");
      People student2 = new People("홍길동","010-1234-0493");
      peoples.add(student1);
      peoples.add(student2);  
   }
   public void deletePeople(People people) {
    peoples.remove(people);
    System.out.println("People: Phone No " + people.getName() + ", deleted from database");
   }

  
   public List<People> getAllPeoples() {
      return peoples;
   }

   public void getPeople(String PhoneNo) {
      System.out.print(peoples);
   }

   public void updatePeople(People people) {
   peoples.add(people);
      System.out.println("People: Phone No " + people.getPhoneNo() + ", updated in the database");
   }

}