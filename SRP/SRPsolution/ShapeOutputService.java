/**
 * Here we implement all possible output methods, pertaining to shapes.
 * We have outputAsHTML (see SRP1) but also outputAsJSON. Adding jet another
 * output method is easy now, we only have to do it here, not in all of the
 * different shape classes.
 */

package be.ucll.ooo.solid;

public class ShapeOutputService {
    public String outputAsHTML (Shape shape){
        String html = String.format("<p>\nArea = %1$,.2f m² \n<br>\nPerimeter = %2$,.2f m \n</p>", shape.calculateArea(), shape.calculatePerimeter());
        return html;
    }

    // There are better ways to do this, put just to make the point of a new output method...
    // New output method added. Doesn't affect the shape classes in any way.
    public String outputAsJSON (Shape shape){
        String json = String.format("{\n\"Area\" : %1$,.2f,\n\"Perimeter\" : %2$,.2f\n}", shape.calculateArea(), shape.calculatePerimeter());
        return json;
    }

    // add new output methods here...
}
