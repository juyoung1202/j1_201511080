package com.j2.wk10.Enumeration;

import java.util.*;

public class TestEnum{
  public static void main (String args[]) {
  Vector v = new Vector(Arrays.asList(args));
  Iterator iterator = new EnumerationIterator(v.elements());
  while (iterator.hasNext()) {
   System.out.println(iterator.next());
  }
 }
}