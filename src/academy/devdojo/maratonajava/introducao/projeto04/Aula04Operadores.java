package academy.devdojo.maratonajava.introducao.projeto04;
public class Aula04Operadores {
    public static void main(String[] args){
        int numero01 = 10;
        //int numero02 = 20;
        double numero02 = 20;
        //double resultado = numero01 / (double) numero02;
        double resultado = numero01 / numero02;
        //System.out.println(numero02+numero01+"sas"+numero02+numero01);
        System.out.println(resultado);
        int resto = 21 % 7;
        System.out.println(resto);
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
        //&&(AND) ||(OR) !
        int idade = 29;
        float salario = 3500f;
        boolean isDentrodaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentrodaLeiMaiorQueTrinta "+isDentrodaLeiMaiorQueTrinta);
        System.out.println("isDentrodaLeiMenorQueTrinta "+isDentrodaLeiMenorQueTrinta);
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
    }
}
