/**
 * We have several shapes, all of them able to return their area and their perimeter.
 * We added an interface, that gets implemented by each shape now. The interface makes sure that
 * each shape implements two methods, on to calculate the area and one to calculate the
 * perimeter.
 * In addition, we make a service class, ShapeOutputService, that takes care of all the
 * different kinds of outputs a shape may need.
 *
 * Variation on the theme: a static class is also included: ShapeOutputServiceStatic. Both ways work.
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Square square = new Square(5);

        ShapeOutputService outputService = new ShapeOutputService();
        System.out.println(outputService.outputAsHTML(circle));
        System.out.println(outputService.outputAsJSON(square));

        System.out.println("");
        System.out.println("With a static outputclass:");
        System.out.println(ShapeOutputServiceStatic.outputAsJSON(circle));
        System.out.println(ShapeOutputServiceStatic.outputAsHTML(square));
    }
}
