/**
 * A new type of employee gets introduced.
 * This one does not get a bonus!
 */

package be.ucll.ooo.solid;

// Only implements one interface!
// Notice that it needs to implement the same methods as Employee,
// since it doesn't inherit from Employee.
public class ContractEmployee implements EmployeeInterface {
    private int id;
    private String name;

    public ContractEmployee(int id, String name) {
        setId(id);
        setName(name);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getMinimumSalary() {
        return 10000;
    }

    // slightly different from Employee!
    @Override
    public String toString() {
        return "ContractEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
