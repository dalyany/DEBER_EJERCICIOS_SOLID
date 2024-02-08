
package solid_dalinda;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        // L - Sustitución Liskov (Liskov substitution)
        // Los objetos de una clase base deben poder ser reemplazados por objetos de una clase derivada sin afectar el comportamiento del programa.
        // En este caso, la clase `Hospital` implementa la interfaz `AgregadorPacientes`, lo que permite que pueda ser reemplazada por cualquier otra implementación de `AgregadorPacientes` sin cambiar el comportamiento del código.

        // D - Inversión de dependencias (Dependency inversion)
        // Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.
        // En este caso, el método `main` depende de la interfaz `AgregadorPacientes`, que es una abstracción que permite agregar pacientes al hospital. Esto permite que el código sea más flexible y no esté acoplado a una implementación concreta de `Hospital`.

        // Creamos una instancia del hospital.
        AgregadorPacientes hospital = new Hospital();

        // Pedimos al usuario que ingrese la información del paciente y lo agregamos al hospital.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del paciente:");
        int edad = scanner.nextInt();
        Paciente paciente = new Paciente(nombre, edad);
        hospital.agregarPaciente(paciente);

        // Listamos todos los pacientes en el hospital.
        System.out.println("Pacientes en el hospital:");
        ((Hospital) hospital).listarPacientes(); // Realizamos un casting para acceder al método listarPacientes().
    }
    
}
