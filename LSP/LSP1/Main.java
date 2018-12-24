/**
 * Demonstration of LSP - Liskov Subtitution Principle.
 * This builds on the OCP example! So look at that first if you're not familiar with it.
 * Simple program to calculate the bonus of an employee.
 * Uses a base - abstract - class Employee, and we make two new
 * classes that inherit from Employee. Thus we can easily create as
 * many new types of employees, with different bonuses, without ever touching
 * the original Employee class, and without having to change the way a new
 * type of employee is constructed.
 * However, what happens if we create a type of employee that doesn't get a bonus?
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        // no need to change how an employee is constructed (see OCP1)
        Employee john = new PermanentEmployee(1, "John");
        Employee jack = new TemporaryEmployee(2, "Jack");
        // make a new employee that doesn't get any bonuses
        Employee josef = new ContractEmployee(3, "Josef");

        System.out.println(john + " bonus = " + john.calculateBonus(10000));
        System.out.println(jack + " bonus = " + jack.calculateBonus(15000));
        // Watch what happens here! The program breaks!
        // We cannot substitute an Employee by a ContractEmployee without breaking things.
        // This is obviously not as it should be.
        System.out.println(josef + " bonus = " + josef.calculateBonus(12000));
    }
}
