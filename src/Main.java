//3 - ) Construa uma classe círculo que tenha atributos como raio e métodos para
//      calcular área e o perímetro.

import br.com.cubosacademy.listaexerciciospoo.terceiro.Circulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.5);
        System.out.println("Área do círculo: " + circulo.calculaAreaCirculo());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
    }
}