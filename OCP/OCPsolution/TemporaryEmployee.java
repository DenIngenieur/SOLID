/**
 * A new type of Employee, this is a temporary employee.
 * We can easily make as many new types as we need.
 */

package be.ucll.ooo.solid;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05; // bonus is 5 percent
    }
}
