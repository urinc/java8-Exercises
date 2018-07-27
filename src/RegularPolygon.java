public interface RegularPolygon {

    int getNumSides();

    int getSideLength();

    static int totalSides(RegularPolygon[] regularpolygon) {
        int sum = 0;
        for (RegularPolygon item : regularpolygon) {
            sum = sum + item.getNumSides();
        }
        return (sum);
    }

    default int getPerimeter() {
        return this.getNumSides() * this.getSideLength();
    }

    default double getInteriorAngle() {
        return (this.getNumSides() - 2) * Math.PI / this.getNumSides();
    }
}
