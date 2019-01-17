/**
 * Main class of the application.
 * It depends on the classes Person and Task.
 */

public class Main {

    public static void main(String[] args) {
        // needed to change this from Person to PersonInterface !!!!!!!!!!
        // We're still depending on the Person class.
        // PersonInterface owner = new Person();
        // So lets use the factory now to create a new Person
        PersonInterface owner = Factory.createPerson();
        owner.setFirstName("Jules");
        owner.setLastName("Kabas");
        owner.setEmailAddress("jk@jk.be");
        owner.setPhoneNumber("016 123 456");

        // needed to change this from Task to TaskInterface !!!!!!!!!!
        // We're still depending on the Task class.
        // TaskInterface task = new Task();
        // So lets use the factory now to create a new Person
        TaskInterface task = Factory.createTask();
        task.setTaskDescription("Do the dishes.");
        task.setOwner(owner);

        task.performedWork(1);
        task.performedWork(0.5);
        task.completeTask();
    }
}
