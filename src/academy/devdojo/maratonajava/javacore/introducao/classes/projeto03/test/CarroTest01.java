package academy.devdojo.maratonajava.javacore.introducao.classes.projeto03.test;
import academy.devdojo.maratonajava.javacore.introducao.classes.projeto03.dominio.Carro;
public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome="Fusca Bala";
        carro1.ano=1969;
        carro1.modelo="Sport";
        carro2.nome="Mufa";
        carro2.ano=1968;
        carro2.modelo="GA 0";
        System.out.println("\nCarro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}