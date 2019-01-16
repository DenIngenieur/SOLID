/**
 * This class simulates logging some message.
 * It does not depend on other classes.
 */

// added interface and implementing it here
public class Logger implements LoggerInterface {
    @Override
    public void log(String message) {
        System.out.println("Writing to log: " + message);
    }
}
