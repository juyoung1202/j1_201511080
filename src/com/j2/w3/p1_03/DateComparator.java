package com.j2.w3.p1_03;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}