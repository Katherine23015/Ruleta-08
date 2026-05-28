package controlador;

import modelo.IRepositorioResultados;
import java.util.List;

public class Estadistica {
    private IRepositorioResultados repositorio;

    public Estadistica(IRepositorioResultados repositorio) {
        this.repositorio = repositorio;
    }

    public void mostrarEstadisticas() {
        List<String> datos = repositorio.obtenerHistorial();
        System.out.println("\n=== ESTADÍSTICAS DEL HISTORIAL ===");
        if (datos.isEmpty()) {
            System.out.println("No hay juegos registrados.");
        } else {
            for (String registro : datos) {
                System.out.println("- " + registro);
            }
        }
    }
}
