package controlador;

import modelo.IRepositorioResultados;

public class Ruleta {
    private IRepositorioResultados repositorio;

    public Ruleta(IRepositorioResultados repositorio) {
        this.repositorio = repositorio;
    }

    public void jugar() {
        int numeroObtenido = (int) (Math.random() * 37);
        String color = (numeroObtenido % 2 == 0) ? "Rojo" : "Negro";
        if (numeroObtenido == 0) color = "Verde";

        String resultadoGiro = "Número: " + numeroObtenido + ", Color: " + color;
        System.out.println("Se giró la ruleta: " + resultadoGiro);
        repositorio.guardarResultado(resultadoGiro);
    }
}
