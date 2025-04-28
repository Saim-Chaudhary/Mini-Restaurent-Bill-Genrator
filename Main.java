import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Restaurent Bill Generator");

        JLabel label1 = new JLabel();
        label1.setText("Restaurent Bill Generator");
        label1.setBounds(100, 10, 200, 30);

        String[] items = {"Burger  | 5$","Pizza   | 8$","Soda    | 2$","Fries   | 2$","Salad   | 1.5$","Chicken | 12$","Bread   | 3$"};

        JComboBox<String> menu = new JComboBox<>(items);
        menu.setBounds(100, 50, 150, 30);

        JLabel label2 = new JLabel();
        label2.setText("No. of Items");
        label2.setBounds(100, 90, 100, 30);

        JTextField field1 = new JTextField();
        field1.setBounds(100, 120, 150, 30);

        JLabel label3 = new JLabel();
        label3.setText("Total Price:");
        label3.setBounds(100, 160, 100, 30);

        JLabel total = new JLabel();
        total.setBounds(220, 160, 100, 30);

        menu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String selected = (String) menu.getSelectedItem();
                int quantity;
                try {
                    quantity = Integer.parseInt(field1.getText());
                } catch (NumberFormatException ex) {
                    quantity = 0;
                }
                if(selected.equals("Burger  | 5$")){
                    total.setText(String.valueOf(quantity * 5) + "$");
                } else if(selected.equals("Pizza   | 8$")){
                    total.setText(String.valueOf(quantity * 8) + "$");
                } else if(selected.equals("Soda    | 2$")){
                    total.setText(String.valueOf(quantity * 2) + "$");
                } else if(selected.equals("Fries   | 2$")){
                    total.setText(String.valueOf(quantity * 2) + "$");
                } else if(selected.equals("Salad   | 1.5$")){
                    total.setText(String.valueOf(quantity * 1.5) + "$");
                } else if(selected.equals("Chicken | 12$")){
                    total.setText(String.valueOf(quantity * 12) + "$");
                } else if(selected.equals("Bread   | 3$")){
                    total.setText(String.valueOf(quantity * 3) + "$");
                }
            }
        });

        field1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String selected = (String) menu.getSelectedItem();
                int quantity;
                try {
                    quantity = Integer.parseInt(field1.getText());
                } catch (NumberFormatException ex) {
                    quantity = 0;
                }
                if(selected.equals("Burger  | 5$")){
                    total.setText(String.valueOf(quantity * 5) + "$");
                } else if(selected.equals("Pizza   | 8$")){
                    total.setText(String.valueOf(quantity * 8) + "$");
                } else if(selected.equals("Soda    | 2$")){
                    total.setText(String.valueOf(quantity * 2) + "$");
                } else if(selected.equals("Fries   | 2$")){
                    total.setText(String.valueOf(quantity * 2) + "$");
                } else if(selected.equals("Salad   | 1.5$")){
                    total.setText(String.valueOf(quantity * 1.5) + "$");
                } else if(selected.equals("Chicken | 12$")){
                    total.setText(String.valueOf(quantity * 12) + "$");
                } else if(selected.equals("Bread   | 3$")){
                    total.setText(String.valueOf(quantity * 3) + "$");
                }
            }
        });
        frame.add(total);
        frame.add(field1);
        frame.add(label3);
        frame.add(label2);
        frame.add(menu);
        frame.add(label1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}