import javax.swing.*;

/**
 * @author ak-chelibashki
 */
public abstract class Shape {
    //class instances
    private String colour;

    /**
     * Class constructor
     * @param colour
     */
    public Shape(String colour) {
        this.colour = colour;
    }//end constructor

    abstract public void whatAmI(); //abstract method
    abstract public String calculateArea(); // abstract method

    /**
     * Method to display shape name and area
     * @param myShape
     * @param myArea
     */
    public void whatAmI(String myShape, String myArea) {
        String output1 = "I am a " + colour + " " + myShape;
        String output2 = " with an area of" + myArea;
        // display message
        JOptionPane.showMessageDialog(null, output1, output2, JOptionPane.INFORMATION_MESSAGE);
    }//end whatAmI method

}//end
