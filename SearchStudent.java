import javax.swing.*;

public class SearchStudent {

    JFrame frame;

    JTextField txtId;

    JButton btnSearch;

    JLabel lblName;
    JLabel lblDepartment;
    JLabel lblYear;

    SearchStudent() {

        frame = new JFrame("Search Student");

        frame.setSize(450,350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblId = new JLabel("Student ID");
        lblId.setBounds(30,30,100,30);
        frame.add(lblId);

        txtId = new JTextField();
        txtId.setBounds(150,30,200,30);
        frame.add(txtId);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(150,80,100,35);
        frame.add(btnSearch);

        lblName = new JLabel("");
        lblName.setBounds(30,150,350,30);
        frame.add(lblName);

        lblDepartment = new JLabel("");
        lblDepartment.setBounds(30,190,350,30);
        frame.add(lblDepartment);

        lblYear = new JLabel("");
        lblYear.setBounds(30,230,350,30);
        frame.add(lblYear);

        btnSearch.addActionListener(e -> {

            String id = txtId.getText();

            Student found = null;

            for(Student s : Library.students){

                if(s.getStudentId().equals(id)){

                    found = s;
                    break;

                }

            }

            if(found==null){

                JOptionPane.showMessageDialog(frame,
                        "Student Not Found");

                lblName.setText("");
                lblDepartment.setText("");
                lblYear.setText("");

            }

            else{

                lblName.setText("Name : "+found.getStudentName());

                lblDepartment.setText("Department : "+found.getDepartment());

                lblYear.setText("Year : "+found.getYear());

            }

        });

        frame.setVisible(true);

    }

}
