package org.ibi.appfacturas;

import org.ibi.appfacturas.modelo.Cliente;
import org.ibi.appfacturas.modelo.Factura;
import org.ibi.appfacturas.modelo.ItemFactura;
import org.ibi.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("75483904Q");
        cliente.setNombre("Victor");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura");
        String desc = scan.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();
        // i = cantidad de productos
        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nº: " + producto.getCodigo() + " ");
            nombre = scan.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = scan.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad");
            cantidad = scan.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
        }

        System.out.println(factura.generarDetalle());
    }
}
