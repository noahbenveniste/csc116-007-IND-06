import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * GUI application for RationalNumber
 * 
 * @author Jessica Young Schmidt
 * @author Noah Benveniste
 */
public class RationalNumberGUI extends JFrame implements ActionListener {
    
    /** Numerator 1 label */
    private JLabel num1Label;
    
    /** Numerator 1 text field */
    private JTextField num1Ans;
    
    /** Denominator 1 label */
    private JLabel denom1Label;
    
    /** Denominator 1 text field */
    private JTextField denom1Ans;
    
    /** Numerator 2 label */
    private JLabel num2Label;
    
    /** Numerator 2 text field */
    private JTextField num2Ans;
    
    /** Denominator 2 label */
    private JLabel denom2Label;
    
    /** Denominator 2 text field */
    private JTextField denom2Ans;
    
    /** Answer box label */
    private JLabel ans;
    
    /** Answer box text field */
    private JTextField ansText;
   
    /** Button for add */
    private JButton addButton;
    
    /** Button for subtract */
    private JButton subButton;
    
    /** Button for multiplication */
    private JButton multButton;
    
    /** Button for division */
    private JButton divButton;

    /**
     * Default constructor
     */
    public RationalNumberGUI() {
        //Set options for frame
        super("Rational Number GUI");
        setSize(500, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a JPanel container, specifying grid layout as the layout manager
        JPanel panel = new JPanel(new GridLayout(7, 2)); 
        // Add JPanel to the frame
        add(panel);

        //Text labels and input fields
        num1Label = new JLabel("Numerator 1");
        panel.add(num1Label);
        num1Ans = new JTextField(5);
        panel.add(num1Ans);
        
        denom1Label = new JLabel("Denominator 1");
        panel.add(denom1Label);
        denom1Ans = new JTextField(5);
        panel.add(denom1Ans);
        
        num2Label = new JLabel("Numerator 2");
        panel.add(num2Label);
        num2Ans = new JTextField(5);
        panel.add(num2Ans);
        
        denom2Label = new JLabel("Denominator 2");
        panel.add(denom2Label);
        denom2Ans = new JTextField(5);
        panel.add(denom2Ans);
        
        
        //Answer output field
        ans = new JLabel("Answer");
        panel.add(ans);
        ansText = new JTextField(5);
        panel.add(ansText);
        
        
        //Buttons
        addButton = new JButton("Add");
        panel.add(addButton);
        
        subButton = new JButton("Subtract");
        panel.add(subButton);
        
        multButton = new JButton("Multiply");
        panel.add(multButton);

        divButton = new JButton("Divide");
        panel.add(divButton);
        
        
        //Action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multButton.addActionListener(this);
        divButton.addActionListener(this);
        
        setVisible(true);
    }

    /**
     * Performs specific action(s) based on the event that occurs
     * 
     * @param e event that occurred
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int num1 = Integer.parseInt(num1Ans.getText());
                int num2 = Integer.parseInt(num2Ans.getText());
                int denom1 = Integer.parseInt(denom1Ans.getText());
                int denom2 = Integer.parseInt(denom2Ans.getText());
                RationalNumber first = new RationalNumber(num1, denom1);
                RationalNumber second = new RationalNumber(num2, denom2);
                
                //Sets the answer text using ADD method from RationalNumber
                ansText.setText(first.add(second).toString());
                ansText.setEditable(false); //user can't edit answer field
            
            } catch (NumberFormatException nfe) {
                 JOptionPane.showMessageDialog(null, "Invalid integer.");
            } catch (IllegalArgumentException iae) {
                JOptionPane.showMessageDialog(null,
                                "Denomintor of zero in given number or result of operation.");
            }
        }
        if (e.getSource() == subButton) {
            try {
                int num1 = Integer.parseInt(num1Ans.getText());
                int num2 = Integer.parseInt(num2Ans.getText());
                int denom1 = Integer.parseInt(denom1Ans.getText());
                int denom2 = Integer.parseInt(denom2Ans.getText());
                RationalNumber first = new RationalNumber(num1, denom1);
                RationalNumber second = new RationalNumber(num2, denom2);
                
                //Sets the answer text using SUBTRACT method from RationalNumber
                ansText.setText(first.subtract(second).toString());
                ansText.setEditable(false); //user can't edit answer field
            
            } catch (NumberFormatException nfe) {
                 JOptionPane.showMessageDialog(null, "Invalid integer.");
            } catch (IllegalArgumentException iae) {
                JOptionPane.showMessageDialog(null,
                                "Denomintor of zero in given number or result of operation.");
            }
        }
        if (e.getSource() == multButton) {
            try {
                int num1 = Integer.parseInt(num1Ans.getText());
                int num2 = Integer.parseInt(num2Ans.getText());
                int denom1 = Integer.parseInt(denom1Ans.getText());
                int denom2 = Integer.parseInt(denom2Ans.getText());
                RationalNumber first = new RationalNumber(num1, denom1);
                RationalNumber second = new RationalNumber(num2, denom2);
                
                //Sets the answer text using MULTIPLY method from RationalNumber
                ansText.setText(first.multiply(second).toString());
                ansText.setEditable(false); //user can't edit answer field
            
            } catch (NumberFormatException nfe) {
                 JOptionPane.showMessageDialog(null, "Invalid integer.");
            } catch (IllegalArgumentException iae) {
                JOptionPane.showMessageDialog(null,
                                "Denomintor of zero in given number or result of operation.");
            }
        }
        if (e.getSource() == divButton) {
            try {
                int num1 = Integer.parseInt(num1Ans.getText());
                int num2 = Integer.parseInt(num2Ans.getText());
                int denom1 = Integer.parseInt(denom1Ans.getText());
                int denom2 = Integer.parseInt(denom2Ans.getText());
                RationalNumber first = new RationalNumber(num1, denom1);
                RationalNumber second = new RationalNumber(num2, denom2);
                
                //Sets the answer text using DIVIDE method from RationalNumber
                ansText.setText(first.divide(second).toString());
                ansText.setEditable(false); //user can't edit answer field
            
            } catch (NumberFormatException nfe) {
                 JOptionPane.showMessageDialog(null, "Invalid integer.");
            } catch (IllegalArgumentException iae) {
                JOptionPane.showMessageDialog(null,
                                "Denomintor of zero in given number or result of operation.");
            }
        }
    }

    /**
     * Starts the program
     * 
     * @param args array of command line arguments
     */
    public static void main(String[] args) {
        new RationalNumberGUI();
    }
}