package academy.devdojo.maratonajava.javacore.introducao.metodos.projeto01.test;
import academy.devdojo.maratonajava.javacore.introducao.metodos.projeto01.dominio.Calculadora;
public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}