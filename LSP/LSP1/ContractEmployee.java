/**
 * A new type of employee gets introduced.
 * Sadly, this breaks our program.
 */

package be.ucll.ooo.solid;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ContractEmployee extends Employee {
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    // Contract employees do not get any bonuses!
    // Since this throws an exception that isn't thrown by its parent class,
    // it is in violation of the Liskov Substitution Principle.
    // Also, it's pretty useless to implement something you're not going to use anyway,
    // but we need to do it since we inherit from Employee. Obviously, we need to change this.
    @Override
    public double calculateBonus(double salary) {
        throw new NotImplementedException();
    }
}
