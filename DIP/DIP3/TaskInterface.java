public interface TaskInterface {
    void performedWork(double hours);

    void completeTask();

    String getTaskDescription();

    void setTaskDescription(String taskDescription);

    PersonInterface getOwner();

    void setOwner(PersonInterface owner);

    double getHoursWorked();

    boolean isComplete();
}
