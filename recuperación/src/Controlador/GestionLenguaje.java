package Controlador;

import Modelo.LenguajeProgramacion;
import java.util.ArrayList;

public class GestionLenguaje {
    private ArrayList<LenguajeProgramacion> lenguajes;

    public GestionLenguaje() {
        this.lenguajes = new ArrayList<>();
    }

    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        lenguajes.add(new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion));
    }

    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (LenguajeProgramacion lenguaje : lenguajes) {
            if (lenguaje.getNombre().equalsIgnoreCase(nombre)) {
                return lenguaje;
            }
        }
        return null;
    }

    public boolean eliminarLenguaje(String nombre) {
        return lenguajes.removeIf(lenguaje -> lenguaje.getNombre().equalsIgnoreCase(nombre));
    }

    public void imprimirLenguajes() {
        if (lenguajes.isEmpty()) {
            System.out.println("No hay lenguajes registrados.");
        } else {
            for (LenguajeProgramacion lenguaje : lenguajes) {
                System.out.println(lenguaje);
            }
        }
    }
}
