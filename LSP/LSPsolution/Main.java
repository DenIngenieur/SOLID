/**
 * Demonstration of LSP - Liskov Subtitution Principle.
 * This builds on the OCP example! So look at that first if you're not familiar with it.
 * This was a simple program to calculate the bonus of an employee.
 * However, what happens if we create a type of employee that doesn't get a bonus?
 * We need to split thing up!
 * It now shows a new method that is common to all types of employees, getMinimumSalary,
 * but only two out of three employee types get a bonus now!
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        // Now we can substitute the EmployeeInterface by every type of employee,
        // since they all implement this interface.
        // In other words, al types of employees fit into the EmployeeInterface (although
        // not all of them fit into Employee).
        EmployeeInterface john = new PermanentEmployee(1, "John");
        EmployeeInterface jack = new TemporaryEmployee(2, "Jack");
        // make a new employee that doesn't get any bonuses
        EmployeeInterface josef = new ContractEmployee(3, "Josef");

        // Since not all Employees get a bonus, we demonstrate with the new
        // functionality of the minimum salary.
        System.out.println("Print out the minimum salaries:");
        System.out.println(john + " Minimum Salary = " + john.getMinimumSalary());
        System.out.println(jack + " Minimum Salary = " + jack.getMinimumSalary());
        System.out.println(josef + " Minimum Salary = " + josef.getMinimumSalary());

        // Of course, we can still print out the bonus, for those who get one, although
        // we must cast them to either Employee, or their own type. This is because the
        // EmployeeInterface does not contain the calculateBonus method, whereas the Employee
        // does (via the CalculateBonusInterface), and of course, the various types of employees
        // that get a bonus implement their own version of the calculateBonus method.
        System.out.println("");
        System.out.println("Print out the bonuses:");
        // Cast to Employee.
        // Since Employee contains the calculateBonus - via the CalculateBonusInterface
        // (it's not directly implemented in Employee) this also works.
        // We could have cast to PermanentEmployee too.
        System.out.println(john + " bonus = " + ((Employee) john).calculateBonus(10000));
        // Cast to own type, TemporaryEmployee. We could have cast to Employee too.
        System.out.println(jack + " bonus = " + ((TemporaryEmployee) jack).calculateBonus(15000));
    }
}
