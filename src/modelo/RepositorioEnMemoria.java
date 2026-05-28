package modelo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEnMemoria implements IRepositorioResultados {
    private List<String> historial;

    public RepositorioEnMemoria() {
        this.historial = new ArrayList<>();
    }

    @Override
    public void guardarResultado(String resultado) {
        this.historial.add(resultado);
    }

    @Override
    public List<String> obtenerHistorial() {
        return this.historial;
    }
}