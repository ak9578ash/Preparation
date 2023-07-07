package com.interview.preparation.design_patterns.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());


        Shape clonedShape2 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}
