package com.j2.wk10.Enumeration;
  
import java.util.*;

public class IteratorEnumeration implements Enumeration {
 Iterator iterator;
 
 public IteratorEnumeration(Iterator iterator) {
  this.iterator = iterator;
 }
 
 public boolean hasMoreElements() {
  return iterator.hasNext();
 }
 
 public Object nextElement() {
  return iterator.next();
 }
}