package ru.javaportal.dp.factory;

/**
 * Created by Sergey on 09.04.2016.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapedFactory shapedFactory = new ShapedFactory();

        Shape shape1 = shapedFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapedFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapedFactory.getShape("SQUARE");
        shape3.draw();

    }
}