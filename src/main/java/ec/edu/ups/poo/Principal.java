package ec.edu.ups.poo;

import ec.edu.ups.poo.modelo.CarritoDeCompras;
import ec.edu.ups.poo.modelo.Producto;

public class Principal {
    public static void main(String[] args) {
        //Creacion de Productos
        Producto p1 = new Producto("ec.edu.ups.poo.modelo.Producto Uno","CP-001",1.50);
        Producto p2 = new Producto("ec.edu.ups.poo.modelo.Producto Dos","CP-002",2.50);
        Producto p3 = new Producto("ec.edu.ups.poo.modelo.Producto Tres","CP-003",3.50);
        Producto p4 = new Producto("ec.edu.ups.poo.modelo.Producto Cuatro","CP-004",4.50);
        Producto p5 = new Producto("ec.edu.ups.poo.modelo.Producto Cinco","CP-005",5.50);
        Producto p6 = new Producto("ec.edu.ups.poo.modelo.Producto Cinco","CP-006",6.50);
        Producto p7 = new Producto("ec.edu.ups.poo.modelo.Producto Cinco","CP-007",7.50);

        CarritoDeCompras carritoDeCompras = new CarritoDeCompras();
        carritoDeCompras.agregarProducto(p1,1);
        carritoDeCompras.agregarProducto(p2,2);
        carritoDeCompras.agregarProducto(p3,3);
        carritoDeCompras.agregarProducto(p4,4);
        carritoDeCompras.agregarProducto(p5,5);
        carritoDeCompras.agregarProducto(p6,6);
        carritoDeCompras.agregarProducto(p7,7);

        System.out.println(carritoDeCompras.toString());
        System.out.println("Precio Total: "+carritoDeCompras.calcularTotal());
    }
}
