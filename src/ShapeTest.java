public class ShapeTest {
    public static void main(String[] args) {
        RegularPolygon[] regularPolygons = {
                new EquilateralTriangle(5),
                new Square(6),
                new EquilateralTriangle(7),
                new Square(6),
        };
        System.out.println("Total sides of triangles: " + RegularPolygon.totalSides(regularPolygons));

        for (RegularPolygon rp : regularPolygons) {
            System.out.println("Perimeter is: " + rp.getPerimeter() +
                    " Interior angle is: " + rp.getInteriorAngle());
        }
    }
}
