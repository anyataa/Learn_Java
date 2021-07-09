package Interface;

public interface TwoDimensionGeometry {
    public void drawShape(Double shapeHeight, Double shapeWidth);

    public Double countCircumference(Double shapeHeight, Double shapeWidth);

    public Double countArea(Double shapeHeight, Double shapeWidth);

    // The one and only default function
    // Because i want it to have body. Default body
    public default void characterShape(Integer shapeSides, Integer shapeVertices, String shapeName) {
        System.out.println();
        System.out.println();
        System.out.println("The shape name is " + shapeName);
        System.out.println("This shape has " + shapeSides + " sides");
        System.out.println("This shape has " + shapeVertices + " vertices");

    };
}
