/**
 * Demonstration of OCP - Open Closed Principle
 * Simple program to calculate the bonus of an employee.
 * Uses a base - abstract - class Employee, and we make two new
 * classes that inherit from Employee. Thus we can easily create as
 * many new types of employees, with different bonuses, without ever touching
 * the original Employee class, and without having to change the way a new
 * type of employee is constructed.
 * The code is now open open for extension, but closed for modification.
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        // no need to change how an employee is constructed (see OCP1)
        Employee john = new PermanentEmployee(1, "John");
        Employee jack = new TemporaryEmployee(2, "Jack");

        System.out.println(john + " bonus = " + john.calculateBonus(10000));
        System.out.println(jack + " bonus = " + jack.calculateBonus(15000));
    }
}
