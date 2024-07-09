package br.com.cubosacademy.listaexerciciospoo.terceiro;

public class Circulo {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public double calculaAreaCirculo () {
        return Math.pow((this.raio * 3.1415), 2);
    }

    public double calcularPerimetro () {
        return (2 * 3.1415 * this.raio);
    }
}
