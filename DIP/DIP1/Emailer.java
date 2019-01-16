/**
 * This class simulates sending an email message to someone.
 * It does not depend on other classes.
 */

public class Emailer {
    public void sendMail(Person person, String message) {
        System.out.println("Sending email message: " + message + " to: " + person.getEmailAddress() + ".");
    }
}
