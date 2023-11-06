package com.jorge;

import java.util.Date;

public class OrdenCompra {
    private Integer id;
    private String descripcion;
    private Date fecha;
    Cliente cliente;
    Producto[] productos = new Producto[4];
    private static int ultimoId;
    int indiceProducto;

    public OrdenCompra(String descripcion) {
        this.id = ++ultimoId;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Integer getUltimoId() {
        return ultimoId;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        if (indiceProducto < this.productos.length) {
            productos[indiceProducto++] = producto;
        } else {
            System.out.println("No se pueden agregar mas de 4 productos");
        }
    }

    public String granTotal() {
        int total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return "El total de la compra es: " + total;
    }

    public String detalleCompra() {
        StringBuilder detalle = new StringBuilder("Orden de Compra:" +
                "\nId de la compra: " + getId() +
                "\nDescripción: " + getDescripcion() + '\'' +
                "\nFecha de la compra: " + getFecha() +
                "\nCliente: " + cliente.getNombre() + " " + cliente.getApellido());

        if (productos != null) {
            int contador = 1;
            for (Producto producto : productos) {
                detalle.append("\nProducto nro: ")
                        .append(contador)
                        .append("\nFabricante: ")
                        .append(producto.getFabricante())
                        .append("\nNombre: ")
                        .append(producto.getNombre())
                        .append("\nPrecio: ")
                        .append(producto.getPrecio());
                contador++;
            }
        }
        detalle.append("\nTotal de la compra")
                .append(getId())
                .append("\n").append(granTotal())
                .append("\n")
                .append("===========================================")
                .append("\n");
        return detalle.toString();
    }
}
