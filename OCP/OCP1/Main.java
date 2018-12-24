/**
 * Demonstration of OCP - Open Closed Principle
 * Simple program to calculate the bonus of an employee.
 * Uses a class Employee
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee(1, "John");

        System.out.println(john + " bonus = " + john.calculateBonus(10000));
    }
}
