/**
* This class is a picture modifier. It takes a picture, then uses one of its
* four methods to return an edited picture.
* @author Krishna Ramdeep
* @version 13.31
*/

public class ImageProcessor {
    private Pic picture;

    /**
    * This constructor creates an ImageProcessor that will modify existing
    * Pics.
    * @param picture ImageProcessor's private Pic value will be
    * initialized to this
    */
    public ImageProcessor(Pic picture) {
        this.picture = picture;
    }

    /**
    * This method adds a specified integer to the RGBA values of all
    * pixels in a Pic (Bounded by 0 and 255).
    * @param increment is the number (specified by the user) that will be
    * added to the RGBA values
    * @return a picture that will have its RGBA values modified
    * from the original
    */
    public Pic add(int increment) {
        Pic addPic = picture.deepCopy();
        Pixel[][] addPicArr = addPic.getPixels();
        for (int row = addPicArr.length - 1; row >= 0; row--) {
            for (int col = addPicArr[0].length - 1; col >= 0; col--) {
                Pixel pix = addPicArr[row][col];
                if (pix.getRed() + increment >= 255) {
                    pix.setRed(255);
                } else if (pix.getRed() + increment <= 0) {
                    pix.setRed(0);
                } else {
                    pix.setRed(pix.getRed() + increment);
                }

                if (pix.getGreen() + increment >= 255) {
                    pix.setGreen(255);
                } else if (pix.getGreen() + increment <= 0) {
                    pix.setGreen(0);
                } else {
                    pix.setGreen(pix.getGreen() + increment);
                }

                if (pix.getBlue() + increment >= 255) {
                    pix.setBlue(255);
                } else if (pix.getBlue() + increment <= 0) {
                    pix.setBlue(0);
                } else {
                    pix.setBlue(pix.getBlue() + increment);
                }

                if (pix.getAlpha() + increment >= 255) {
                    pix.setAlpha(255);
                } else if (pix.getAlpha() + increment <= 0) {
                    pix.setAlpha(0);
                } else {
                    pix.setAlpha(pix.getAlpha() + increment);
                }
            }
        }
        return addPic;
    }

    /**
    * This method multiplies a specified double to the RGBA values of
    * all pixels in a Pic (Bounded by 0 and 255).
    * @param scale is the double (specified by the user) that will be
    * multiplied to the RGBA values
    * @return a picture that will have its RGBA values modified from
    * the original
    */
    public Pic multiply(double scale) {
        Pic multPic = picture.deepCopy();
        Pixel[][] multArr = multPic.getPixels();
        for (int row = 0; row < multArr.length; row++) {
            for (int col = 0; col < multArr[0].length; col++) {
                Pixel pix = multArr[row][col];
                if (pix.getRed() * scale > 255) {
                    pix.setRed(255);
                } else if (pix.getRed() * scale < 0) {
                    pix.setRed(0);
                } else {
                    pix.setRed((int) (Math.round(pix.getRed() * scale)));
                }

                if (pix.getGreen() * scale > 255) {
                    pix.setGreen(255);
                } else if (pix.getGreen() * scale < 0) {
                    pix.setGreen(0);
                } else {
                    pix.setGreen((int) (Math.round(pix.getGreen() * scale)));
                }

                if (pix.getBlue() * scale > 255) {
                    pix.setBlue(255);
                } else if (pix.getBlue() * scale < 0) {
                    pix.setBlue(0);
                } else {
                    pix.setBlue((int) (Math.round(pix.getBlue() * scale)));
                }

                if (pix.getAlpha() * scale > 255) {
                    pix.setAlpha(255);
                } else if (pix.getAlpha() * scale < 0) {
                    pix.setAlpha(0);
                } else {
                    pix.setAlpha((int) (Math.round(pix.getAlpha() * scale)));
                }
            }
        }
        return multPic;
    }

    /**
    * This method checks whether or not a pixels RGB values are
    * within a range of it's key.
    * If this is the case, it will set that pixel's alpha to 0.
    * @param key the pixel that thepixel from the original image will
    * be compared to
    * @param dr the range for the original pixel's Red value
    * @param dg the range for the original pixel's Green value
    * @param db the range for the original pixel's Blue value
    * @return a picture that will have its alpha values modified
    * from the original
    */
    public Pic chroma(Pixel key, int dr, int dg, int db) {
        Pic chromaPic = picture.deepCopy();
        Pixel[][] chromaArr = chromaPic.getPixels();
        for (int row = 0; row < chromaArr.length; row++) {
            for (int col = 0; col < chromaArr[0].length; col++) {
                Pixel pix = chromaArr[row][col];
                if (Math.abs(pix.getRed() - key.getRed()) < dr
                    && Math.abs(pix.getGreen() - key.getGreen()) < dg
                    && Math.abs(pix.getBlue() - key.getBlue()) < db) {
                    pix.setAlpha(0);
                }
            }
        }
        return chromaPic;
    }

    /**
    * This method will check all an image's pictures, and if the pixel's alpha
    * value is 0,
    * it will replace that pixel with one from another image.
    * @param bg a Pic that will be used to replace the pixels from the
    * original image
    * @return an image that will have the pixels with an alpha of 0 replaced
    * with pixels from another image
    */
    public Pic background(Pic bg) {
        Pic bkcgPic = picture.deepCopy();
        Pixel[][] bkcgArr = bkcgPic.getPixels();
        Pixel[][] bgArr = bg.getPixels();
        for (int row = 0; row < bkcgArr.length; row++) {
            for (int col = 0; col < bkcgArr[0].length; col++) {
                Pixel pix = bkcgArr[row][col];
                Pixel bgPixel = bgArr[row][col];
                if (pix.getAlpha() == 0) {
                    pix.setRed(bgPixel.getRed());
                    pix.setGreen(bgPixel.getGreen());
                    pix.setBlue(bgPixel.getBlue());
                    pix.setAlpha(bgPixel.getAlpha());
                }
            }
        }
        return bkcgPic;
    }


}