import java.text.DecimalFormat;

/**
 * @author ak-chelibashki
 */
public class Triangle extends Shape{
    /**
     * Class instances
     */
    private int height, base;
    private String shape = "Triangle", sArea;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    /**
     * Class constructor
     * @param colour
     * @param height
     * @param base
     */
    public Triangle(String colour, int height, int base) {
        super(colour);
        this.height = height;
        this.base = base;
    }//end constructor

    //inherited method
    public void whatAmI() {
        super.whatAmI(shape, calculateArea());
    }//end method whatAmI

    @Override
    public String calculateArea() {
        // TODO Auto-generated method stub
        double area=0;
        area = (height*base)/2;

        sArea=""+df2.format(area);
        return sArea;
    }

}
