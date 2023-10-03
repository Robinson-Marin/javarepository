package Persona;
//esta clase es la clase modelo de persona, se crean los atributos

//se crean los contructores y se encapsula

public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private double sueldoHora;
    private String cargo;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String genero, double sueldoHora, String cargo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.sueldoHora = sueldoHora;
        this.cargo = cargo;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String genero, double sueldoHora, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.sueldoHora = sueldoHora;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
