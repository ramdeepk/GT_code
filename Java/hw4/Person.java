/**
 * This class acts as the universal superclass. Every other class
 * (Professor, Student, GradStudent, etc.) is somehow connected to this
 * one.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Person {
    private String firstName, lastName, username;
    /**
     * Creates a Person, assigning values to Person's private values.
     * @param firstName The first name of this Person.
     * @param lastName The last name of this Person.
     * @param username The Person's username for logging in to "T-Square".
     */
    public Person(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }
    /**
     * Returns the Person's first name.
     * @return the Person's first name.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Returns the Person's last name.
     * @return the Person's last name.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Returns the Person's username for login.
     * @return the Person's "T-Square" username.
     */
    public String getUsername() {
        return username;
    }
}