import java.io.IOException;

/**
* This class acts as a driver; it is a file in which you may use the
* ImageProcessor class.
* @author Krishna Ramdeep
* @version 13.31
*/


public class Photoslop {
    /**
    * The main method takes the command line input and uses it to modify
    * the picture with the correct mathod calls from the ImageProcessor
    * class.
    * @param args the required information to run the ImageProcessor methods
    * @throws IOException tells user that an input/output error has occurred
    */
    public static void main(String... args) throws IOException {
        if (args.length < 4) {
            printUsage();
            System.exit(0);
        }
        try {
            ImageProcessor imagePro = new ImageProcessor(new Pic(args[1]));

            if (args[0].equals("-a")) {
                //add mode
                Pic addedTo = imagePro.add(Integer.parseInt(args[2]));
                addedTo.save(args[3]);
                //add args[2] to the picture, then call
                //Save to args[3]
            } else if (args[0].equals("-m")) {
                //same as add, but multiply
                Pic addedTo = imagePro.multiply(Double.parseDouble(args[2]));
                addedTo.save(args[3]);
            } else if (args[0].equals("-c")) {
                //use this as your chroma key to match the greenscreen in
                //the lego guy image
                Pixel chromaKey = new Pixel(26, 185, 19, 1);
                //Your code here to apply the chroma key
                //transformation
                //It's up to you what you want the rgb deltas (thresholds)
                //to be,
                //I used something like 20, 40, 20
                Pic chromaPic = imagePro.chroma(chromaKey, 20, 40, 20);
                Pic chromaUsed = chromaPic.deepCopy();
                //Hint: to do this part, consider making another ImageProcessor
                //Your code here to apply the background (args[2])
                ImageProcessor greenScreen = new ImageProcessor(chromaUsed);
                Pic newBackgroundPic = greenScreen.background(new Pic(args[2]));
                //Finally, save to args[3]
                newBackgroundPic.save(args[3]);
            } else {
                printUsage();
            }
        } catch (IOException ex) {
            System.out.println("One of the files you referenced does not exist,"
                + " or is corrupted. Double-check and try again.");
        }
    }

    /**
    * This method is called if the user enters invalid input, and prints out
    * the multiple valid forms of input.
    */
    private static void printUsage() {
        System.out.println("Add mode: ");
        System.out.println("java -a imageFile n outputFile");
        System.out.println("");
        System.out.println("Multiply mode: ");
        System.out.println("java -m imageFile n outputFile");
        System.out.println("");
        System.out.println("Greenscreen mode: ");
        System.out.println("java -c imageFile backgroundFile outputFile");
    }
}
