package Geometry;

public class Triangle {
    private float base;
    private float height;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    // Right Triangle
    public float countCircum() {
        // count hipotenuse with Phytagoras
        return (float) (base + height + Math.sqrt((base * base) + (height * height)));
    }

    public float countArea() {
        return (base / 2 * height);
    }

}
