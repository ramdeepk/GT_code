import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 * This class will act as a Driver, so we can make sure all our code works.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class College {
    /**
     * This method will be run when the program begins.
     * @param args Used for command line and things of the like.
     * Unused for this assignment.
     */
    public static void main(String... args) {
        JOptionPane.showMessageDialog(null, "Hello! You've been hired as a "
            + "Professor here! Today, you will use T-Cube to manage"
            + "  your CS1331 Course!");
        JOptionPane.showMessageDialog(null, "The software will use dialogs "
            + "to help you create your course. Then, you can manage the course"
            + " in the command line.");
        String profFName = JOptionPane.showInputDialog(null, "Now "
            + "enter your first name.");
        String profLName = JOptionPane.showInputDialog(null, "Thanks! Now "
            + "enter your last name.");
        String profUname = "AbstractionFTW!!";
        double funnyFactor = 0.62, gpa = 3.20;
        JOptionPane.showMessageDialog(null, "Hello, " + profFName + " "
            + profLName + "!\n Your T-Cube username will be: AbstractionFTW!!\n"
            + "and your password will be: ************\n"
            + "Your funny rating is 0.62.\n"
            + "And your average GPA is 3.20. Fail as many kids as you need "
            + "to maintain that.");
        Professor prof = new Professor(profFName, profLName, profUname,
            gpa, funnyFactor);
        TA headT = new TA("George", "P. Burdell", "gpb2015", 0.00, 0.00, 0.00);
        JOptionPane.showMessageDialog(null, "I've created a head TA for you. "
            + " His name is George P. Burdell.");
        TA wanda = new TA("Wanda", "P. Burdell", "wpb2018", 0.78, 0.86, 0.84);
        TA walter = new TA("Walter", "White", "wwhite2", 0.78, 0.86, 0.84);
        TA[] courseTAs = {wanda, walter};
        Student batman = new GradStudent("Bruce", "Wayne", "batman001");
        Student ash = new UndergradStudent("Ash", "Ketchum", "beTheVeryBest");
        Student joe = new UndergradStudent("Joe", "Jones", "mehIdontcare");
        Student will = new UndergradStudent("William", "James", "genericStud");
        Student[] csStudents = {batman, ash, joe, will};
        JOptionPane.showMessageDialog(null, "I've now created TAs and "
            + "Students for you. You have 2 total TAs and 4 Students"
            + " (1 GradStudent, 3 Undergrads). Add more Students later.");
        JOptionPane.showMessageDialog(null, "The following program will "
            + "exhaustively test every class and "
            + "method we had to create for this"
            + " assignment. I will make sure to demonstrate the properties of "
            + "inheiritance and polymorphism.");
        JOptionPane.showMessageDialog(null, "Now look at the command line! "
            + "Bye for now!");
        Course cs = new Course("CS 1331", prof, headT, courseTAs, csStudents);
        runCode(cs);
    }
    /**
     * This substance of this Driver class.
     * @param c The Course that will be used to show off our code.
     */
    public static void runCode(Course c) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Let's take a look at the professor first.");
        System.out.println("A Professor is-a Person, so it inherits "
            + "certain data and methods from"
            + " Person, like his firstName, lastName, and username.");
        System.out.println("For example, in our CS 1331 course, the "
            + "Professor's (your) name is: "
            + c.getProfessor().getFirstName() + " "
            + c.getProfessor().getLastName()
            + " and his/her (your) username is "
            + c.getProfessor().getUsername());
        System.out.println("But a Professor can also have its own data, like"
            + " an average GPA and a rating of how funny he or she is in"
            + " class. Your average GPA is: " + c.getProfessor().getGPA() + " "
            + "and your funny rating is: " + c.getProfessor().getFunnyFactor());
        System.out.println("We can even change some of this Professor's "
            + "data using \"setter\" methods. Let's do that now.");
        System.out.println("Enter what you want to change the average GPA to:");
        double newG = kb.nextDouble();
        c.getProfessor().setGPA(newG);
        System.out.println("Enter what you want to change the funny "
            + "factor to:");
        double fun = kb.nextDouble();
        c.getProfessor().setFunnyFactor(fun);
        System.out.println("\nYour data has been changed. The new values are: "
            + c.getProfessor().getGPA() + " for the GPA,\n"
            + "and " + c.getProfessor().getFunnyFactor()
            + " for the funny rating.\n\n");
        System.out.println("Students are also Persons. They also have name"
            + " data, but can study and relax, unlike the professor. The"
            + " following is the list of students in your course.");
        for (int i = 0; i < c.getStudents().length; i++) {
            System.out.println(c.getStudents()[i].getFirstName() + " "
                + c.getStudents()[i].getLastName() + " has studied for "
                + c.getStudents()[i].getStudyHours() + " and has slacked for "
                + c.getStudents()[i].getNonStudyHours() + " hours.");
        }
        System.out.println("Note that they haven't done much.\n\n\n"
            + "Let's make them study and relax a random amount of time.");
        JOptionPane.showMessageDialog(null, "Click OK so I can be sure you're"
            + " paying attention!\nAlso, there's going to be a wall of "
            + "text in the command line, so you'll have to scroll up a bit.");
        for (int i = 0; i < c.getStudents().length; i++) {
            int hours = rand.nextInt(50) + 1; //from 1 to 50
            c.getStudents()[i].study(hours);
        }
        for (int i = 0; i < c.getStudents().length; i++) {
            int hoursR = rand.nextInt(45) + 13;
            c.getStudents()[i].relax(hoursR);
        }
        System.out.println("Done! Now to output the new values.");
        for (int i = 0; i < c.getStudents().length; i++) {
            System.out.println(c.getStudents()[i].getFirstName() + " "
                + c.getStudents()[i].getLastName() + " has studied for "
                + c.getStudents()[i].getStudyHours()
                + " hour(s) and has slacked "
                + "for " + c.getStudents()[i].getNonStudyHours() + " hours.");
        }
        System.out.println("Notice that the GradStudents in your"
            + " class did not relax at all.");
        System.out.println("That's an example of polymorphism: subclasses"
            + " of the same class need not have the exact same traits.");
        System.out.printf("Now, let's get the average study percentage for"
            + " your class. It is %.4f", c.getAverageStudyPercentage());
        System.out.println("\n\n\nUndergradStudents (TAs) can even eat pizza"
            + " and lose hope. Let's make them eat a random amount of pizza"
            + " an lose a random amount of hope.");
        for (int i = 0; i < c.getTAs().length; i++) {
            int pizza = rand.nextInt(898) + 50;
            c.getTAs()[i].eatPizza(pizza);
        }
        for (int i = 0; i < c.getTAs().length; i++) {
            int hopeLost = rand.nextInt(90) + 30;
            c.getTAs()[i].loseHope(hopeLost);
        }
        System.out.println("Since TAs are UndergradStudents, they are also,"
            + " by extension, Students. This means they can study and relax."
            + " I'll make them do that.");
        for (int i = 0; i < c.getTAs().length; i++) {
            int naps = rand.nextInt(898) + 50;
            c.getTAs()[i].relax(naps);
        }
        for (int i = 0; i < c.getTAs().length; i++) {
            int horas = rand.nextInt(90) + 40;
            c.getTAs()[i].study(horas);
        }
        System.out.println("Outputing that data now:\n\n");
        for (int i = 0; i < c.getTAs().length; i++) {
            System.out.println(c.getTAs()[i].getFirstName()
                + "\'s data:\nPizza: " + c.getTAs()[i].getPizza() + "\nHope: "
                + c.getTAs()[i].getHope() +  "\nStudy Time: "
                + c.getTAs()[i].getStudyHours() +  "\nSlack Time: "
                + c.getTAs()[i].getNonStudyHours() + "\n");
        }
        System.out.println("\n\n\n");
        System.out.println("We're almost done here. Lastly, we'll use the "
            + "course's head TA to illustrate the piazzaScore, recitationScore"
            + ", and officeHoursScore (which were set to 0).");
        String htFullName = c.getHeadTA().getFirstName() + " "
            + c.getHeadTA().getLastName();
        System.out.println(htFullName + " is the Head TA for " + c.getTitle());
        System.out.println("Enter what you want to change his piazzaScore to:");
        double newP = kb.nextDouble();
        c.getHeadTA().setPiazzaScore(newP);
        System.out.println("Enter what you want to change his "
            + "recitationScore to:");
        double newR = kb.nextDouble();
        c.getHeadTA().setRecitationScore(newR);
        System.out.println("Enter what you want to change his "
            + "officeHoursScore to:");
        double newO = kb.nextDouble();
        c.getHeadTA().setOfficeHoursScore(newO);
        System.out.println("Changed!");
        System.out.println(htFullName + "'s scores are:\nPiazza: "
            + c.getHeadTA().getPiazzaScore() + "\nRecitation: "
            + c.getHeadTA().getRecitationScore() + "\nOffice Hours: "
            + c.getHeadTA().getOfficeHoursScore());
        System.out.println("Done!");
    }
}
