import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

/**
 * creates a message
 * @author Krishna Ramdeep
 * @version 1.0.69.47
 */
public class Message implements Comparable<Message> {
    private String subject, message;
    private LocalDateTime date;
    private Person sender;
    private Set<Person> recipients;
    /**
     * Creates an empty message
     */
    public Message() {
        sender = new Person("", "");
        subject = "";
        message = "";
        date = LocalDateTime.MIN;
    }
    /**
     * Creates an message
     * @param sender the sender
     * @param subject the subject
     * @param message the message
     */
    public Message(Person sender, String subject, String message) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.date = LocalDateTime.now();
        this.recipients = new TreeSet<Person>();
    }
    /**
     * Creates an message
     * @param sender the sender
     * @param subject the subject
     * @param message the message
     * @param recipients the receivers of the message
     */
    public Message(Person sender, String subject,
        String message, Set<Person> recipients) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.date = LocalDateTime.now();
        this.recipients = recipients;
    }
    /**
     * Returns the date
     * @return the date
     */
    public LocalDateTime getDate() {
        return this.date;
    }
    /**
     * Compares this message to another one
     * @param m the message to compare
     * @return an integer based on comparison
     */
    public int compareTo(Message m) {
        return this.date.compareTo(m.date);
    }
    /**
     * Returns equality
     * @param o the object to compare to
     * @return whether it is equal or not
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else {
            Message other = (Message) o;

            return this.sender.equals(other.sender)
                    && this.subject.equals(other.subject)
                    && this.message.equals(other.message)
                    && this.date.equals(other.date);
        }
    }
    /**
     * Returns the hashcode
     * @return the hashcode
     */
    public int hashCode() {
        int c = sender.hashCode() + subject.hashCode() + message.hashCode()
                + recipients.hashCode();

        return c;
    }
    /**
     * Returns the string representation
     * @return a string
     */
    public String toString() {
        if (this.date.equals(LocalDateTime.MIN)) {
            return "";
        } else {
            return sender.getName() + " - " + subject + " (Received: "
                    + date.toString() + ")";
        }
    }
    /**
     * Returns the sender
     * @return the sender
     */
    public Person getSender() {
        return this.sender;
    }
    /**
     * Returns the subject
     * @return the subject
     */
    public String getSubject() {
        return this.subject;
    }
    /**
     * Returns the message
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }
}