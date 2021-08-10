package academy.devdojo.maratonajava.javacore.introducao.metodos.projeto01.test;
import academy.devdojo.maratonajava.javacore.introducao.metodos.projeto01.dominio.Calculadora;
public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,2));
    }
}