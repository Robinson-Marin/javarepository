package Animales;

//en esta clase se crean los metodos correspondientes a la clase Animal
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.Entry;

import java.util.ArrayList;
import java.util.HashMap;

//creo arrrays que me serviran 
//para ingresarlos como valores al HashMap
public class Prueba {
    ArrayList<Animal> terrestres = new ArrayList<>();
    ArrayList<Animal> acuaticos = new ArrayList<>();
    ArrayList<Animal> aereos = new ArrayList<>();
    boolean salida = false;
    String nombre = "";
    int optionTipo;
    String tipo = "";
    String genero = "";
    String masculino;
    String femenino;
    Animal animal = new Animal(nombre, tipo, genero);

    HashMap<String, ArrayList<Animal>> clasificacion = new HashMap<>();

    // en el contructor ingreso claves y valores al HasMap
    public Prueba() {
        clasificacion.put("terrestre", terrestres);
        clasificacion.put("acuatico", acuaticos);
        clasificacion.put("aereo", aereos);
    }

    // metodo para agragar animales a los array que me sirven como valor
    // en el hasMap
    public void crearAnimales() {
        nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del animal");
        optionTipo = Integer.parseInt(JOptionPane.showInputDialog(null,
                "ingrese el tipo de animal\n1.terrestre\n2.acuatico\n3.aereo"));
        if (optionTipo == 1) {
            tipo = "terrestre";
            genero = JOptionPane.showInputDialog(null,
                    "ingrese el genero\nmasculino(m)\nfemenino(f)");
            animal = new Animal(nombre, tipo, genero);
            terrestres.add(animal);

        } else if (optionTipo == 2) {
            tipo = "acuatico";
            genero = JOptionPane.showInputDialog(null,
                    "ingrese el genero\nmasculino(m)\nfemenino(f)");
            animal = new Animal(nombre, tipo, genero);
            acuaticos.add(animal);

        } else if (optionTipo == 3) {
            tipo = "aereo";
            genero = JOptionPane.showInputDialog(null,
                    "ingrese el genero\nmasculino(m)\nfemenino(f)");
            animal = new Animal(nombre, tipo, genero);
            aereos.add(animal);

        } else {
            JOptionPane.showMessageDialog(null, "elija una opcion correcta");
        }
    }

    // metodo para imprimir los animales registrados en el HasMap
    public void imprimirAnimales() {
        for (Map.Entry<String, ArrayList<Animal>> ani : clasificacion.entrySet()) {
            String clave = ani.getKey();
            JOptionPane.showMessageDialog(null,
                    "clave: " + clave);
            for (Animal anim : ani.getValue()) {
                JOptionPane.showMessageDialog(null, "tipo: " + anim.getTipo() + "\nnombre: "
                        + anim.getNombre() + "\ngenero: " + anim.getGenero());
            }
        }
    }

}
