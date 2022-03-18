/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composiciontarea;

import poo.fes.componentes.Autor;
import poo.fes.componentes.Editorial;
import poo.fes.objeto.Libro;

/**
 *
 * @author AIO
 */
public class ComposicionTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro();
        lib.setNombre(new Autor("Pollitos en fuga", "Antonio Villegas", "2018"));
        lib.setEditorial(new Editorial("Pollitos en fuga", "Porrua", 180));
        System.out.println(lib);
        
    }
    
}
