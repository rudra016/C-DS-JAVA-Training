import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {

    private JTextField heightField;
    private JTextField weightField;
    private JLabel resultLabel;

    public BMICalculator() {
        setTitle("BMI Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel heightLabel = new JLabel("Height (m):");
        heightLabel.setBounds(50, 30, 80, 25);
        add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(140, 30, 100, 25);
        add(heightField);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(50, 70, 80, 25);
        add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(140, 70, 100, 25);
        add(weightField);

        JButton calculateButton = new JButton("Calculate BMI");
        calculateButton.setBounds(80, 110, 120, 30);
        calculateButton.addActionListener(new CalculateButtonListener());
        add(calculateButton);

        resultLabel = new JLabel("Your BMI: ");
        resultLabel.setBounds(50, 160, 200, 25);
        add(resultLabel);

        setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double height = Double.parseDouble(heightField.getText());
                double weight = Double.parseDouble(weightField.getText());
                double bmi = weight / (height * height);
                resultLabel.setText(String.format("Your BMI: %.2f", bmi));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(BMICalculator.this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new BMICalculator();
    }
}
