public class Square implements RegularPolygon {

    private int sideLength;

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return sideLength;
    }

    Square(int length) {
        sideLength = length;
    }

}
