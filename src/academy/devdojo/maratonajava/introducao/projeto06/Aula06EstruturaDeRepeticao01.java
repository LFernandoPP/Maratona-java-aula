package academy.devdojo.maratonajava.introducao.projeto06;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args){
        int count = 0;
        while (count < 10){
            System.out.println(++count);
            //++count executa antes do print
            //count++ executa depois
        }
        count = 0;
        do {
            System.out.println("dentro do do-while "+ ++count);
        } while (count < 10);
        for (int i=0;i<10;i++){
            System.out.println("For "+i);
        }
    }
}
