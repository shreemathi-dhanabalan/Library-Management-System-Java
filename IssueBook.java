import javax.swing.*;

public class IssueBook {

    JFrame frame;

    JTextField txtStudentId;
    JTextField txtBookId;

    JButton btnIssue;

    IssueBook() {

        frame = new JFrame("Issue Book");

        frame.setSize(400,300);
        frame.setLayout(null);

        JLabel lblStudent = new JLabel("Student ID");
        lblStudent.setBounds(30,40,100,30);
        frame.add(lblStudent);

        txtStudentId = new JTextField();
        txtStudentId.setBounds(150,40,180,30);
        frame.add(txtStudentId);

        JLabel lblBook = new JLabel("Book ID");
        lblBook.setBounds(30,100,100,30);
        frame.add(lblBook);

        txtBookId = new JTextField();
        txtBookId.setBounds(150,100,180,30);
        frame.add(txtBookId);

        btnIssue = new JButton("Issue Book");
        btnIssue.setBounds(120,180,130,35);
        frame.add(btnIssue);

        btnIssue.addActionListener(e -> {

            String studentId = txtStudentId.getText();
            String bookId = txtBookId.getText();

            Student foundStudent = null;

            for(Student s : Library.students){

                if(s.getStudentId().equals(studentId)){
                    foundStudent = s;
                    break;
                }

            }

            if(foundStudent == null){

                JOptionPane.showMessageDialog(frame,
                        "Student Not Registered");

                return;
            }

            Book foundBook = null;

            for(Book b : Library.books){

                if(b.getBookId().equals(bookId)){
                    foundBook = b;
                    break;
                }

            }

            if(foundBook == null){

                JOptionPane.showMessageDialog(frame,
                        "Book Not Found");

                return;
            }

            if(foundBook.getQuantity() <= 0){

                JOptionPane.showMessageDialog(frame,
                        "Book Not Available");

                return;
            }

            foundBook.setQuantity(foundBook.getQuantity()-1);

            Library.issuedBooks.add(new IssueRecord(studentId,bookId));

            JOptionPane.showMessageDialog(frame,
                    "Book Issued Successfully");

            txtStudentId.setText("");
            txtBookId.setText("");

        });

        frame.setVisible(true);

    }

}