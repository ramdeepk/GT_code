import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.List;
import java.util.ArrayList;
/**
 * creates a mailbox
 * @author Krishna Ramdeep
 * @version 1.0.69.47
 */
public class Mailbox {
    private String name;
    private ObservableList<Message> messages;
    /**
     * creates a mailbox
     * @param name name
     */
    public Mailbox(String name) {
        this.name = name;
        List<Message> m = new ArrayList<>();
        messages = FXCollections.observableList(m);
        messages.add(new Message());
    }
    /**
     * creates a mailbox
     * @param name name
     * @param m list of messages
     */
    public Mailbox(String name, List<Message> m) {
        this.name = name;
        messages = FXCollections.observableList(m);
    }
    /**
     * creates a mailbox
     * @param m message
     * @param other mailbox to move to
     */
    public void move(Message m, Mailbox other) {
        this.messages.removeAll(m);
        other.messages.addAll(m);
    }
    /**
     * get the messages
     * @return the list of messages
     */
    public ObservableList<Message> getMessages() {
        return this.messages;
    }
    /**
     * get the name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * string representation
     * @return string
     */
    public String toString() {
        return this.getName();
    }
    /**
     * adds the messages
     * @param m messages
     * @return the list
     */
    public ObservableList<Message> addMessages(ObservableList<Message> m) {
        List<Message> x = new ArrayList<>();
        for (Message mess: this.messages) {
            x.add(mess);
        }
        for (Message messArg: m) {
            x.add(messArg);
        }
        ObservableList<Message> z = FXCollections.observableList(x);
        this.messages = z;
        return z;
    }
}
