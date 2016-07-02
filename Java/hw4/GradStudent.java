/**
 * This class represents a GradStudent, who will have an amount
 * of time studied and amount of time not studied. A GradStudent is-a Student.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class GradStudent extends Student {
    /**
     * Creates a GradStudent, assigning values to GradStudent's
     * inherited data. All GradStudents start with 0 study hours
     * and 0 non-study hours. GradStudents cannot have
     * nonStudyHours greater than 0.
     * @param firstName The first name of this GradStudent.
     * @param lastName The last name of this GradStudent.
     * @param username The GradStudent's username for logging in to "T-Square".
     */
    public GradStudent(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
        // studyHours and nonStudyHours will be initialized to 0 by Student's
        // constructor, which is called by
        // super(firstName, lastName, username).
    }
    // In order to enforce the class invariant nonStudyHours = 0, I will
    // override Student's relax(int hours) method.
    /**
     * Since this is a GradStudent, the value of nonStudyHours will
     * not be changed. That is, a GradStudent cannot relax.
     * @param hours The number of hours spent relaxing.
     */
    @Override
    public void relax(int hours) {
        System.out.println("GradStudents are far too busy to be relaxing!"
            + " Get back to studying! nonStudyHours will not be changed!");
    }
    // Nothing else has to be added.
}