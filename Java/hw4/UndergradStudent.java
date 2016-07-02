/**
 * This class represents a UndergradStudent, who will have inherited
 * values from Student and Person, as well as an amount of hope
 * and an amount of pizza eaten. A UndergradStudent is-a Student.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class UndergradStudent extends Student {
    private int hope, pizza;
    /**
     * Creates an UndergradStudent, assigning values to UndergradStudent's
     * inherited data. All UndergradStudents start with 0 study hours
     * and 0 non-study hours. UndergradStudents start with 100 hope and
     * 0 pizza. Hope can only decrease, while pizzas consumed can only go up.
     * @param firstName The first name of this UndergradStudent.
     * @param lastName The last name of this UndergradStudent.
     * @param username The UndergradStudent's username for "T-Square".
     */
    public UndergradStudent(String firstName, String lastName,
        String username) {
        super(firstName, lastName, username);
        // studyHours and nonStudyHours will be initialized to 0 by Student's
        // constructor, which is called by
        // super(firstName, lastName, username).
        this.hope = 100;
        this.pizza = 0;
    }
    /**
     * Returns the UndergradStudent's amount of hope.
     * @return The UndergradStudent's hope.
     */
    public int getHope() {
        return hope;
    }
    /**
     * Returns the number of pizza the UndergradStudent has eaten.
     * @return The UndergradStudent's number of pizzas consumed.
     */
    public int getPizza() {
        return pizza;
    }
    /**
     * Decreases the value of hope by a specific amount (hopeLoss), as
     * long as hopeLoss is not negative.
     * @param hopeLoss The amount of hope lost.
     */
    public void loseHope(int hopeLoss) {
        if (hopeLoss < 0) {
            System.out.println("hope cannot increase (sadly)! "
                + "hope has not been changed! Enter a positive"
                + " value for hope next time.");
        } else if (hope - hopeLoss < 0) {
            System.out.println("Hope cannot go below 0!");
            this.hope = 0;
        } else {
            this.hope = hope - hopeLoss;
        }
    }
    /**
     * Increases the amount of pizzas eaten by the value of the argument, as
     * long as it is not negative.
     * @param pizzas The number of additional pizzas eaten.
     */
    public void eatPizza(int pizzas) {
        if (pizzas >= 0) {
            pizza = pizza + pizzas;
        } else {
            System.out.println("pizza cannot decrease!"
                + " pizza has not been changed! Make sure you pass a"
                + " positive argument into this method!");
        }
    }
}
