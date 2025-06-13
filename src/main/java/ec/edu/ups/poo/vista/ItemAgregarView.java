package ec.edu.ups.poo.vista;

import javax.swing.*;

public class ItemAgregarView extends JFrame {
    private JPanel panelPrincipal;
    private JButton añadirACarritoButton;
    private JTextField textField1;
    private JSpinner spinner1;
    private JList list1;
    private JButton carritoButton;

    public ItemAgregarView() {
        setTitle("Creacion de Producto");
        setContentPane(panelPrincipal);
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ItemAgregarView();
    }
}
