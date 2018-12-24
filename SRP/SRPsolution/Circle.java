/**
 * Notice that we got rid of the output method here.
 * Now this shape class has only one reason to change,
 * that is if something pertaining to this shape changes.
 * Also, we're programming against an interface now (Shape).
 */

package be.ucll.ooo.solid;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
