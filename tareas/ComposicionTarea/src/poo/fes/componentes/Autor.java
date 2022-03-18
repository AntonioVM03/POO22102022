/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.fes.componentes;

/**
 *
 * @author AIO
 */
public class Autor {
    String titulo;
    String creador;
    String anho;

    public Autor() {
    }

    public Autor(String titulo, String creador, String anho) {
        this.titulo = titulo;
        this.creador = creador;
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Autor{" + "titulo=" + titulo + ", creador=" + creador + ", anho=" + anho + '}';
    }
  
    
}
