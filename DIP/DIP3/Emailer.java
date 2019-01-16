/**
 * This class simulates sending an email message to someone.
 * It does not depend on other classes.
 */

// added interface and implementing it here
public class Emailer implements MessengerInterface {
    @Override
    public void sendMessage(PersonInterface person, String message) {
        System.out.println("Sending email message: " + message + " to: " + person.getEmailAddress() + ".");
    }
}
