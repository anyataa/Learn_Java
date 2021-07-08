package Geometry;

public class Rectangle {
    public float length;
    public float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float countCircum() {
        return 2 * (length + width);
    }

    public float countArea() {
        return length * width;
    }

}
