/**
 * Demonstration of OCP - Open Closed Principle
 * Simple program to calculate the bonus of an employee.
 * Uses a class Employee, but now we needed to take into
 * account a new type of employee (see OCP1).
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        // need to change how an employee is constructed, we need to provide a type too
        //old: Employee john = new Employee(1, "John");
        Employee john = new Employee(1, "John", "permanent");
        Employee jack = new Employee(2, "Jack", "temporary");

        System.out.println(john + " bonus = " + john.calculateBonus(10000));
        System.out.println(jack + " bonus = " + jack.calculateBonus(15000));
    }
}
