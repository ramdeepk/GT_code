import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
public class checkGpa {
	public static Scanner kb = new Scanner(System. in ); //Ask about this in recitation or in class. If created outside main(String[] args), would it be usable in processInput()?
	public static void main(String[] args) throws FileNotFoundException {
		//Call processInput and then ask the user if they would like to call it again
		System.out.println("Hello, user!");
		processInput();
		System.out.println("Would you like to enter information for another semester? (y/n)");
		String goAgain = kb.nextLine();
		if (goAgain == "y") {
			processInput();
		}
	}

	public static void processInput() throws FileNotFoundException { //Also ask about the necessity of static in the method definition
		String choice = "y";
		double totalPoints = 0.0;
		double totalCredits = 0.0;
		//Get name of semester, create the file
		System.out.print("Enter the semester:");
		String semester = kb.nextLine();
		System.out.print("\n");
		semester = semester.toLowerCase().replace(" ", ""); //ex. SpRinG2 0 1 5 -> spring2015
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
			totalPoints = totalPoints + (Double.parseDouble(grade) * Double.parseDouble(numCredits));
			output.println(courseName + " - " + numCredits + " credits. Grade: " + grade);
			System.out.print("Would you like to enter another course? (y/n) ");
			choice = kb.nextLine();
			System.out.print("\n");
		} while (choice.equalsIgnoreCase("y")); //I used a do-while because I wanted this code block to be executed at least once every time, and I used equalsIgnoreCase if the user enters Y/N instead of y/n
		Double gpa = totalPoints / totalCredits;
		output.printf("%3.2f", gpa);
		System.out.printf("%3.2f", gpa);
	}
}