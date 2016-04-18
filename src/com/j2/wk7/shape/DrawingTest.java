package com.j2.wk7.shape;
public class DrawingTest {
    public static void main(String[] args) {
        DrawingAbstractFactory Factory=new ShapeFactory();
        Shape s=Factory.getShape("CIRCLE");
        s.show();
        Factory=new ColorFactory();
        Color c=Factory.getColor("red");
        c.fill();
        Factory = new ShapeFactory();
        s=Factory.getShape("RECTANGLE");
        s.show();
        Factory=new ColorFactory();
        c=Factory.getColor("blue");
        c.fill();
        Factory=new ShapeFactory();
        s=Factory.getShape("SQUARE");
        s.show();
        Factory = new ColorFactory();
        c=Factory.getColor("red");
        c.fill();
    }
}