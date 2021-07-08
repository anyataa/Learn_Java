package Geometry;

public class Circle {
    public float radius;

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
