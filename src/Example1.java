import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 implements ActionListener {

    //declare variables
    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JButton button1;
    private JTextArea textArea;
    private int count = 0;



    public static void main(String[] args) {
        Example1 ex = new Example1();
    }


    public Example1() {
        //construct things
        mainFrame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        label = new JLabel("This is the label!");
        textArea = new JTextArea();
        button = new JButton("Button 2");
        button.addActionListener(this);
        button1 = new JButton("Button 1");
        button1.addActionListener(this);

        panel.add(textArea);
        panel.add(button1);
        panel.add(button);
        panel.add(label);
        mainFrame.add(panel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Click the button");
        mainFrame.setSize(400,400);
        //mainFrame.pack();
        mainFrame.setVisible(true);





    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Button 1")) {
            System.out.println("Why did you click the button???");
            count++;
            label.setText("Number of clicks: " + count);
        }
        else if (command.equals("Button 2")) {
            String text = textArea.getText();
            label.setText(text);
        }

    }
}
