package laboratorios;

public class Main {
    public static void main(String[] args) {

        SistemaLabScheduler sistema = new SistemaLabScheduler();

        // Crear laboratorio
        sistema.agregarLaboratorio(new Laboratorio("L1", "Lab Programacion", 2));

        // Crear usuarios
        Usuario u1 = new Usuario("1", "Juan", "Sistemas");
        Usuario u2 = new Usuario("2", "Ana", "Software");
        Usuario u3 = new Usuario("3", "Luis", "TI");

        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);

        // Mostrar labs
        sistema.mostrarLabs();

        // Reservas
        sistema.getLab(0).reservar(u1);
        sistema.getLab(0).reservar(u2);
        sistema.getLab(0).reservar(u3); // cola de espera

        // Cancelar reserva
        sistema.getLab(0).cancelar();
    }
}