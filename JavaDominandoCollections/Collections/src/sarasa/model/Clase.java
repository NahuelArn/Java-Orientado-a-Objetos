package sarasa.model;

public class Clase {
    //atributos
    private String nombre;

    //constructor
    public Clase(String nombre) {
        this.nombre = nombre;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}

