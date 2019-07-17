package employee_homework;

public class EmployeeReportFormatter extends ReportFormatter {
    private Employee emp;
    private String formatType;

    public EmployeeReportFormatter(Employee emp, FormatType formatType){
        super(emp, formatType);
    }

    public String getFormattedEmployee() {
        return this.getFormatValue();
    }
}
