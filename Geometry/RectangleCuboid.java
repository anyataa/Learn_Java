package Geometry;

public class RectangleCuboid extends Rectangle {
    private float height;

    public RectangleCuboid(float length, float width, float height) {
        super(length, width);
        this.height = height;
        // TODO Auto-generated constructor stub
    }

    @Override
    public float countArea() {
        // TODO Auto-generated method stub
        // how if all size is different
        return (2 * getLength() * getWidth()) + (2 * getLength() * height) + (2 * getWidth() * height);
    }

    @Override
    public float countCircum() {
        // TODO Auto-generated method stub
        return (super.countCircum() * 2) + (4 * height);
    }

    public float countVolume() {
        return super.countArea() * this.height;
    }
}
