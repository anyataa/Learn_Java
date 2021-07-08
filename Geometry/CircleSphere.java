package Geometry;

public class CircleSphere extends Circle {

    public CircleSphere(float radius) {
        super(radius);
        // TODO Auto-generated constructor stub
    }

    @Override
    public float countArea() {
        // TODO Auto-generated method stub
        return super.countArea() * 4;
    }

    @Override
    public float countCircum() {
        // TODO Auto-generated method stub
        return super.countCircum();
    }

    public float countVolume() {
        return super.countArea() * radius * 4 / 3;
    }

}
