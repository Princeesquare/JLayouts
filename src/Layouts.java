import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layouts extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton carbtn, vanbtn, reset;
    JTextField t1, t2;
    JPanel north, south;
    public int cnt;
    public static void main(String[] args) {
    new Layouts();
    }
    public Layouts(){
        setLayout(new BorderLayout());
        setSize(600, 300);
        setTitle("CarsAndVans");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Labels
        l1 = new JLabel("Cars");
        l2 = new JLabel("Vans");
        
        //Buttons
        carbtn = new JButton("CARS");
        carbtn.addActionListener(this);
        vanbtn = new JButton("VANS");
        vanbtn.addActionListener(this);
        reset = new JButton("RESET");
        reset.addActionListener(this);
        
        //TextFields
        t1 = new JTextField();
        t1.setEditable(false);
        t1.setText("0");
        t2 = new JTextField();
        t2.setEditable(false);
        t2.setText("0");
        
        //Panels
        north = new JPanel();
        north.setBorder(BorderFactory.createLineBorder(Color.RED));
        add("North", north);
        north.add(l1);north.add(t1);north.add(l2);north.add(t2);
        south = new JPanel();
        south.setBorder(BorderFactory.createLineBorder(Color.blue));
        add("South", south);
        south.add(carbtn);south.add(vanbtn);south.add(reset);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}