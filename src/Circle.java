import java.text.DecimalFormat;

public class Circle extends Shape{

    /**
     * Class instance variables
     */
    private double radius;
    private String shape="Circle", sArea;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    /**
     * Class constructor
     * @param colour
     * @param radius
     */
    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    } //end constructor

    /**
     * Method to display shape type and shape area
     */
    public void whatAmI() {
        super.whatAmI(shape,calculateArea());
    }//end method whatAmI

    @Override
    public String calculateArea() {
        // TODO Auto-generated method stub
        double area =0;

        area = Math.PI * (radius * radius);
        sArea=""+df2.format(area);

        return sArea;
    }//end method

}//end class
