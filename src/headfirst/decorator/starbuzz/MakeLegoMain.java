package com.j2.wk5;


public class MakeLegoMain {
  public static void main(String[] args) {
    Lego p = new Plate();
    Onebytwo b1 = new Onebytwo(6,4,p);
    int[][] a = b1.getLocation();
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }
}

abstract class Lego {
  public int x;
  public int y;
  public String type;
  public int location[][];
  
  abstract public String getType() ;
  public void getPos() {
    System.out.print("Current position of the "+type+" is "+"at ("+x+", "+y+")");
  }
  public int[][] getLocation() {
    return location;
  }
}

class Plate extends Lego {
  Plate() {
    int[][] b = super.getLocation();
    System.out.println(b[1]);
  }
  
}

abstract class BlockDecorator extends Lego {
  Lego lego;
}

class Onebytwo extends BlockDecorator{
  public int lenX = 2;
  public int lenY = 2;
  public int shape[] = {3,2};
  Onebytwo(int x, int y, Lego l) {
    this.type = "11+01";
    this.x = x;
    this.y = y;
    this.lego = l;
  }
  public void setLocation(){
    for (int i = x; i < lenX; i++) 
      for (int j = y; i < lenY; i++)
         lego.location[i][j] += shape[i - x][j - y];
 }
}

