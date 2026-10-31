import javax.swing.*;

public class RegisterStudent {

    JFrame frame;

    JTextField txtId;
    JTextField txtName;
    JTextField txtDepartment;
    JTextField txtYear;

    JButton btnRegister;

    RegisterStudent() {

        frame = new JFrame("Register Student");

        frame.setSize(450,400);
        frame.setLayout(null);

        JLabel lblId = new JLabel("Student ID");
        lblId.setBounds(30,30,100,30);
        frame.add(lblId);

        txtId = new JTextField();
        txtId.setBounds(150,30,200,30);
        frame.add(txtId);

        JLabel lblName = new JLabel("Student Name");
        lblName.setBounds(30,80,100,30);
        frame.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150,80,200,30);
        frame.add(txtName);

        JLabel lblDepartment = new JLabel("Department");
        lblDepartment.setBounds(30,130,100,30);
        frame.add(lblDepartment);

        txtDepartment = new JTextField();
        txtDepartment.setBounds(150,130,200,30);
        frame.add(txtDepartment);

        JLabel lblYear = new JLabel("Year");
        lblYear.setBounds(30,180,100,30);
        frame.add(lblYear);

        txtYear = new JTextField();
        txtYear.setBounds(150,180,200,30);
        frame.add(txtYear);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(150,250,120,35);
        frame.add(btnRegister);

        btnRegister.addActionListener(e -> {

            Student s = new Student(
                    txtId.getText(),
                    txtName.getText(),
                    txtDepartment.getText(),
                    txtYear.getText());

            Library.students.add(s);

            JOptionPane.showMessageDialog(frame,
                    "Student Registered Successfully");

            txtId.setText("");
            txtName.setText("");
            txtDepartment.setText("");
            txtYear.setText("");

        });

        frame.setVisible(true);

    }

}