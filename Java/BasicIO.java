import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BasicIO {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.print("Bu"); //println() creates new lines, print() does not
        //System.out.println("zz");
        //System.out.printf("%12.5f", 5.67867534356); //12 spaces, 5 places after the decimal


        //NumberFormat usa = NumberFormat.getCurrencyInstance();
        //To use other locales,
        //NumberFormat othCountry = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //System.out.println(othCountry.format(5.23));

        Scanner kb = new Scanner(System.in);
        System.out.println("Hi there, Billy Joe!");
        String response = kb.nextLine(); //if you have a nextInt followed by a nextLine, it won't work!
        // Instead, use kb.nextLine() and parse it as what you want: e.g. "Integer.parseInt()" and "Double.parseDouble()";
        //System.out.println("\n\n\n\n\n" + response);

        //Using Scanner to read files!
        Scanner file = new Scanner(new File("BasicIO.java"));
        while (file.hasNextLine()) {
        	String line = file.nextLine();
        	System.out.println(line);
        }
      }
}

//use number format class for currency
