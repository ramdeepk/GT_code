/**
 * creates a person
 * @author Krishna Ramdeep
 * @version 1.0.69.47
 */
public class Person implements Comparable<Person> {
    private String name, email;
    /**
     * Person
     * @param name name
     * @param email emails
     */
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    /**
     * Returns the name
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Compares this person to another one
     * @param other the person to compare
     * @return an integer based on comparison
     */
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
    /**
     * Determines equality
     * @param o the object to look at
     * @return equality
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else {
            Person oth = (Person) o;

            return this.name.equals(oth.name) && this.email.equals(oth.email);
        }
    }
    /**
     * REturns the hashcode
     * @return the hashcode
     */
    public int hashCode() {
        int c = name.hashCode() + email.hashCode();

        return c;
    }
    /**
     * String representation
     * @return a string
     */
    public String toString() {
        return this.name;
    }
}