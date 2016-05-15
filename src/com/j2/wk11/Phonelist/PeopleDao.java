package com.j2.wk11.Phonelist;

import java.util.List;

public interface PeopleDao {
   public List<People> getAllPeoples();
   public void getPeople(String PhoneNo);
   public void updatePeople(People People);
   public void deletePeople(People People);
}