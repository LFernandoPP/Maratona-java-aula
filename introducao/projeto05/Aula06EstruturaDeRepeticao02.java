package academy.devdojo.maratonajava.introducao.projeto05;
public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        for (int i=1;i<=1000000;i++)
           if (i%2==0){
               System.out.println(i+" Par");
           }else{
               System.out.println(i+" Impar");
           }
    }
}