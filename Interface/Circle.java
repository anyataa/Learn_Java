package Interface;

import Geometry.TwoDimension;

public class Circle implements TwoDimensionGeometry {

    // set to radius??
    // ShapeHeight as Radius
    // <<<< I want to delete one of the parameter here >>>>
    @Override
    public void drawShape(Double Radius, Double notUsed) {
        // TODO Auto-generated method stub
        characterShape(0, 0, "Circle");
        System.out.println("The Area : " + countArea(Radius, Radius));
        System.out.println("The Circumference : " + countCircumference(Radius, Radius));

    }

    @Override
    public Double countCircumference(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        return 22 * (shapeHeight / 7) * 2;
    }

    @Override
    public Double countArea(Double shapeHeight, Double shapeWidth) {
        // TODO Auto-generated method stub
        return 22 * (shapeHeight / 7) * shapeHeight;
    }

    @Override
    public void characterShape(Integer shapeSides, Integer shapeVertices, String shapeName) {
        // TODO Auto-generated method stub
        TwoDimensionGeometry.super.characterShape(shapeSides, shapeVertices, shapeName);
    }

}
