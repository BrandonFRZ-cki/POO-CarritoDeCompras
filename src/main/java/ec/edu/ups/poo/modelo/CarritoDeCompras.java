package ec.edu.ups.poo.modelo;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List <ItemCarrito> listaItem;
    public CarritoDeCompras() {
        listaItem = new ArrayList<ItemCarrito>();
    }
    public void agregarProducto(Producto p, int cantidad) {
        listaItem.add(new ItemCarrito(p, cantidad)); // Compocicion :)
    }
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito itemCarrito : listaItem) {
            total+=itemCarrito.getCantidad()*itemCarrito.getProducto().getPrecio();
        }
        return total;
    }
    @Override
    public String toString() {
        return "CarritoDeCompras:\n" +
                "\tItems:\n" + listaItem;
    }
}
