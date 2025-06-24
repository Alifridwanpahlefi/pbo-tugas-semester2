package tugaskelompok2122;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle c1 = (Circle) s1;
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3.getArea());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4.getArea());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2.getWidth());

        Square sq1 = (Square) r2;
        System.out.println(sq1.getSide());
    }
}
