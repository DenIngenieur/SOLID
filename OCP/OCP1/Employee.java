/**
 * The class employee contains everything about an employee,
 * including the calculation of a bonus (10% in this case).
 * This is not the best approach, because if we get another type
 * of employee, we'll have to change this code considerably (see OCP2)
 */

package be.ucll.ooo.solid;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    public double calculateBonus(double salary){
        return salary * 0.1; // bonus is 10 percent
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
