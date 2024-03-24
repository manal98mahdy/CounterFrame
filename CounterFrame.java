/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame {
 public static void main(String[] args) {
        //SwingUtilities.invokeLater(CounterFrame::new);
        JFrame frame = new JFrame();
        myPanel panel = new myPanel();
        
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }}
class myPanel extends JPanel {

    private int counter = 0;
    private JLabel counterLabel;

    public myPanel() {
        

        // Create components
        JButton incrementButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");
        counterLabel = new JLabel("Counter: " + counter);
      // Set layout and add components to the frame
        setLayout(null);
        add(incrementButton);
        incrementButton.setBounds(50, 100, 150, 50);
        
        add(decrementButton);
        decrementButton.setBounds(300, 100, 150, 50);

        add(counterLabel);
        counterLabel.setBounds(200, 300, 150, 50);

        // Add action listeners to buttons
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementCounter();
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decrementCounter();
            }
        });

        

    }

    private void incrementCounter() {
        counter++;
        updateCounterLabel();
    }

    private void decrementCounter() {
        counter--;
        updateCounterLabel();
    }

    private void updateCounterLabel() {
        counterLabel.setText("Counter: " + counter);
    }

   
}
