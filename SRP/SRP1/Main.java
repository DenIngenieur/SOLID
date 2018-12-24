/**
 * We have several shapes, all of them able to return their area and their perimeter.
 * However, we also put in an output method in each class, that outputs HTML.
 * You can easily see that this is the wrong thing to do, if you consider that someone
 * might come along an request another type of output, f.i. JSON.
 * In that case, we will need to update all shape classes (there may be many of those).
 * In other words, the shape class should have one, and only one, reason to change, now it has two.
 * First, if something pertaining to the shape changes.
 * And second, if something pertaining to the output changes.
 * So we really should separate the output from the shape classes.
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Square square = new Square(5);

        System.out.println(circle.outputAsHTML());
        System.out.println(square.outputAsHTML());
    }
}
