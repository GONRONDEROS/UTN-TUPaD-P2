/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Trailer Película", 5);

        EditorVideo editor = new EditorVideo();
        Render render = editor.exportar("MP4", proyecto);

        System.out.println(render);
    }
}
