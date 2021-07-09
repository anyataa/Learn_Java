package Geometry;

public class TrianglePrism extends Triangle {
    private float prismheight;

    public TrianglePrism(float base, float height, float prismheight) {
        super(base, height);
        this.prismheight = prismheight;
        // TODO Auto-generated constructor stub
    }

    @Override
    public float countArea() {
        // TODO Auto-generated method stub
        return super.countArea() * 2 + prismheight * getHeight() * 2 + prismheight * getBase() * 2;
    }

    @Override
    public float countCircum() {
        // TODO Auto-generated method stub
        return (super.countCircum() * 2) + (3 * getHeight());
    }

    public float countVolume() {
        return super.countArea() * prismheight;
    }

}
