/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.fes.objeto;

import poo.fes.componentes.Autor;
import poo.fes.componentes.Editorial;

/**
 *
 * @author AIO
 */
public class Libro {
    Editorial editorial;
    Autor nombre;

    public Libro() {
    }

    public Libro(Editorial editorial, Autor nombre) {
        this.editorial = editorial;
        this.nombre = nombre;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Autor getNombre() {
        return nombre;
    }

    public void setNombre(Autor nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro{" + "editorial=" + editorial + ", nombre=" + nombre + '}';
    }

    
    }
    
    


