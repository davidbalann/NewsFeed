import javax.swing.*;

public class Main {
    public static void main(String[] args) {



        JFrame f = new JFrame();
        f.setLayout(null);
        f.setTitle("RSS FEED");
        f.setSize(400, 600);

        JLabel title = new JLabel("RSS FEED",SwingConstants.CENTER);
        title.setBounds(100,25,200,50);
        f.add(title);

        String[] choices = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

        JComboBox<String> cb = new JComboBox<>(choices);
        cb.setBounds(50,100,100,25);
        cb.setVisible(true);
        f.add(cb);

        JButton b = new JButton("View");
        b.setBounds(250,100,100,25);
        f.add(b);

        JTextArea feed = new JTextArea();
        feed.setBounds(50,150,300,300);
        f.add(feed);


//        JScrollPane scroller = new JScrollPane(feed);
//        JScrollBar bar = new JScrollBar();
//        scroller.setBounds(350,150,50,300);
//        scroller.add(bar);
//        f.add(scroller);
//


        JLabel displayLable = new JLabel("Enter Title To Display",SwingConstants.CENTER);
        displayLable.setBounds(50,475,125,25);
        f.add(displayLable);

        JTextField displayField = new JTextField("");
        displayField.setBounds(225,475,125,25);
        f.add(displayField);

        JButton displaybutton = new JButton("Display");
        displaybutton.setBounds(125,525,150,25);
        f.add(displaybutton);

        f.setVisible(true);

        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });

    }
}