import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layouts extends JFrame implements ActionListener {
    //Declarations
    JLabel l1,l2;
    JButton carbtn, vanbtn, reset;
    JTextField t1, t2;
    JPanel north, south;//, center, west, east;
    public int cnt = 0;
    public static void main(String[] args) {
    new Layouts();
    }
    public Layouts(){
        setLayout(new BorderLayout());
        setSize(600, 300);
        setTitle("CarsAndVans");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // The parameter exits the program whenever the close button on the frame is clicked
        
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
        t1 = new JTextField(5); // The integer parameter defines the size of the textfield
        t1.setEditable(false);
        t1.setText("0");
        t1.setHorizontalAlignment(JLabel.CENTER);
        t2 = new JTextField(5);
        t2.setEditable(false);
        t2.setText("0");
        t2.setHorizontalAlignment(JLabel.CENTER);
        
        //Panels
        north = new JPanel();
        north.setBorder(BorderFactory.createLineBorder(Color.RED));
        add("North", north);
        north.add(l1);north.add(t1);north.add(l2);north.add(t2);
        south = new JPanel();
        south.setBorder(BorderFactory.createLineBorder(Color.blue));
        add("South", south);
        south.add(carbtn);south.add(vanbtn);south.add(reset);

        JLabel centerRegion = new JLabel("Center Region");
        centerRegion.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        add("East", centerRegion);

//        center = new JPanel();
//        center.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//        add("Center", center);
//        center.add(reset);

        JLabel westRegion = new JLabel("West Region");
        westRegion.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        add("West", westRegion);
//        west = new JPanel();
//        west.setBorder(BorderFactory.createLineBorder(Color.GREEN));
//        add("West", west);
//        west.add(vanbtn);
//        //east = new JPanel();

        JLabel eastRegion = new JLabel("East Region");
        eastRegion.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        add("East", eastRegion);
        //east.add(c);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == carbtn)
        {
            cnt = Integer.parseInt(t1.getText())+1;
            t1.setText(Integer.toString(cnt));
        }
        if (e.getSource() == vanbtn)
        {
            cnt= Integer.parseInt(t2.getText())+1;
            t2.setText(Integer.toString(cnt));
        }
        if(e.getSource() == reset)
        {
            t1.setText("0");
            t2.setText("0");
        }

    }
}