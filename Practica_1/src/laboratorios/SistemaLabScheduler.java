package laboratorios;

import java.util.ArrayList;

public class SistemaLabScheduler {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Laboratorio> labs;

    public SistemaLabScheduler() {
        usuarios = new ArrayList<>();
        labs = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u) {
        for (Usuario us : usuarios) {
            if (us.getId().equals(u.getId())) {
                System.out.println("Usuario duplicado");
                return;
            }
        }
        usuarios.add(u);
    }

    public void agregarLaboratorio(Laboratorio l) {
        labs.add(l);
    }

    public Usuario buscarUsuario(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public Laboratorio getLab(int i) {
        return labs.get(i);
    }

    public void mostrarLabs() {
        for (Laboratorio l : labs) {
            System.out.println(l);
        }
    }
}