import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Client {
    private JPanel panel1;
    private JButton sureButton;
    private JTextField price;
    private JButton clearButton;
    private JTextField count;
    private JTextArea detailTextArea;
    private JLabel shouldAccpetLabel;
    private JComboBox typeComboBox;

    private double total = 0.0d, shouldAccept = 0.0;
    private CashContext cashContext;

    private Client() {

        cashContext = new CashContext("NORMAL");
        sureButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                double singleTotal = Double.parseDouble(price.getText()) * Double.parseDouble(count.getText());

                total += singleTotal;

                detailTextArea.append(price.getText() + " * " + count.getText() + " = " + singleTotal + "\n+\n");

                shouldAccept = cashContext.useTodayDiscount(total);
                shouldAccpetLabel.setText(String.valueOf(shouldAccept));

                price.setText("");
                price.setRequestFocusEnabled(true);

                count.setText("");
            }
        });

        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                total = 0.0d;
                shouldAccept = 0.0d;

                price.setText("");
                price.setRequestFocusEnabled(true);

                count.setText("");
                shouldAccpetLabel.setText("0.0");
            }
        });


        typeComboBox.addItemListener(itemEvent -> {
            cashContext = new CashContext(typeComboBox.getSelectedItem().toString());
            shouldAccept = cashContext.useTodayDiscount(total);
            shouldAccpetLabel.setText(String.valueOf(shouldAccept));
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    static void show() {
        JFrame frame = new JFrame("Client");
        frame.setSize(220, 360);
        frame.setLocation(300, 300);
        frame.setContentPane(new Client().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Client.show();
    }

}
