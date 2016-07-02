import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
public class GpaCalc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello, user!");
        processInput();
        System.out.println("Would you like to enter information for"
            + " another semester? (y/n)");
        String goAgain = kb.nextLine();
        if (goAgain.equals("y")) {
            processInput();
        }
    }

    public static void processInput() throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);
        String choice = "y";
        double totalPoints = 0.0;
        double totalCredits = 0.0;
        //Get name of semester, create the file
        System.out.print("Enter the semester:");
        String semester = kb.nextLine();
        System.out.print("\n");
        semester = semester.toLowerCase().replace(" ", "");
        PrintStream output = new PrintStream(new File(semester + ".txt"));

        do {
            System.out.print("Enter the course title: ");
            String courseName = kb.nextLine();
            System.out.print("\n");
            System.out.print("Enter the number of credits: ");
            String numCredits = kb.nextLine();
            System.out.print("\n");
            totalCredits = totalCredits + Double.parseDouble(numCredits);
            System.out.print("Enter the course grade: ");
            String grade = kb.nextLine();
            System.out.print("\n");
            totalPoints = totalPoints
                + (Double.parseDouble(grade) * Double.parseDouble(numCredits));
            output.println(courseName + " - " + numCredits + " credits. "
                + "Grade: " + grade);
            System.out.print("Would you like to enter another course? (y/n) ");
            choice = kb.nextLine();
            System.out.print("\n");
        } while (choice.equalsIgnoreCase("y"));
        Double gpa = totalPoints / totalCredits;
        output.print("GPA: ");
        output.printf("%3.2f", gpa);
        System.out.print("Overall GPA: ");
        System.out.printf("%3.2f", gpa);
        System.out.println();
    }
}