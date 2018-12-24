/**
 * A new interface, to split up the responsabilities of
 * the old Employee class.
 */

package be.ucll.ooo.solid;

public interface EmployeeInterface {
    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);

    // New, solely for the purpose of demonstrating that we can have a
    // method common to all types of employees.
    public double getMinimumSalary();
}
