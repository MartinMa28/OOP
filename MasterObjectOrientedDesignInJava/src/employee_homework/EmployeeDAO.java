package employee_homework;

public class EmployeeDAO {
    public void saveEmployee(Employee emp){
        System.out.println("Saved the employee " + emp);
    }

    public void deleteEmployee(Employee emp){
        System.out.println("Deleted the employee " + emp);
    }
}
