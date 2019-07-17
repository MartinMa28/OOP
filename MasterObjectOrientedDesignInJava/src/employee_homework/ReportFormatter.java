package employee_homework;

public class ReportFormatter {
    private String formattedOutput = "";

    public ReportFormatter(Object obj, FormatType formatType){
        switch (formatType){
            case XML:
                this.formattedOutput = this.convertObjectToXML(obj);
                break;
            case CSV:
                this.formattedOutput = this.convertObjectToCSV(obj);
                break;
        }
    }

    public String getFormatValue(){
        return this.formattedOutput;
    }

    private String convertObjectToXML(Object obj){
        return "<employee>" + obj.toString() + "</employee>";
    }

    private String convertObjectToCSV(Object obj){
        return obj.toString() + ",";
    }
}
