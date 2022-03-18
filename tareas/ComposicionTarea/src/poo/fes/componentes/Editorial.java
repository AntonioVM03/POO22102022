/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.fes.componentes;

/**
 *
 * @author AIO
 */
public class Editorial {
    
    String titulo;
    String TipoDeEditorial;
    int paginas;

    public Editorial() {
    }

    public Editorial(String titulo, String TipoDeEditorial, int paginas) {
        this.titulo = titulo;
        this.TipoDeEditorial = TipoDeEditorial;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoDeEditorial() {
        return TipoDeEditorial;
    }

    public void setTipoDeEditorial(String TipoDeEditorial) {
        this.TipoDeEditorial = TipoDeEditorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Editorial{" + "titulo=" + titulo + ", TipoDeEditorial=" + TipoDeEditorial + ", paginas=" + paginas + '}';
    }
    
}
