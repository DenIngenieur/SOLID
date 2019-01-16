/**
 * A class that describes and implements tasks.
 * It depends on the classes Person, Logger and Emailer.
 * This application totally violates the Dependency Inversion Principle.
 */

public class Task {
    private String taskDescription;
    private Person owner;
    private double hoursWorked; // no setter for this
    private boolean isComplete = false; // no setter for this

    public void performedWork(double hours) {
        hoursWorked += hours;
        Logger log = new Logger();
        log.log("Performed work on \"" + taskDescription + "\" for: " + hours + " hours. Total time: " + hoursWorked + " hours.");
    }

    public void completeTask() {
        isComplete = true;
        Logger log = new Logger();
        log.log("Completed work on \"" + taskDescription + "\". Total time spend: " + hoursWorked + " hours.");

        Emailer emailer = new Emailer();
        emailer.sendMail(owner, "The task \"" + taskDescription + "\" is done!");
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
