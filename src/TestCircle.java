public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3, "green");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and the color of the circle is " + c3.getColor());
        System.out.println();
        Circle c4 = new Circle();
        System.out.println("The color of the circle is " + c4.getColor());

        Circle c5 = new Circle();
        c5.setRadius(5.5);
        System.out.println("radius is: " + c5.getRadius());
        c5.setColor("green");
        System.out.println("color is: " + c5.getColor());
        System.out.println();
        Circle c6 = new Circle(5.5);
        System.out.println(c6.toString());
        System.out.println();
        Circle c7 = new Circle(6.6);
        System.out.println(c7.toString());  // explicit call
        System.out.println(c7);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c7);



    }
}

