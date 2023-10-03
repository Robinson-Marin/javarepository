package Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Operaciones {
    String nombre;
    String apellido;
    String genero;
    double sueldoHora;
    String cargo;
    int edad;
    Persona persona = new Persona();

    private List<Persona> listaPersonas;

    public Operaciones() {
        listaPersonas = new ArrayList<>();
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void numeroDePersonas() {
        int cantidad = getListaPersonas().size();
        JOptionPane.showMessageDialog(null, "el numero de personas es: " + cantidad);
    }

    // metodo para crear personas y agregarlas a un arrayList
    public void crearPersonas() {
        nombre = JOptionPane.showInputDialog(null, "ingrese el nombre:").toLowerCase();
        apellido = JOptionPane.showInputDialog(null, "ingrese el apellido:");
        genero = JOptionPane.showInputDialog(null, "ingrese el genero\nmasculino(m)\nfemenino(f):").toLowerCase();
        if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) {
            sueldoHora = Double.parseDouble(JOptionPane.showInputDialog(null, "sueldo por hora"));
            // int optioncargo = Integer.parseInt(
            // JOptionPane.showInputDialog(null,
            // "cargo\n1.Director\n2.Administrador\n3.desarrollador\n4.otro"));

            // switch (optioncargo) {
            // case 1:
            // persona.setCargo("director");
            // break;
            // case 2:
            // persona.setCargo("administrador");
            // break;
            // case 3:
            // persona.setCargo("Desarrollador");
            // break;
            // case 4:
            String cargo = JOptionPane.showInputDialog(null, "ingrese el cargo");
            persona.setCargo(cargo);
            // break;
            // }
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la edad"));
            getListaPersonas().add(new Persona(nombre, apellido, genero, sueldoHora, cargo, edad));

        } else

        {
            genero = JOptionPane.showInputDialog(null, "ingrese una opcion valida(m/f)");
        }
    }

    // este metodo calcula el promedio de las edades
    public void calcularEdades() {
        double promedio = getListaPersonas().stream().mapToInt(Persona::getEdad).average().orElse(0);
        JOptionPane.showMessageDialog(null, "el promedio de las edades es: " + promedio);
    }

    // este metodo me imprime las personas mayores de edad
    public void mayoresDeEdad() {
        long mayores = getListaPersonas().stream().filter(list -> list.getEdad() >= 18).count();
        JOptionPane.showMessageDialog(null, "cantidad de personas mayores de edad: " + mayores);
    }

    // me imprime los nombres que inician con "a"
    public void nombresConA() {
        List<Persona> a = getListaPersonas().stream().filter(list -> list.getNombre().startsWith("a"))
                .collect(Collectors.toList());
        a.forEach(list -> JOptionPane.showMessageDialog(null, "nombre que inician con a: " + list.getNombre()));
    }

    // me imprime los apellidos que contienen "m"
    public void apellidoConM() {
        List<Persona> m = getListaPersonas().stream().filter(list -> list.getApellido().contains("m"))
                .collect(Collectors.toList());
        m.forEach(list -> JOptionPane.showMessageDialog(null, "apellidos que contienen m: " + list.getApellido()));

    }

    // imprime el sueldo de oco horas de los cargos director con genero masculino
    public void sueldoDeOchoHoras() {
        getListaPersonas().stream()
                .filter(list -> list.getCargo().equalsIgnoreCase("director") && list.getGenero().equalsIgnoreCase("m"));
        for (Persona persona : listaPersonas) {
            double sueldoH = persona.getSueldoHora() * 8;
            JOptionPane.showMessageDialog(null, "Sueldo de 8 horas: " + sueldoH + "\n" + persona.getNombre());

        }
    }

    // me imprime el primer desarrollador de genero femenino
    public void desarrolladorfem() {
        getListaPersonas().stream()
                .filter(list -> list.getCargo().equalsIgnoreCase("Desarrollador")
                        && list.getGenero().equalsIgnoreCase("f"))
                .findFirst()
                .ifPresent(list -> JOptionPane.showMessageDialog(null, "primer desarrollador femenino" +
                        "\nnombre: " + list.getNombre() + "\napellido: " + list.getApellido()));

    }

    // me imprime el cargo desarrollador que mas gana por hora
    public void masGana() {
        Optional<Persona> personaMasGana = getListaPersonas().stream()
                .filter(list -> list.getCargo().equalsIgnoreCase("desarrollador"))
                .max(Comparator.comparingDouble(Persona::getSueldoHora));
        if (personaMasGana.isPresent()) {
            JOptionPane.showMessageDialog(null, "desarrollador que mas gana por hora: ");
            Persona masgana = personaMasGana.get();
            JOptionPane.showMessageDialog(null,
                    "nombre: " + masgana.getNombre() + "\napellido: " + masgana.getApellido());
        } else {
            JOptionPane.showMessageDialog(null, "no hay desarrolladores registrados");
        }
    }

    // me ordena los nombres de genero femenino por orden alfabetico
    public void ordenar() {
        getListaPersonas().stream().filter(list -> list.getGenero().equalsIgnoreCase("f"))
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(list -> JOptionPane.showMessageDialog(null,
                        "personas ordenadas por el nombre: " + list.getNombre() + " " + list.getApellido() + "\n"));
    }

}
