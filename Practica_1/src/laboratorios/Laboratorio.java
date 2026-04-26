package laboratorios;

import java.util.ArrayList;

public class Laboratorio {
    private String id;
    private String nombre;
    private int capacidad;
    private int ocupados;

    private ArrayList<Usuario> colaEspera;

    public Laboratorio(String id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ocupados = 0;
        this.colaEspera = new ArrayList<>();
    }

    public boolean hayEspacio() {
        return ocupados < capacidad;
    }

    public void reservar(Usuario u) {
        if (hayEspacio()) {
            ocupados++;
            System.out.println("Reserva confirmada para " + u.getNombre());
        } else {
            colaEspera.add(u);
            System.out.println("Laboratorio lleno. En cola de espera.");
        }
    }

    public void cancelar() {
        if (ocupados > 0) {
            ocupados--;
            System.out.println("Reserva cancelada.");

            if (!colaEspera.isEmpty()) {
                Usuario siguiente = colaEspera.remove(0);
                ocupados++;
                System.out.println("Nuevo usuario asignado: " + siguiente.getNombre());
            }
        }
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " - " + nombre + " | Capacidad: " + capacidad + " | Ocupados: " + ocupados;
    }
}