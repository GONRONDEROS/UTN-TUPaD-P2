/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author PC
 */
public class Inventario {

    List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p != null) {
            this.productos.add(p);
        }
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        Iterator<Producto> p = this.productos.iterator();

        while (p.hasNext() && productoEncontrado == null) {
            Producto pNext = p.next();
            if (pNext.getId().equalsIgnoreCase(id)) {
                productoEncontrado = pNext;
            }
        }
        if (productoEncontrado == null) {
            System.out.println("Producto no encontrado");
        }
        return productoEncontrado;

    }

    public void eliminarProducto(String id) {
        boolean productoEliminado = productos.removeIf(p -> p.getId().equals(id));

        if (productoEliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto productoId = this.buscarProductoPorId(id);
        if (productoId != null) {
            productoId.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado del producto: " + productoId.getNombre());
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public List filtrarPorCategoria(CategoriaProducto categoria) {
        List listProductoCategoria = new ArrayList<Producto>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                listProductoCategoria.add(producto);
            }
        }
        return listProductoCategoria;
    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }

    public String obtenerProductoConMayorStock() {
        Producto productoMayorStock = productos.get(0);

        for (Producto producto : productos) {
            if (producto.getCantidad() > productoMayorStock.getCantidad()) {
                productoMayorStock = producto;
            }
        }
        return "Producto con mayor stock: " + productoMayorStock.toString();
    }

    public List filtrarProductosPorPrecio(double min, double max) {
        List listProductosXPrecios = new ArrayList<Producto>();

        for (Producto producto : productos) {
            if (min <= producto.getPrecio() && max >= producto.getPrecio()) {
                listProductosXPrecios.add(producto);
            }
        }
        return listProductosXPrecios;
    }

    public Set<CategoriaProducto> mostrarCategoriasDisponibles() {
        Set<CategoriaProducto> categoriasDisponibles = new HashSet<>();
        for (Producto producto : productos) {
            categoriasDisponibles.add(producto.getCategoria());
        }
        return categoriasDisponibles;
    }

}
