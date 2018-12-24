package be.ucll.ooo.solid;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    // This is a new and different responsability.
    // What if someone comes along and wants a new way of output, say JSON?
    // We will need to update every shape class that we have!
    public String outputAsHTML (){
        String html = String.format("<p>\nArea = %1$,.2f m² \n<br>\nPerimeter = %2$,.2f m \n</p>", calculateArea(), calculatePerimeter());
        return html;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
