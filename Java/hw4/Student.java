/**
 * This class represents a Student, who will be part of a Course,
 * and will have an amount of time studied and amount of time not studied.
 * A Student is-a Person.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Student extends Person {
    private int studyHours, nonStudyHours;
    /**
     * Creates a Student, assigning values to Student's private values.
     * All Students start with 0 study hours and 0 non-study hours.
     * @param firstName The first name of this Student.
     * @param lastName The last name of this Student.
     * @param username The Student's username for logging in to "T-Square".
     */
    public Student(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
        this.studyHours = 0;
        this.nonStudyHours = 0;
    }
    /**
     * Returns the Student's number of study hours.
     * @return The Student's number of study hours.
     */
    public int getStudyHours() {
        return studyHours;
    }
    /**
     * Returns the Student's number of hours not spent studying.
     * @return The Student's number of hours not spent studying.
     */
    public int getNonStudyHours() {
        return nonStudyHours;
    }
    /**
     * Returns the Student's percentage of time spent sudying as
     * a double, making sure not to divide by zero.
     * @return The Student's percentage of time spent studying.
     */
    public double getStudyPercentage() {
        if (studyHours + nonStudyHours == 0) {
            System.out.println("studyHours and nonStudyHours cannot both be "
                + "zero, so this will return 0.0.");
            return 0.0;
        } else {
            return (double) (studyHours) / (studyHours + nonStudyHours);
        }
    }
    /**
     * Increases the value of studyHours by a specific number of hours, as
     * long as hours is not less than 0.
     * @param hours The number of hours spent studying.
     */
    public void study(int hours) {
        if (hours >= 0) {
            studyHours = studyHours + hours;
        } else {
            System.out.println("studyHours cannot decrease! "
                + "studyHours has not been changed!");
        }
    }
    /**
     * Increases the value of nonStudyHours by a specific number of hours, as
     * long as hours is not less than 0.
     * @param hours The number of hours spent relaxing.
     */
    public void relax(int hours) {
        if (hours >= 0) {
            nonStudyHours = nonStudyHours + hours;
        } else {
            System.out.println("nonStudyHours cannot decrease!"
                + " nonStudyHours has not been changed!");
        }
    }
}