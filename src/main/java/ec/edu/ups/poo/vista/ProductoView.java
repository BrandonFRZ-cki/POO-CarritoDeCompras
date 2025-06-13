package ec.edu.ups.poo.vista;

import ec.edu.ups.poo.modelo.Producto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductoView extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelHeader;
    private JPanel panelContainer;
    private JPanel panelFooter;
    private JButton btLimpiar;
    private JButton btAgregar;
    private JTextField tfCodigo;
    private JTextField tfNombre;
    private JTextField tfPrecio;
    private JLabel lbNombre;
    private JLabel lbPrecio;
    private JLabel lbCodigo;

    public ProductoView() {
        setTitle("Creacion de Producto");
        setContentPane(panelPrincipal);
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();
        btAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarDatos();
            }
        });
        btLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

    }
    public static void main(String[] args) {
        new ProductoView();
    }
    public void ingresarDatos() {
        System.out.println("Ingresando datos...");
        System.out.println(tfCodigo.getText());
        System.out.println(tfNombre.getText());
        System.out.println(tfPrecio.getText());

        new Producto(Integer.parseInt(tfCodigo.getText()),tfNombre.getText(),Double.parseDouble(tfPrecio.getText()));
    }
    public void limpiar() {
        tfCodigo.setText("");
        tfNombre.setText("");
        tfPrecio.setText("");
    }
}
