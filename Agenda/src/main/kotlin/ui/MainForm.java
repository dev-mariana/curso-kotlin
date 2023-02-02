package ui;

import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton addButton;
    private JButton removeButton;
    private JTable contactsTable;

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
    }
}
