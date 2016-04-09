package ru.javaportal.dp.factory;

/**
 * Created by Sergey on 09.04.2016.
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
