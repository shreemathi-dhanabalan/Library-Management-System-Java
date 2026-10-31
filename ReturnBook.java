import javax.swing.*;

public class ReturnBook {

    JFrame frame;

    JTextField txtStudentId;
    JTextField txtBookId;

    JButton btnReturn;

    ReturnBook() {

        frame = new JFrame("Return Book");

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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

        btnReturn = new JButton("Return Book");
        btnReturn.setBounds(120,180,140,35);
        frame.add(btnReturn);

        btnReturn.addActionListener(e -> {

            String studentId = txtStudentId.getText();
            String bookId = txtBookId.getText();

            IssueRecord record = null;

            // Check if the student has borrowed the book
            for(IssueRecord r : Library.issuedBooks){

                if(r.getStudentId().equals(studentId)
                        && r.getBookId().equals(bookId)){

                    record = r;
                    break;
                }

            }

            if(record == null){

                JOptionPane.showMessageDialog(frame,
                        "This Book Was Not Issued To This Student");

                return;
            }

            // Increase quantity
            for(Book b : Library.books){

                if(b.getBookId().equals(bookId)){

                    b.setQuantity(b.getQuantity() + 1);
                    break;

                }

            }

            // Remove issue record
            Library.issuedBooks.remove(record);

            JOptionPane.showMessageDialog(frame,
                    "Book Returned Successfully");

            txtStudentId.setText("");
            txtBookId.setText("");

        });

        frame.setVisible(true);

    }

}
