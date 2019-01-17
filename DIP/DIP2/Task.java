/**
 * A class that describes and implements tasks.
 * It depends on the classes Person, Logger and Emailer.
 */

// added interface and implementing it here
public class Task implements TaskInterface {
    private String taskDescription;
    // needed to change this from Person to PersonInterface !!!!!!!!!!
    private PersonInterface owner;
    private double hoursWorked; // no setter for this
    private boolean isComplete = false; // no setter for this

    @Override
    public void performedWork(double hours) {
        hoursWorked += hours;
        // needed to change this from Logger to LoggerInterface !!!!!!!!!!
        LoggerInterface log = new Logger();
        log.log("Performed work on \"" + taskDescription + "\" for: " + hours + " hours. Total time: " + hoursWorked + " hours.");
    }

    @Override
    public void completeTask() {
        isComplete = true;
        // needed to change this from Logger to LoggerInterface !!!!!!!!!!
        LoggerInterface log = new Logger();
        log.log("Completed work on \"" + taskDescription + "\". Total time spend: " + hoursWorked + " hours.");

        // needed to change this from Emailer to MessengerInterface !!!!!!!!!!
        MessengerInterface emailer = new Emailer();
        emailer.sendMessage(owner, "The task \"" + taskDescription + "\" is done!");
    }

    @Override
    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    // needed to change this from Person to PersonInterface !!!!!!!!!!
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
