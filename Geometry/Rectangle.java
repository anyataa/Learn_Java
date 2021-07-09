package Geometry;

public class Rectangle {
    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

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
