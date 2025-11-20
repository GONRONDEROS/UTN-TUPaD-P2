/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p1 = new Producto("1", "Leche Entera", 1250.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Smartphone X", 120000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Campera de cuero", 35000.0, 5, CategoriaProducto.ROPA);
        Producto p4 = new Producto("4", "Silla de madera", 8000.0, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Arroz Integral 1kg", 1000.0, 100, CategoriaProducto.ALIMENTOS);

        Inventario inventario = new Inventario();
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Lista de productos: ");
        inventario.listarProductos();
        System.out.println("\n");
        System.out.println("Producto encontrado con id 3: " + inventario.buscarProductoPorId("3") + "\n");
        
        inventario.eliminarProducto("2");
        System.out.println("Productos restantes: ");
        inventario.listarProductos();
        System.out.println("\n");
        
        System.out.println("Lista de productos de categoria ROPA: " + inventario.filtrarPorCategoria(CategoriaProducto.ROPA) + "\n");
        
        inventario.actualizarStock("5", 50);

        System.out.println("Total de stock: " + inventario.obtenerTotalStock() + "\n");

        System.out.println(inventario.obtenerProductoConMayorStock() + "\n");
        
        System.out.println("Lista de productos en la banda de precios entre $1000 y $3.000" + inventario.filtrarProductosPorPrecio(1000, 3000) + "\n");
        
        System.out.println("Categorias disponibles: " + inventario.mostrarCategoriasDisponibles());
    }

}
