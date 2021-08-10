package academy.devdojo.maratonajava.javacore.introducao.classes.projeto01.test;
import academy.devdojo.maratonajava.javacore.introducao.classes.projeto01.dominio.Estudante;
public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Sonja";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println("____________________");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}