import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homework3 implements ActionListener {

    private JFrame mainFrame;
    private JPanel borderPanel;
    private JPanel gridPanel;
    private JLabel label1;
    private JTextArea text1;
    private JButton button1;
    private JButton button2;
    private JTextArea text2;
    public static void main(String[] args) {
        homework3 hw = new homework3();
    }

    public homework3() {
        mainFrame = new JFrame();
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 1));
        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        label1 = new JLabel("Label1");
        label1.setHorizontalAlignment(JLabel.CENTER);
        text1 = new JTextArea("text1");
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        text2 = new JTextArea("text2");

        borderPanel.add(button1, BorderLayout.NORTH);
        borderPanel.add(button2, BorderLayout.EAST);
        gridPanel.add(text1);
        gridPanel.add(label1);
        gridPanel.add(text2);
        borderPanel.add(gridPanel, BorderLayout.CENTER);

        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(borderPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Click the button");
        mainFrame.setSize(400, 400);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click events here
    }
}