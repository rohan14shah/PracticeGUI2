import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class homework1 implements ActionListener {
    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
       homework1 hw = new homework1();
    }


    public homework1() {
        mainFrame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        label1 = new JLabel("Label 1!");
        label2 = new JLabel("Label 2!");
        button2 = new JButton("Button 2");
        button1 = new JButton("Button 1");

        panel.add(label1);
        panel.add(button1);
        panel.add(button2);
        panel.add(label2);
        mainFrame.add(panel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Click the button");
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);









    }















    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
