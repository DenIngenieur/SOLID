/**
 * The class Employee contains everything about an employee, but is now
 * declared abstract, and so is the calculation of a bonus method.
 * We can now inherit from this class, and make new types of employees
 * without the need to change this code.
 * The code is now open open for extension, but closed for modification.
 */

package be.ucll.ooo.solid;

public abstract class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    public abstract double calculateBonus(double salary);

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
