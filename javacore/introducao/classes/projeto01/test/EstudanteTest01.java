package academy.devdojo.maratonajava.javacore.introducao.classes.projeto01.test;
import academy.devdojo.maratonajava.javacore.introducao.classes.projeto01.dominio.Estudante;
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante=new Estudante();
        estudante.nome = "ZOR";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}