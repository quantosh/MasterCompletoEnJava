package org.ibi.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS]; // Constante
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    } // setFolio no tenia sentido fuera.

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (int i = 0; i < indiceItems; i++) {
            ItemFactura item = this.items[i]; // optimizado con for antes era for each
            /*
            if (item == null) { // o !item instanceof ItemFactura <- pero mejor no
                continue; // evitando nullpointerexception
            }
            */
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() { //concat SB
        StringBuilder sb = new StringBuilder("Factura n: ");
        sb.append(folio)
                .append("\nCliente: " + cliente.getNombre())
                .append("\tNIF: " + cliente.getNif())
                .append("\nDescripción: " + this.descripcion)
                .append("\n");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM yyyy");
        sb.append("Fecha emisión: ")
                .append(df.format(this.fecha)).append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++) {
            ItemFactura item = this.items[i];
            // Se puede eliminar esta parte utilizando los toString de producto e item
            // Pero quería utilizar un StringBuilder para practicarlo
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }
        sb.append("\nGran total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
