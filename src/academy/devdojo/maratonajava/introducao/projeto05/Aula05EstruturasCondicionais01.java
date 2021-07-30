package academy.devdojo.maratonajava.introducao.projeto05;
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutirzadoComprarBebida = idade >= 18;
        if (isAutirzadoComprarBebida == false) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }
        if (!isAutirzadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }
        System.out.println("Fora do if");
        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}