package com.j2.wk7.shape;
public class ShapeFactory extends DrawingAbstractFactory {
    public Color getColor(String color) { return null; }
    public Shape getShape(String shape) {
        Shape s=null;
        String str=shape.toLowerCase();
        System.out.println("getShape "+str);
        if(str.equals("circle")) {
            s=new Circle();
        }
        else if(str.equals("rectangle"))
            s=new Rectangle();
        else if(str.equals("square"))
            s=new Square();
        return s;
    }
}