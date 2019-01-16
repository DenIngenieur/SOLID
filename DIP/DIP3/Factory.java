/**
 * Factory class that takes care of the creation of all types of classes
 * used in the application.
 * All newing up is done here!
 */

public class Factory {
    public static PersonInterface createPerson(){
        // We could easily have an Employee class here, as long it implements
        // PersonInterface, we're good to go!
        return new Person();
    }

    public static TaskInterface createTask(){
        // since we now have a constructor that asks for a logger and a
        // messager, we need to change this
        // return new Task();
        // create a logger and a messager and pass them as arguments
        return new Task(createLogger(), createMessager());
    }

    public static LoggerInterface createLogger(){
        return new Logger();
    }

    public static MessengerInterface createMessager(){
        // let's change this, we want an SMS send instead
        //return new Emailer(); // just for now

        // change this here, nothing break, but you have a whole new functionality
        return new SMSer();
    }

}
