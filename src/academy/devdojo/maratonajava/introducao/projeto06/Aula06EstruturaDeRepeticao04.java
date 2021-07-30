package academy.devdojo.maratonajava.introducao.projeto06;
public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
       double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
    double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
                // }else{
                //      break;
            }
            System.out.println("Parcela "+parcela+"x R$"+valorParcela);
        }
        /*
        int valorTotal=52000;
        int valorParcela=2000;
        if(valorParcela>=1000){
            System.out.println("Parcela de "+ valorTotal/valorParcela +"x");
        } else {
            System.out.println("Não é possivel parcelar");
        }*/
    }
}