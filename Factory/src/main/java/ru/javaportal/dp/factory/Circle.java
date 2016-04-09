package ru.javaportal.dp.factory;

/**
 * Created by Sergey on 09.04.2016.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
