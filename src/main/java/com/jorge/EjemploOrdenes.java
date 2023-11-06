package com.jorge;

import java.util.Calendar;
import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
    Cliente clienteJorge = new Cliente("Jorge", "Gonzalez");

    Producto producto1 = new Producto("Samsung", "Galaxy S20", 1000);
    Producto producto2 = new Producto("Apple", "Iphone 15 pro", 2000);
    Producto producto3 = new Producto("Dell", "Dell latitude 7420", 1500);
    Producto producto4 = new Producto("Apple", "Apple Watch Ultra", 350);
    Producto producto5 = new Producto("Xiaomi", "Redmi Note 30", 800);
    Producto producto6 = new Producto("Motorola", "Moto G50", 1100);
    Producto producto7 = new Producto("Huawei", "P40 Pro", 900);
    Producto producto8 = new Producto("Sony", "PlayStation 5", 500);
    Producto producto9 = new Producto("Microsoft", "Surface Pro 8", 1200);
    Producto producto10 = new Producto("LG", "LG Gram 17", 1400);
    Producto producto11 = new Producto("Google", "Pixel 6", 600);
    Producto producto12 = new Producto("Asus", "ROG Phone 5", 1000);

    OrdenCompra orden1 = new OrdenCompra("Orden 1 del Cliente Jorge Gonzalez");
    orden1.setCliente(clienteJorge);

    Calendar calendarCompra1 = Calendar.getInstance();
    calendarCompra1.set(2021, 9, 1, 10, 30, 0);
    Date fechaCompra1 = calendarCompra1.getTime();
    orden1.setFecha(fechaCompra1);

    orden1.addProducto(producto1);
    orden1.addProducto(producto2);
    orden1.addProducto(producto3);
    orden1.addProducto(producto4);

    OrdenCompra orden2 = new OrdenCompra("Orden 2 del Cliente Jorge Gonzalez");
    orden2.setCliente(clienteJorge);

    Calendar calendarCompra2 = Calendar.getInstance();
    calendarCompra2.set(2022, 10, 1, 10, 30, 0);
    Date fechaCompra2 = calendarCompra2.getTime();
    orden2.setFecha(fechaCompra2);

    orden2.addProducto(producto5);
    orden2.addProducto(producto6);
    orden2.addProducto(producto7);
    orden2.addProducto(producto8);

    OrdenCompra orden3 = new OrdenCompra("Orden 3 del Cliente Jorge Gonzalez");
    orden3.setCliente(clienteJorge);

    Calendar calendarCompra3 = Calendar.getInstance();
    calendarCompra3.set(2023, 11, 1, 11, 25, 16);
    Date fechaCompra3 = calendarCompra3.getTime();
    orden3.setFecha(fechaCompra3);

    orden3.addProducto(producto9);
    orden3.addProducto(producto10);
    orden3.addProducto(producto11);
    orden3.addProducto(producto12);

    System.out.println(orden1.detalleCompra());
    System.out.println(orden2.detalleCompra());
    System.out.println(orden3.detalleCompra());
    }
}