import modelo.*;
import controlador.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- PRUEBA 1: GUARDANDO EN MEMORIA RAM ---");
        IRepositorioResultados repoMemoria = new RepositorioEnMemoria();
        Ruleta ruletaConMemoria = new Ruleta(repoMemoria);

        ruletaConMemoria.jugar();
        ruletaConMemoria.jugar();

        Estadistica estadisticaMemoria = new Estadistica(repoMemoria);
        estadisticaMemoria.mostrarEstadisticas();

        System.out.println("\n--- PRUEBA 2: GUARDANDO EN ARCHIVO FISICO (CSV) ---");
        IRepositorioResultados repoArchivo = new RepositorioArchivo();
        Ruleta ruletaConArchivo = new Ruleta(repoArchivo);

        ruletaConArchivo.jugar();
        ruletaConArchivo.jugar();

        Estadistica estadisticaArchivo = new Estadistica(repoArchivo);
        estadisticaArchivo.mostrarEstadisticas();
    }
}