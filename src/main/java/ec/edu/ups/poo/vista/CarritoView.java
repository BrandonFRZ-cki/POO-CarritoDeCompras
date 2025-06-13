package ec.edu.ups.poo.vista;

import javax.swing.*;

public class CarritoView extends JFrame {
    private JPanel panelPrincipal;
    private JButton limpiarButton;
    private JButton comprarButton;
    private JList list1;
    private JButton volverButton;

    public CarritoView() {
        setTitle("Creacion de Producto");
        setContentPane(panelPrincipal);
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CarritoView();
    }
}
