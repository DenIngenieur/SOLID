/**
 * The class Employee contains everything about an employee,
 * including the calculation of a bonus.
 * This is how NOT to do this!
 * Look at all the comments, they are where we needed to change the
 * code to accommodate for a new type of employee (compare to OCP1).
 * It will get worse if we get yet another type of employee!
 */

package be.ucll.ooo.solid;

public class Employee {
    int id;
    String name;
    String employeeType; // additional property employeeType to distinguish between different types of employees

    // note that we need to change the constructor
    public Employee(int id, String name, String employeeType) {
        setId(id);
        setName(name);
        setEmployeeType(employeeType);
    }

    // note that we need to change this method
    // if we get more then 2 types, we'll need to expand the if statement!
    public double calculateBonus(double salary){
        if(employeeType.equalsIgnoreCase("Permanent")) {
            return salary * 0.1; // bonus is 10 percent
        }
        else {
            return salary * 0.05; // bonus is 5 percent
        }
    }

    // extra getter
    public String getEmployeeType() {
        return employeeType;
    }

    // extra setter
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // also changed toString method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }
}
