package LandersWorks;
//Elyahu Jacobi
import javax.swing.*;
import java.awt.*;

public class GUICalculator extends JFrame {
    private JButton plusButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JButton multButton = new JButton("*");
    private JButton divButton = new JButton("%");
    private JTextField firstField = new JTextField(10);
    private JTextField secondField = new JTextField(10);
    private JLabel results = new JLabel("results");

    public GUICalculator() {
        setTitle("Calculator");
        super.setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        add(firstField);
        add(secondField);
        add(plusButton);
        plusButton.addActionListener(actionEvent -> {
            String firstInput = firstField.getText();
            String secondInput = secondField.getText();
            try {
                float n = Float.parseFloat(firstInput);
                float n2 = Float.parseFloat(secondInput);
                results.setText("" + (n + n2));
            }catch(NumberFormatException e){
                results.setText("0");
            }
        });

        add(minusButton);
        minusButton.addActionListener(actionEvent -> {
            String firstInput = firstField.getText();
            String secondInput = secondField.getText();
            try {
                float n = Float.parseFloat(firstInput);
                float n2 = Float.parseFloat(secondInput);
                results.setText("" + (n - n2));
            }catch(NumberFormatException e){
                results.setText("0");
            }
        });

        add(multButton);
        multButton.addActionListener(actionEvent -> {
            String firstInput = firstField.getText();
            String secondInput = secondField.getText();
            try {
                float n = Float.parseFloat(firstInput);
                float n2 = Float.parseFloat(secondInput);
                results.setText("" + (n * n2));
            }catch(NumberFormatException e){
                results.setText("0");
            }
        });

        add(divButton);
        divButton.addActionListener(actionEvent -> {
            String firstInput = firstField.getText();
            String secondInput = secondField.getText();
                try {
                    float n = Float.parseFloat(firstInput);
                    float n2 = Float.parseFloat(secondInput);
                    results.setText("" + (n / n2));
                }catch(NumberFormatException e){
                    results.setText("0");
                }
        });
        add(results);
        this.setVisible(true);
    }
}
