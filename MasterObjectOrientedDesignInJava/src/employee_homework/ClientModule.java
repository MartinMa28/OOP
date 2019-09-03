package employee_homework;

public class ClientModule {
  public static void main(String[] args) {
    Employee peter = new Employee(0, "Peter", "Dev", true);
    ClientModule.hireNewEmployee(peter);
    ClientModule.printEmployeeReport(peter, FormatType.CSV);
    ClientModule.terminateEmployee(peter);
  }

  public static void hireNewEmployee(Employee emp) {
    EmployeeDAO empDAO = new EmployeeDAO();
    empDAO.saveEmployee(emp);
  }

  public static void terminateEmployee(Employee emp) {
    EmployeeDAO empDAO = new EmployeeDAO();
    empDAO.deleteEmployee(emp);
  }

  public static void printEmployeeReport(Employee emp, FormatType formatType) {
    EmployeeReportFormatter empReportFormatter = new EmployeeReportFormatter(emp, formatType);
    System.out.println(empReportFormatter.getFormattedEmployee());
  }
}
