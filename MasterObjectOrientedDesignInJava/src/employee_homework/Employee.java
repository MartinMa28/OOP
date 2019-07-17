package employee_homework;

public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(long id, String employeeName, String department, boolean working){
        this.id = id;
        this.name = employeeName;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
