/**
 * Main class of the application.
 * It depends on the classes Person and Task.
 */

public class Main {

    public static void main(String[] args) {
        Person owner = new Person();
        owner.setFirstName("Jules");
        owner.setLastName("Kabas");
        owner.setEmailAddress("jk@jk.be");
        owner.setPhoneNumber("016 123 456");

        Task task = new Task();
        task.setTaskDescription("Do the dishes.");
        task.setOwner(owner);

        task.performedWork(1);
        task.performedWork(0.5);
        task.completeTask();
    }
}
