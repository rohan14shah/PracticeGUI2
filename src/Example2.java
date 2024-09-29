import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 implements ActionListener {

    private JFrame mainFrame;
    private JPanel borderPanelTop;
    private JPanel borderPanelBottom;
    private JPanel gridPanel;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public static void main(String[] args) {
        Example2 ex = new Example2();
    }

    public Example2() {
        mainFrame = new JFrame();
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 3));
        borderPanelTop = new JPanel();
        borderPanelBottom = new JPanel();
        borderPanelTop.setLayout(new BorderLayout());
        borderPanelBottom.setLayout(new BorderLayout());
        label1 = new JLabel("Label1");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2 = new JLabel("Label2");
        label2.setHorizontalAlignment(JLabel.CENTER);
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");

        borderPanelTop.add(button1, BorderLayout.NORTH);
        borderPanelBottom.add(button3, BorderLayout.SOUTH);
        gridPanel.add(button2);
        gridPanel.add(label1);
        gridPanel.add(button4);
        gridPanel.add(label2);
        gridPanel.add(button5);

        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(borderPanelTop, BorderLayout.NORTH);
        mainFrame.add(borderPanelBottom, BorderLayout.SOUTH);
        mainFrame.add(gridPanel, BorderLayout.CENTER);
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