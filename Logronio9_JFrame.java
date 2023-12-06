import javax.swing.*;
import java.awt.GridLayout;
import java.util.function.BinaryOperator;

class Logronio9_JFrame {
    private JFrame frame;
    private JLabel firstLabel;
    private JTextField firstTextField;
    private JLabel secondLabel;
    private JTextField secondTextField;
    private JButton resultButton;
    private JLabel addResultLabel;
    private JTextField addResultTextField;
    private JLabel subtractResultLabel;
    private JTextField subtractResultTextField;
    private JLabel multiplyResultLabel;
    private JTextField multiplyResultTextField;
    private JLabel divideResultLabel;
    private JTextField divideResultTextField;

    public Logronio9_JFrame() {
        runFrame();
    }

    private void runFrame() {
        theFrame();
    }

    public static void main(String[] ukiyo) {
        Logronio9_JFrame calc = new Logronio9_JFrame();
        calc.initialize();
    }

    private void initialize() {
        GridLayout layout = new GridLayout(7, 2);
        firstTextField.setSize(60, 30);
        secondTextField.setSize(60, 30);
        layout.setHgap(40);
        layout.setVgap(40);

        frame.setLayout(layout);

        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int first = Integer.parseInt((firstTextField.getText()).toString());
                int second = Integer.parseInt((secondTextField.getText()).toString());
                BinaryOperator<Integer> addition = (a, b) -> a + b;
                BinaryOperator<Integer> subtraction = (a, b) -> a - b;
                BinaryOperator<Integer> multiplication = (a, b) -> a * b;
                BinaryOperator<Double> division = (a, b) -> a / b;
                addResultTextField.setText("" + addition.apply(first, second));
                subtractResultTextField.setText("" + subtraction.apply(first, second));
                multiplyResultTextField.setText("" + multiplication.apply(first, second));
                double one = first;
                double two = second;
                if (second == 0) {
                    divideResultTextField.setText("Cannot be divided to 0");
                } else

                    divideResultTextField.setText("" + division.apply(one, two));

            }
        });

        frame.add(firstLabel);
        frame.add(firstTextField);
        frame.add(secondLabel);
        frame.add(secondTextField);
        frame.add(addResultLabel);
        frame.add(addResultTextField);
        frame.add(subtractResultLabel);
        frame.add(subtractResultTextField);
        frame.add(multiplyResultLabel);
        frame.add(multiplyResultTextField);
        frame.add(divideResultLabel);
        frame.add(divideResultTextField);
        frame.add(resultButton);
        frame.setVisible(true);

    }

    private void theFrame() {
        frame = new JFrame("Four arithmetic calculator");
        frame.setSize(400, 700);
        frame.setLocation(800, 200);

        firstLabel = new JLabel("Input first number: ");
        firstTextField = new JTextField("");
        secondLabel = new JLabel("Input second number: ");
        secondTextField = new JTextField("");

        addResultLabel = new JLabel("Result: ");
        addResultTextField = new JTextField("Addition Result Here");
        addResultTextField.setEditable(false);
        subtractResultLabel = new JLabel("Result: ");
        subtractResultTextField = new JTextField("Subtract Result Here");
        subtractResultTextField.setEditable(false);
        multiplyResultLabel = new JLabel("Result: ");
        multiplyResultTextField = new JTextField("Multiplication Result Here");
        multiplyResultTextField.setEditable(false);
        divideResultLabel = new JLabel("Result: ");
        divideResultTextField = new JTextField("Division Result Here");
        divideResultTextField.setEditable(false);

        resultButton = new JButton("Calculate");
    }

}
