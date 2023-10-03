import javax.swing.JOptionPane;

import Animales.Prueba;
import Persona.Operaciones;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones;
        Prueba prueba = new Prueba();

        boolean salida = false;

        while (!salida) {
            try {
                int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "menu\n1.ingresar al menu de Animales\n2.ingresar al menu de personas\n3.salir"));
                switch (option) {

                    case 1:
                        try {
                            boolean salir = false;
                            while (!salir) {

                                int optionMA = Integer.parseInt(
                                        JOptionPane.showInputDialog(null,
                                                "1.ingresar animales\n2.imprimir animales\n3.salir"));

                                switch (optionMA) {
                                    case 1:
                                        prueba.crearAnimales();
                                        break;
                                    case 2:
                                        prueba.imprimirAnimales();
                                        break;
                                    case 3:
                                        salir = true;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "no es una opcion valida");
                                }
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ingrese la opcion correcto" + e);
                        }
                        break;
                    case 2:
                        operaciones = new Operaciones();
                        boolean salir = false;
                        while (!salir) {
                            int optionMP = Integer.parseInt(
                                    JOptionPane.showInputDialog(null,
                                            "1.agregar personas\n2.datos de las personas\n3.salir"));
                            switch (optionMP) {
                                case 1:
                                    operaciones.crearPersonas();
                                    break;
                                case 2:
                                    operaciones.numeroDePersonas();
                                    operaciones.calcularEdades();
                                    operaciones.mayoresDeEdad();
                                    operaciones.nombresConA();
                                    operaciones.apellidoConM();
                                    operaciones.sueldoDeOchoHoras();
                                    operaciones.desarrolladorfem();
                                    operaciones.masGana();
                                    operaciones.ordenar();
                                    break;
                                case 3:
                                    salir = true;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "no es una opcion valida");
                            }
                        }
                        break;
                    case 3:
                        salida = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "no es una opcion valida");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ingrese un numero :" + e);

            }

        }
    }

}

// import java.util.Map;
// import javax.swing.JOptionPane;
// import javax.swing.RowFilter.Entry;

// import java.util.ArrayList;
// import java.util.HashMap;

// public class Main {
// public static void main(String[] args) {
// ArrayList<Animal> terrestres = new ArrayList<>();
// ArrayList<Animal> acuaticos = new ArrayList<>();
// ArrayList<Animal> aereos = new ArrayList<>();
// boolean salida = false;
// String nombre = "";
// int optionTipo;
// String tipo = "";
// String genero = "";
// String masculino;
// String femenino;
// Animal animal = new Animal(nombre, tipo, genero);

// HashMap<String, ArrayList<Animal>> clasificacion = new HashMap<>();
// clasificacion.put("terrestre", terrestres);
// clasificacion.put("acuatico", acuaticos);
// clasificacion.put("aereo", aereos);

// while (!salida) {
// try {
// JOptionPane.showMessageDialog(null, "vienvenido al menu" + "\n" + "1.ingresar
// animal" + "\n"
// + "2.imprimir animales" + "\n" + "3.salir del menu");
// int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese una
// opcion"));
// switch (opcion) {
// case 1:

// nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del animal");
// optionTipo = Integer.parseInt(JOptionPane.showInputDialog(null,
// "ingrese el tipo de animal\n1.terrestre\n2.acuatico\n3.aereo"));
// if (optionTipo == 1) {
// tipo = "terrestre";
// genero = JOptionPane.showInputDialog(null,
// "ingrese el genero\nmasculino(m)\nfemenino(f)");
// animal = new Animal(nombre, tipo, genero);
// terrestres.add(animal);

// } else if (optionTipo == 2) {
// tipo = "acuatico";
// genero = JOptionPane.showInputDialog(null,
// "ingrese el genero\nmasculino(m)\nfemenino(f)");
// animal = new Animal(nombre, tipo, genero);
// acuaticos.add(animal);

// } else if (optionTipo == 3) {
// tipo = "aereo";
// genero = JOptionPane.showInputDialog(null,
// "ingrese el genero\nmasculino(m)\nfemenino(f)");
// animal = new Animal(nombre, tipo, genero);
// aereos.add(animal);

// } else {
// JOptionPane.showMessageDialog(null, "elija una opcion correcta");
// }

// break;
// case 2:
// for (Map.Entry<String, ArrayList<Animal>> ani : clasificacion.entrySet()) {
// String clave = ani.getKey();
// ArrayList<Animal> valor = ani.getValue();
// JOptionPane.showMessageDialog(null,
// "clave: " + clave);
// for (Animal anim : ani.getValue()) {
// JOptionPane.showMessageDialog(null, "tipo: " + anim.getTipo() + "\nnombre: "
// + anim.getNombre() + "\ngenero: " + anim.getGenero());
// }
// }
// break;
// case 3:

// salida = true;
// break;
// }
// } catch (NumberFormatException e) {
// JOptionPane.showMessageDialog(null, "ingrese un numero, no se aceptan letras:
// " + e);
// }
// }

// }
// }
