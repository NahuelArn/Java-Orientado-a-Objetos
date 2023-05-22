package sarasa;

import java.util.ArrayList;

public class Curso0 implements Comparable<Curso0> {
    //atributos
    private String nombre;
    private int tiempo;
    //constructor
    public Curso0(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso0(String ruby, int tiempo, ArrayList<Object> objects) {
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    @Override
    public int compareTo(Curso0 o) {
        return this.nombre.compareTo(o.getNombre());
    }
}

