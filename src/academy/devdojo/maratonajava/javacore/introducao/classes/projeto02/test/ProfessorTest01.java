package academy.devdojo.maratonajava.javacore.introducao.classes.projeto01.test;
import academy.devdojo.maratonajava.javacore.introducao.classes.projeto01.dominio.Professor;
public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor=new Professor();
        professor.idade = 213;
        professor.sexo = 'F';
        System.out.println(professor.nome+" [] "+professor.idade+" [] "+professor.sexo);
        System.out.println(professor);
    }
}