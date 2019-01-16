/**
 * This new class simulates sending an SMS to someone.
 * It does not depend on other classes.
 */

public class SMSer implements MessengerInterface {
    @Override
    public void sendMessage(PersonInterface person, String message) {
        System.out.println("Sending SMS message: " + message + " to: " + person.getPhoneNumber() + ".");
    }
}
