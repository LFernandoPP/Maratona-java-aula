package academy.devdojo.maratonajava.introducao.projeto06;
public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
    int valorMax = 50;
        for (int i = 1; i <= valorMax; i++) {
            if (i>25){
                break;
            }
            System.out.println(i);
        }
    }
}