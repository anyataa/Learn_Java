package Interface;

public class Rectangle implements TwoDimensionGeometry {

    @Override
    public void drawShape(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        characterShape(4, 4, "Rectangle");
        System.out.println("The Area : " + countArea(shapeHeight, shapeWidth));
        System.out.println("The Circumference : " + countCircumference(shapeHeight, shapeWidth));

    }

    @Override
    public Double countCircumference(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        return 2 * (shapeHeight + shapeWidth);
    }

    @Override
    public Double countArea(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        return shapeHeight * shapeWidth;
    }

    @Override
    public void characterShape(Integer shapeSides, Integer shapeVertices, String shapeName) {
        // TODO Auto-generated method stub
        TwoDimensionGeometry.super.characterShape(shapeSides, shapeVertices, shapeName);
    }

}
