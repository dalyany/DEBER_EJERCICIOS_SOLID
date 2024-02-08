package solid_dalinda;
import java.util.ArrayList;



class Hospital implements AgregadorPacientes {
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    // Método para agregar un paciente al hospital.
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // Método para listar todos los pacientes del hospital.
    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre: " + paciente.getNombre() + ", Edad: " + paciente.getEdad());
        }
    }
}