import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewBooks {

    JFrame frame;
    JTable table;
    DefaultTableModel model;

    ViewBooks() {

        frame = new JFrame("View Books");

        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Book ID",
                "Book Name",
                "Author",
                "Quantity"
        };

        model = new DefaultTableModel(columns, 0);

        // Load books into table
        for (Book b : Library.books) {

            Object[] row = {
                    b.getBookId(),
                    b.getBookName(),
                    b.getAuthor(),
                    b.getQuantity()
            };

            model.addRow(row);
        }

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 640, 300);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}