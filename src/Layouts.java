import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layouts extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton carbtn, vanbtn, reset;
    JTextField t1, t2;
    JPanel pn1, pn2;
    public int cnt;
    public static void main(String[] args) {
    new Layouts();
    }
    public Layouts(){
        setLayout(new BorderLayout());
        setSize(600, 300);
        setTitle("CarsAndVans");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Cars");
        l2 = new JLabel("Vans");

        carbtn = new JButton("CARS");
        carbtn.addActionListener(this);
        vanbtn = new JButton("VANS");
        vanbtn.addActionListener(this);
        reset = new JButton("RESET");
        reset.addActionListener(this);

        t1 = new JTextField();
        t1.setEditable(false);
        t1.setText("0");
        t2 = new JTextField();
        t2.setEditable(false);
        t2.setText("0");

        pn1 = new JPanel();
        pn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        add("North", pn1);
        pn1.add(l1);pn1.add(t1);pn1.add(l2);pn1.add(t2);

        pn2 = new JPanel();
        pn2.setBorder(BorderFactory.createLineBorder(Color.blue));
        add("South", pn2);
        pn2.add(carbtn);pn2.add(vanbtn);pn2.add(reset);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}