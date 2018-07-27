public class EquilateralTriangle implements RegularPolygon {

    private int sideLength;

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return sideLength;
    }

    EquilateralTriangle(int length) {
        sideLength = length;
    }
}
