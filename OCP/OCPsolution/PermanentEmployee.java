/**
 * A new type of Employee, this is a permanent employee.
 * We can easily make as many new types as we need.
 */

package be.ucll.ooo.solid;

public class PermanentEmployee extends Employee {
    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.1; // bonus is 10 percent
    }
}
