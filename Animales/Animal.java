package Animales;

//esta clase es la clase modelo de Animales, se crean los atributos
//se crean los contructores y se encapsula
public class Animal {
    private String nombre;
    private String tipo;
    private String genero;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public Animal(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
