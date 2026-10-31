import javax.swing.*;

public class AddBook {

    JFrame frame;

    JTextField txtBookId;
    JTextField txtBookName;
    JTextField txtAuthor;
    JTextField txtQuantity;

    JButton btnAddBook;

    AddBook() {

        frame = new JFrame("Add Book");

        frame.setSize(450, 400);
        frame.setLayout(null);

        JLabel lblBookId = new JLabel("Book ID");
        lblBookId.setBounds(30,30,100,30);
        frame.add(lblBookId);

        txtBookId = new JTextField();
        txtBookId.setBounds(150,30,200,30);
        frame.add(txtBookId);

        JLabel lblBookName = new JLabel("Book Name");
        lblBookName.setBounds(30,80,100,30);
        frame.add(lblBookName);

        txtBookName = new JTextField();
        txtBookName.setBounds(150,80,200,30);
        frame.add(txtBookName);

        JLabel lblAuthor = new JLabel("Author");
        lblAuthor.setBounds(30,130,100,30);
        frame.add(lblAuthor);

        txtAuthor = new JTextField();
        txtAuthor.setBounds(150,130,200,30);
        frame.add(txtAuthor);

        JLabel lblQuantity = new JLabel("Quantity");
        lblQuantity.setBounds(30,180,100,30);
        frame.add(lblQuantity);

        txtQuantity = new JTextField();
        txtQuantity.setBounds(150,180,200,30);
        frame.add(txtQuantity);

        btnAddBook = new JButton("Add Book");
        btnAddBook.setBounds(150,250,120,35);
        frame.add(btnAddBook);

        btnAddBook.addActionListener(e -> {

            Book book = new Book(
                    txtBookId.getText(),
                    txtBookName.getText(),
                    txtAuthor.getText(),
                    Integer.parseInt(txtQuantity.getText()));

            Library.books.add(book);

            JOptionPane.showMessageDialog(frame,
                    "Book Added Successfully");

            txtBookId.setText("");
            txtBookName.setText("");
            txtAuthor.setText("");
            txtQuantity.setText("");

        });

        frame.setVisible(true);

    }

}