/**
 * A class that describes and implements tasks.
 * It depends on the classes Person, Logger and Emailer.
 */

// added interface and implementing it here
public class Task implements TaskInterface {
    private String taskDescription;
    private PersonInterface owner;
    private double hoursWorked; // no setter for this
    private boolean isComplete = false; // no setter for this

    // create variables to contain the logger and messenger objects
    private LoggerInterface logger;
    private MessengerInterface messenger;

    // created a constructor that asks for a logger and a messenger
    // constructor injection!
    public Task(LoggerInterface logger, MessengerInterface messenger) {
        this.logger = logger;
        this.messenger = messenger;
    }

    @Override
    public void performedWork(double hours) {
        hoursWorked += hours;
        // now just use logger, no need to create a new one
        logger.log("Performed work on \"" + taskDescription + "\" for: " + hours + " hours. Total time: " + hoursWorked + " hours.");
    }

    @Override
    public void completeTask() {
        isComplete = true;
        // now just use logger, no need to create a new one
        logger.log("Completed work on \"" + taskDescription + "\". Total time spend: " + hoursWorked + " hours.");

        // now just use messenger, no need to create a new one
        messenger.sendMessage(owner, "The task \"" + taskDescription + "\" is done!");
    }

    @Override
    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public PersonInterface getOwner() {
        return owner;
    }

    @Override
    public void setOwner(PersonInterface owner) {
        this.owner = owner;
    }

    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public boolean isComplete() {
        return isComplete;
    }
}
