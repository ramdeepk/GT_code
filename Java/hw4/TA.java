/**
 * This class represents a TA, who will have inherited
 * values from UndergradStudent, Student, and Person, as well as a score for
 * piazza, recitation, and office hours. A TA is-an UndergradStudent.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class TA extends UndergradStudent {
    private double piazzaScore, recitationScore, officeHoursScore;
    /**
     * Creates a TA, assigning values to TA's
     * inherited data, as well as its own. All TAs have scores for their
     * performance on piazza, in recitation, and in office hours.
     * @param firstName The first name of this TA.
     * @param lastName The last name of this TA.
     * @param username The TA's username for "T-Square".
     * @param piazzaScore The TA's piazza score.
     * @param recitationScore The TA's recitation score.
     * @param officeHoursScore The TA's office hour score.
     */
    public TA(String firstName, String lastName, String username,
        double piazzaScore, double recitationScore, double officeHoursScore) {
        super(firstName, lastName, username);
        if (piazzaScore < 0 || piazzaScore > 1) {
            System.out.println("piazzaScore must be between 0 and 1,"
                + " good sir. It will be set to 0.0 for now.");
            this.piazzaScore = 0;
        } else {
            this.piazzaScore = piazzaScore;
        }
        if (recitationScore < 0 || recitationScore > 1) {
            System.out.println("recitationScore must be between 0 and 1,"
                + " good sir. It will be set to 0.0 for now.");
            this.recitationScore = 0;
        } else {
            this.recitationScore = recitationScore;
        }
        if (officeHoursScore < 0 || officeHoursScore > 1) {
            System.out.println("officeHoursScore must be between 0 and 1,"
                + " good sir. It will be set to 0.0 for now.");
            this.officeHoursScore = 0;
        } else {
            this.officeHoursScore = officeHoursScore;
        }
    }
    /**
     * Returns the TA's piazza score.
     * @return The TA's piazza score.
     */
    public double getPiazzaScore() {
        return piazzaScore;
    }
    /**
     * Sets the TA's piazza score to the value of the
     * argument, if it is between 0 and 1.
     * @param newPiazzaScore The new value of piazzaScore.
     */
    public void setPiazzaScore(double newPiazzaScore) {
        if (newPiazzaScore < 0 || newPiazzaScore > 1) {
            System.out.println("piazzaScore must be between 0 and 1,"
                + " good sir. It will remain unchanged for now.");
        } else {
            this.piazzaScore = newPiazzaScore;
        }
    }
    /**
     * Returns the TA's recitation score.
     * @return The TA's recitation score.
     */
    public double getRecitationScore() {
        return recitationScore;
    }
    /**
     * Sets the TA's recitation score to the value of the
     * argument, if it is between 0 and 1.
     * @param newRecitationScore The new value of recitationScore.
     */
    public void setRecitationScore(double newRecitationScore) {
        if (newRecitationScore < 0 || newRecitationScore > 1) {
            System.out.println("recitationScore must be between 0 and 1,"
                + " good sir. It will remain unchanged for now.");
        } else {
            this.recitationScore = newRecitationScore;
        }
    }
    /**
     * Returns the TA's office hours score.
     * @return The TA's office hours score.
     */
    public double getOfficeHoursScore() {
        return officeHoursScore;
    }
    /**
     * Sets the TA's office hours score to the value of the
     * argument, if it is between 0 and 1.
     * @param newOfficeHoursScore The new value of officeHoursScore.
     */
    public void setOfficeHoursScore(double newOfficeHoursScore) {
        if (newOfficeHoursScore < 0 || newOfficeHoursScore > 1) {
            System.out.println("officeHoursScore must be between 0 and 1,"
                + " good sir. It will remain unchanged for now.");
        } else {
            this.officeHoursScore = newOfficeHoursScore;
        }
    }
}