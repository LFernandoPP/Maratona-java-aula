package academy.devdojo.maratonajava.introducao.projeto04;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 10;
        // char, int, byte, shor, enum, String

        switch (dia) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
        String sexo = "F";
        switch (sexo){
            default:
                System.out.println("Inválido");
                break;
            case "M":
                System.out.println("Homem");
                break;
            case "F": {
                System.out.println("Mulher");
                break;
            }
        }
    }
}