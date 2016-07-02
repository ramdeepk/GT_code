import java.util.Random;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import java.util.Set;
import java.util.TreeSet;
/**
 * creates a server
 * @author Krishna Ramdeep
 * @version 1.0.69.47
 */
public class Server {
    /**
     * generates messages
     * @return a list of messages
     */
    public ObservableList<Message> generate() {
        Random rand = new Random();
        ArrayList<Message> l = new ArrayList<>();
        ObservableList<Message> newMail = FXCollections.observableList(l);
        Set<Person> recipients = new TreeSet<>();
        Person[] senders = {new Person("John Doe", "jd32@mail.com"),
            new Person("Aaron Hernandez", "aaronandez@mail.com"),
            new Person("Barack Obama", "potus@mail.com"),
            new Person("Krishna Ramdeep", "krkrkr@mail.com")};
        String[] subjects = {"Congratulations!", "You're fired.", "OMG!!!",
            "Random Subject"};
        String[] messages = {"Happy Birthday!", "I hate you.",
            "You're horrible at your job.", "Tuition went up again. :(",
            "Inconceivable!!!", "Hey, buddy!\nWhy don't you stop by my"
                + " van later for some candy? :) :) :) ;)", "This is Barack "
                + "Obama. Send me a letter about your Thermo homework!"};

        int x = rand.nextInt(4) + 1;
        for (int i = 1; i <= x; i++) {
            int y = rand.nextInt(2) + 1;
            for (int j = 1; j <= y; j++) {
                recipients.add(senders[rand.nextInt(4)]);
            }
            Person sender = senders[rand.nextInt(4)];
            String subj = subjects[rand.nextInt(4)];
            String mess = messages[rand.nextInt(6)];
            Message email = new Message(sender, subj, mess, recipients);
            System.out.println(email);
            newMail.add(email);
        }
        return newMail;
    }
}
