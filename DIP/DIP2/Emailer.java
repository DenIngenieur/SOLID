/**
 * This class simulates sending an email message to someone.
 * It does not depend on other classes.
 */

// added interface and implementing it here
public class Emailer implements MessengerInterface {
    // needed to change this from Person to PersonInterface !!!!!!!!!!
    // changes method name from sendMail to sendMessage in interface
    @Override
    public void sendMessage(PersonInterface person, String message) {
        System.out.println("Sending email message: " + message + " to: " + person.getEmailAddress() + ".");
    }
}
