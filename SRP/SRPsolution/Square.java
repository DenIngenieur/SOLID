/**
 * Notice that we got rid of the output method here.
 * Now this shape class has only one reason to change,
 * that is if something pertaining to this shape changes.
 * Also, we're programming against an interface now (Shape).
 */

package be.ucll.ooo.solid;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    @Override
    public double calculateArea(){
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter(){
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
