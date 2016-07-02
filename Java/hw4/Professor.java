/**
 * This class represents a Professor, who will be part of a Course,
 * and will have an average GPA and funniness rating. A Professor is-a Person.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Professor extends Person {
    // Do not have to create Strings for the Professor's name and username,
    // as it inherited them from Person.
    private double gpa, funnyFactor;
    /**
     * Creates a Professor, assigning values to both the values inherited from
     * Person, and well as its own private members.
     * @param firstName The first name of this Professor.
     * @param lastName The last name of this Professor.
     * @param username The Professor's username for logging in to "T-Square".
     * @param gpa The Professor's average gpa for a Course.
     * @param funnyFactor A measure of how funny a Professor is in class.
     */
    public Professor(String firstName, String lastName, String username,
        double gpa, double funnyFactor) {
        super(firstName, lastName, username);
        this.setGPA(gpa);
        this.setFunnyFactor(funnyFactor);
    }
    /**
     * Returns the Professor's average GPA.
     * @return The Professor's average GPA.
     */
    public double getGPA() {
        return gpa;
    }
    /**
     * Sets the Professor's average GPA to the value of the
     * argument, if it is within [0.0, 4.0].
     * @param newGpa The new value of gpa.
     */
    public void setGPA(double newGpa) {
        if (newGpa < 0) {
            System.out.println("This value of GPA is invalid. GPA"
                + " will be set to 0.");
            this.gpa = 0;
        } else if (newGpa > 4) {
            System.out.println("This value of GPA is invalid. "
                + "GPA will be set to 4.");
            this.gpa = 4;
        } else {
            this.gpa = newGpa;
        }
    }
    /**
     * Returns the Professor's funniness rating.
     * @return The Professor's funniness rating.
     */
    public double getFunnyFactor() {
        return funnyFactor;
    }
    /**
     * Sets the Professor's funniness rating to the value of the
     * argument, if it is within [0.0, 1.0].
     * @param newFunny The new value of funnyFactor.
     */
    public void setFunnyFactor(double newFunny) {
        if (newFunny < 0) {
            System.out.println("This value of funnyFactor is invalid. "
                + "funnyFactor will be set to 0.");
            this.funnyFactor = 0;
        } else if (newFunny > 1) {
            System.out.println("This value of funnyFactor is invalid. "
                + "funnyFactor will be set to 1.");
            this.funnyFactor = 1;
        } else {
            this.funnyFactor = newFunny;
        }
    }
}