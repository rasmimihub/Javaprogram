import javax.swing.*;  // Import Swing classes

public class MY_Calculator {

    public static void main(String[] args) {

        // Creating window frame is the first step

        JFrame frame = new JFrame("Square Calculator");

        frame.setSize(300, 200);  //gui ko width ra height

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X click garda close

        frame.setLayout(null); // We'll set positions manually 

        // Label input ko lagiiiii

        JLabel label1 = new JLabel("Enter any number:");

        label1.setBounds(30, 30, 150, 35);

        frame.add(label1);

        // Text field to enter number 

        JTextField inputField = new JTextField();

        inputField.setBounds(130, 20, 100, 30);

        frame.add(inputField);

        // Button to calculate

        JButton button = new JButton("Calculate Square");

        button.setBounds(90, 60, 100, 30);

        frame.add(button);

        // Label for result

        JLabel resultLabel = new JLabel("Square of Entered Number is:");

        resultLabel.setBounds(20, 100, 200, 30);

        frame.add(resultLabel);

        // Button click action

        button.addActionListener(e -> {

            try {

                double num = Double.parseDouble(inputField.getText());

                double square = num * num;

                resultLabel.setText("Square of entered number is: " + square);

            } catch (NumberFormatException ex) {

                resultLabel.setText("Please enter a valid number");

            }

        });

        // Showing the window

        frame.setVisible(true);

    }

}
