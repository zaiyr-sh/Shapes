package com.company;
class Circle extends Main {
    private double radius;

    public Circle(String color, boolean filled, double radius){
        super(color, filled);

        if (radius < 0.0) {
            throw new IllegalArgumentException("Radius must be >= 0.0");
        }

        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

