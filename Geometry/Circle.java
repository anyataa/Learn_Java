package Geometry;

public class Circle {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float countCircum() {
        return 22 * radius / 7 * 2;
    }

    public float countArea() {
        return 22 * radius / 7 * radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

}
