public class Student {

    private String studentId;
    private String studentName;
    private String department;
    private String year;

    public Student(String studentId, String studentName, String department, String year) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public String getYear() {
        return year;
    }
}