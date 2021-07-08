package Geometry;

public class Triangle {
    public float base;
    public float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    // Right Triangle
    public float countCircum() {
        return (float) (base + height + Math.sqrt((base * base) + (height * height)));
    }

    public float countArea() {
        return (base / 2 * height);
    }

}
