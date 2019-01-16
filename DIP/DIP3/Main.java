/**
 * Main class of the application.
 * No more dependencies - everything is taken care of by the factory.
 */

public class Main {

    public static void main(String[] args) {
        PersonInterface owner = Factory.createPerson();
        owner.setFirstName("Jules");
        owner.setLastName("Kabas");
        owner.setEmailAddress("jk@jk.be");
        owner.setPhoneNumber("016 123 456");

        TaskInterface task = Factory.createTask();
        task.setTaskDescription("Do the dishes.");
        task.setOwner(owner);

        task.performedWork(1);
        task.performedWork(0.5);
        task.completeTask();
    }
}
