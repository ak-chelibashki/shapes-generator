import java.text.DecimalFormat;

public class Square extends Shape{

    /**
     * Class instances
     */
    private int side;
    private String shape="Square", sArea;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    /**
     * Class constructor
     * @param colour
     * @param side
     */
    public Square(String colour, int side) {
        super(colour);
        this.side = side;
    } //end constructor


    @Override
    public String calculateArea() {
        // TODO Auto-generated method stub
        double area = side * side;
        sArea = df2.format(area);
        return(sArea);
    }

    public void whatAmI() {
        super.whatAmI(shape,calculateArea());
    }//end method whatAmI

}//end class

