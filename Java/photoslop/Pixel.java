/**
* This class creates a pixel, which has a value for red, green, blue, and
* alpha (RGBA). Pics are made up of Pixels.
* @author Krishna Ramdeep
* @version 42.69
*/
public class Pixel {
    private int red, green, blue, alpha;
    /**
    * Creates a pixel and, if the RGBA values are valid (they are between 0
    * and 255 inclusive), will initialize its RGBA vlaues.
    * @param red the integer representing the Pixel's red value
    * @param green the integer representing the Pixel's green value
    * @param blue the integer representing the Pixel's blue value
    * @param alpha the integer representing the Pixel's alpha value
    */
    public Pixel(int red, int green, int blue, int alpha) {
        if (red > 255 || red < 0 || green > 255
            || green < 0 || blue > 255 || blue < 0
            || alpha > 255 || alpha < 0) {
            System.out.println("Error! Invalid Pixel! Remember, all"
                + " RGBA values must be between 0 and 255, inclusive!");
            System.exit(0);
        } else {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.alpha = alpha;
        }
    }
    /**
    * This method returns the pixel's red value.
    * @return the pixel's red value
    */
    public int getRed() {
        return red;
    }
    /**
    * This method sets the pixel's red value to the
    * value of the argument,
    * if it is valid.
    * @param newRed the pixel's new red value
    */
    public void setRed(int newRed) {
        if (!isValidValue(newRed)) {
            System.out.println("This value for red is invalid.");
            System.exit(0);
        }
        red = newRed;
    }
    /**
    * This method returns the pixel's green value.
    * @return the pixel's green value
    */
    public int getGreen() {
        return green;
    }
    /**
    * This method sets the pixel's green value to the value of the
    * argument, if it is valid.
    * @param newGreen the pixel's new green value
    */
    public void setGreen(int newGreen) {
        if (!isValidValue(newGreen)) {
            System.out.println("This value for green is invalid.");
            System.exit(0);
        }
        green = newGreen;
    }
    /**
    * This method returns the pixel's blue value.
    * @return the pixel's blue value
    */
    public int getBlue() {
        return blue;
    }
    /**
    * This method sets the pixel's blue value to the value of
    * the argument, if it is valid.
    * @param newBlue the pixel's new blue value
    */
    public void setBlue(int newBlue) {
        if (!isValidValue(newBlue)) {
            System.out.println("This value for blue is invalid.");
            System.exit(0);
        }
        blue = newBlue;
    }
    /**
    * This method returns the pixel's alpha value.
    * @return the pixel's alpha value
    */
    public int getAlpha() {
        return alpha;
    }
    /**
    * This method sets the pixel's alpha value to the value of
    * the argument, if it is valid.
    * @param newAlpha the pixel's new alpha value
    */
    public void setAlpha(int newAlpha) {
        if (!isValidValue(newAlpha)) {
            System.out.println("This value for alpha is invalid.");
            System.exit(0);
        }
        alpha = newAlpha;
    }
    /**
    * Returns whether or not the user wants to set a pixel's RGBA to a
    * valid number.
    * @param rgbaValue the integer that the user plans to set one of the
    * pixel's RGBA values to
    * @return if the RGBA value is between 0 and 255 inclusive
    */
    public boolean isValidValue(int rgbaValue) {
        return (0 <= rgbaValue && rgbaValue <= 255) ? true : false;
    }

}
