/**
 * The class Employee contains everything about an employee.
 * We can now inherit from this class, and make new types of employees
 * without the need to change this code, provided that the new employee type
 * gets a bonus.
 *
 * Notice that we do not need to implement getMinimumSalary from EmployeeInterface,
 * nor calculateBonus from CalculateBonusInterface. This is because this class is
 * declared abstract!
 * The derived classes do need to implement these methods (unless they also are abstract)!
 */

package be.ucll.ooo.solid;

// Implements both interfaces!
public abstract class Employee implements EmployeeInterface, CalculateBonusInterface {
    int id;
    String name;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}