/**
 * Factory class that takes care of the creation of all types
 * of classes used in the application.
 */

public class Factory {
    public static PersonInterface createPerson(){
        return new Person();
    }

    public static TaskInterface createTask(){
        return new Task();
    }

    public static LoggerInterface createLogger(){
        return new Logger();
    }

    public static MessengerInterface createMessager(){
        return new Emailer(); // just for now
    }
}
