public class ShapeDriver {

    public static void main (String argv[]) {
        //initialise Objects
        Square s1 = new Square("red", 6);
        Circle c1 = new Circle("yellow", 2.5);
        Triangle t1 = new Triangle("blue", 6, 3);


        //call methods in each object
        s1.whatAmI();
        c1.whatAmI();
        t1.whatAmI();
        //shape1.whatAmI("shape");
    }//end method main
}
