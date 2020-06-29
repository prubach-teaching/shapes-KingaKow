package pl.waw.sgh.shapes;

public class PlayWithShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 9);
        System.out.println("Surface R1: " + r1.calcSurface());
        System.out.println("Perimeter R1: " + r1.calcPerimeter());

        Circle c1 = new Circle(6);
        System.out.println("C1: " + c1);
        System.out.println("Surface C1: " + c1.calcSurface());

        Square s1 = new Square(2);
        System.out.println("S1: " + s1);
        System.out.println("Surface S1: " + s1.calcSurface());
        System.out.println("Perimeter S1: " + s1.calcSurface());

        Triangle t1 = new Triangle(5,5,8,3);
        System.out.println("T1: "  + t1);
        System.out.println("Surface T1: " + t1.calcSurface());
        System.out.println("Perimeter T1: " + t1.calcPerimeter());

        EquilateralTriangle et1 = new EquilateralTriangle(11);
        System.out.println("ET1: " + et1);
        System.out.println("Surface ET1: " + et1.calcSurface());
        System.out.println("Perimeter ET1: " + et1.calcPerimeter());
    }

}
