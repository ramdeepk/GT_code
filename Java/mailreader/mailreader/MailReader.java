import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * creates a driver class for the gui
 * @author Krishna Ramdeep
 * @version 1.0.69.47
 */
public class MailReader extends Application {
    /**
     * runs the app
     * @param s the stage
     */
    public void start(Stage s) throws Exception {
        Server test = new Server();
        //Mailboxes and ListView
        ObservableList<Message> inboxMess =
            FXCollections.observableList(test.generate());
        FXCollections.sort(inboxMess);
        Mailbox inbox = new Mailbox("Inbox", inboxMess);
        Mailbox important = new Mailbox("Important");
        Mailbox trash = new Mailbox("Trash");
        ObservableList<Mailbox> lmail =
            FXCollections.observableList(Arrays.asList(
                inbox, important, trash));
        ListView<Message> list = new ListView<Message>(inbox.getMessages());
        ListView<Mailbox> mail = new ListView<Mailbox>(lmail);
        list.setPrefSize(700, 300);
        mail.setPrefSize(200, 150);
        //label for displaying messages
        Label labelMess = new Label();
        labelMess.setLayoutX(700);
        labelMess.setLayoutY(300);
        labelMess.setFont(Font.font("Verdana", 20));
        //Displaying the message
        list.getSelectionModel().selectedItemProperty().addListener((observable,
            oldValue, newValue) -> {
                labelMess.setText(
                    list.getSelectionModel().getSelectedItem().getMessage());
            });
        //Displaying the correct mailbox
        mail.getSelectionModel().selectedItemProperty().addListener((observable,
            oldValue, newValue) -> {
                list.setItems(
                    mail.getSelectionModel().getSelectedItem().getMessages());
            });
        //Buttons
        Button refresh = new Button("Refresh");
        refresh.setOnAction(e -> {
                ObservableList<Message> x =
                    FXCollections.observableList(inbox.addMessages(
                        test.generate()));
                FXCollections.sort(x);
                list.setItems(x);
            });
        Button flag = new Button("Flag");
        flag.setOnAction(e -> {
                if (
                    mail.getSelectionModel().getSelectedItem(
                        ).getName().equals(inbox.getName())) {
                    inbox.move(list.getSelectionModel().getSelectedItem(),
                        important);
                } else if (
                    mail.getSelectionModel().getSelectedItem().getName(
                        ).equals(trash.getName())) {
                    trash.move(list.getSelectionModel().getSelectedItem(),
                        important);
                }
            });
        Button delete = new Button("Delete");
        delete.setOnAction(e -> {
                if (
                    mail.getSelectionModel().getSelectedItem(
                        ).getName().equals(inbox.getName())) {
                    inbox.move(list.getSelectionModel().getSelectedItem(),
                        trash);
                } else if (
                    mail.getSelectionModel().getSelectedItem(
                        ).getName().equals(important.getName())) {
                    important.move(list.getSelectionModel().getSelectedItem(),
                        trash);
                }
            });
        Button sortByDate = new Button("Sort: Date");
        sortByDate.setOnAction(e -> {
                FXCollections.sort(
                    mail.getSelectionModel().getSelectedItem().getMessages(),
                    (Message m1, Message m2) -> {
                        if (!(m1.getDate().equals(m2.getDate()))) {
                            return m1.getDate().compareTo(m2.getDate());
                        } else {
                            return 0;
                        }
                    });
                list.setItems(mail.getSelectionModel().getSelectedItem(
                    ).getMessages());
            });
        Button sortBySender = new Button("Sort: Sender");
        sortBySender.setOnAction(e -> {
                FXCollections.sort(
                    mail.getSelectionModel().getSelectedItem().getMessages(),
                    (Message m1, Message m2) -> {
                        return m1.getSender().compareTo(m2.getSender());
                    });
                list.setItems(
                    mail.getSelectionModel().getSelectedItem().getMessages());
            });
        Button sortBySubject = new Button("Sort: Subject");
        sortBySubject.setOnAction(e -> {
                FXCollections.sort(
                    mail.getSelectionModel().getSelectedItem().getMessages(),
                    (Message m1, Message m2) -> {
                        return m1.getSubject().compareTo(m2.getSubject());
                    });
                list.setItems(
                    mail.getSelectionModel().getSelectedItem().getMessages());
            });
        //Boxes
        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(refresh, flag, delete,
            sortByDate, sortBySender, sortBySubject);
        VBox box = new VBox();
        box.getChildren().addAll(buttons, list, labelMess);
        HBox hb = new HBox(10);
        hb.getChildren().addAll(mail, box);
        Scene window = new Scene(hb, 900, 600);
        s.setScene(window);
        s.show();
    }
}