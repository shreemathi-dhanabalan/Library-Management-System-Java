import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewStudents {

    JFrame frame;
    JTable table;
    DefaultTableModel model;

    ViewStudents() {

        frame = new JFrame("View Students");

        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Column Names
        String[] columns = {
                "Student ID",
                "Student Name",
                "Department",
                "Year"
        };

        model = new DefaultTableModel(columns, 0);

        // Add Students to Table
        for (Student s : Library.students) {

            Object[] row = {
                    s.getStudentId(),
                    s.getStudentName(),
                    s.getDepartment(),
                    s.getYear()
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
