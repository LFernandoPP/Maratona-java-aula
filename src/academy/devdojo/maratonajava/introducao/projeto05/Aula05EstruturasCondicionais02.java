package academy.devdojo.maratonajava.introducao.projeto05;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 12;
        String categoria;

        if(idade<15){
            categoria = ("Categoria Infantil");
        }else if(idade >= 15 && idade < 18){
            categoria = ("Categoria Juvenil");
        } else {
            categoria = ("Categoria Adulto");
        }
        System.out.println(categoria);
    }
}
