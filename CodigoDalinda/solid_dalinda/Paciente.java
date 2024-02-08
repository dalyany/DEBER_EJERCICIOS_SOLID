
package solid_dalinda;

import java.util.ArrayList;
import java.util.Scanner;

// S - Responsabilidad simple (Single responsibility)
// Cada clase debe tener solo una razón para cambiar.

// Clase que representa a un paciente en el hospital.
class Paciente {
    private String nombre;
    private int edad;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
