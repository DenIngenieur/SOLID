public interface TaskInterface {
    void performedWork(double hours);

    void completeTask();

    String getTaskDescription();

    void setTaskDescription(String taskDescription);

    // needed to change this form Person to PersonInterface !!!!!!!!!!
    PersonInterface getOwner();

    void setOwner(PersonInterface owner);

    double getHoursWorked();

    boolean isComplete();
}
