package be.ucll.ooo.solid;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double calculateArea(){
        return Math.pow(side, 2);
    }

    public double calculatePerimeter(){
        return 4 * side;
    }

    // This is a new and different responsability.
    // What if someone comes along and wants a new way of output, say JSON?
    // We will need to update every shape class that we have!
    public String outputAsHTML (){
        String html = String.format("<p>\nArea = %1$,.2f m² \n<br>\nPerimeter = %2$,.2f m \n</p>", calculateArea(), calculatePerimeter());
        return html;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
