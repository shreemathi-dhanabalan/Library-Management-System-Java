import javax.swing.*;
import java.awt.*;

public class Dashboard {

    JFrame frame;

    JButton btnRegisterStudent;
    JButton btnViewStudents;
    JButton btnSearchStudent;

    JButton btnAddBook;
    JButton btnViewBooks;
    JButton btnIssueBook;
    JButton btnReturnBook;
    JButton btnSearchBook;

    JButton btnExit;

    Dashboard() {

        frame = new JFrame("Library Management System");

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Font heading = new Font("Arial", Font.BOLD, 22);
        Font subHeading = new Font("Arial", Font.BOLD, 16);

        JLabel title = new JLabel("LIBRARY MANAGEMENT SYSTEM");
        title.setFont(heading);
        title.setBounds(150,20,400,30);
        frame.add(title);

        //---------------- Student Management ----------------//

        JLabel student = new JLabel("Student Management");
        student.setFont(subHeading);
        student.setBounds(50,80,200,30);
        frame.add(student);

        btnRegisterStudent = new JButton("Register Student");
        btnRegisterStudent.setBounds(50,130,220,35);
        frame.add(btnRegisterStudent);

        btnViewStudents = new JButton("View Students");
        btnViewStudents.setBounds(50,180,220,35);
        frame.add(btnViewStudents);

        btnSearchStudent = new JButton("Search Student");
        btnSearchStudent.setBounds(50,230,220,35);
        frame.add(btnSearchStudent);

        //---------------- Book Management ----------------//

        JLabel book = new JLabel("Book Management");
        book.setFont(subHeading);
        book.setBounds(380,80,200,30);
        frame.add(book);

        btnAddBook = new JButton("Add Book");
        btnAddBook.setBounds(380,130,220,35);
        frame.add(btnAddBook);

        btnViewBooks = new JButton("View Books");
        btnViewBooks.setBounds(380,180,220,35);
        frame.add(btnViewBooks);

        btnIssueBook = new JButton("Issue Book");
        btnIssueBook.setBounds(380,230,220,35);
        frame.add(btnIssueBook);

        btnReturnBook = new JButton("Return Book");
        btnReturnBook.setBounds(380,280,220,35);
        frame.add(btnReturnBook);

        btnSearchBook = new JButton("Search Book");
        btnSearchBook.setBounds(380,330,220,35);
        frame.add(btnSearchBook);

        //---------------- Exit ----------------//

        btnExit = new JButton("Exit");
        btnExit.setBounds(250,430,180,40);
        frame.add(btnExit);

        //---------------- Actions ----------------//

        btnRegisterStudent.addActionListener(e -> new RegisterStudent());

        btnViewStudents.addActionListener(e -> new ViewStudents());

        btnSearchStudent.addActionListener(e -> new SearchStudent());

        btnAddBook.addActionListener(e -> new AddBook());

        btnViewBooks.addActionListener(e -> new ViewBooks());

        btnIssueBook.addActionListener(e -> new IssueBook());

        btnReturnBook.addActionListener(e -> new ReturnBook());

        btnSearchBook.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "Search Book page will be created next."));

        btnExit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);

    }
}