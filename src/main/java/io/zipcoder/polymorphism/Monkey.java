package io.zipcoder.polymorphism;

public class Monkey extends Pet{
    public Monkey(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ooh ooh ah ah!";
    }
}
