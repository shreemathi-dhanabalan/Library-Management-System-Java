public class IssueRecord {

    private String studentId;
    private String bookId;

    public IssueRecord(String studentId, String bookId) {
        this.studentId = studentId;
        this.bookId = bookId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getBookId() {
        return bookId;
    }
}