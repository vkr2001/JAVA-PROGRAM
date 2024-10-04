import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample extends JFrame {
    private JLabel label;
    private JComboBox<String> languageComboBox;
    private JButton showButton;

    public ComboBoxExample() {
        setTitle("Programming Language Selector");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Selected Language: ");
        languageComboBox = new JComboBox<>(new String[]{"Java", "Python", "C++", "JavaScript"});
        showButton = new JButton("Show");

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLanguage = (String) languageComboBox.getSelectedItem();
                label.setText("Selected Language: " + selectedLanguage);
            }
        });

        add(languageComboBox);
        add(showButton);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxExample();
            }
        });
    }
}

