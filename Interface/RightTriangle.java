package Interface;

public class RightTriangle implements TwoDimensionGeometry {

    @Override
    public void drawShape(Double shapeHeight, Double shapeWidth) {

        characterShape(3, 3, "Triangle");
        System.out.println("The Area : " + countArea(shapeHeight, shapeWidth));
        System.out.println("The Circumference : " + countCircumference(shapeHeight, shapeWidth));

    }

    @Override
    public void characterShape(Integer shapeSides, Integer shapeVertices, String shapeName) {
        // TODO Auto-generated method stub
        TwoDimensionGeometry.super.characterShape(shapeSides, shapeVertices, shapeName);
    }

    @Override
    public Double countCircumference(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        return shapeWidth + shapeHeight + Math.sqrt((shapeHeight * shapeHeight) + (shapeWidth * shapeWidth));
    }

    @Override
    public Double countArea(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        return shapeHeight * shapeWidth / 2;
    }

}
