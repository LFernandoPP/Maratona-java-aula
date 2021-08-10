package academy.devdojo.maratonajava.introducao.projeto04;
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
        //String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        //String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condicao) ? verdadeiro : falso;

        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        /* String resultado;
        if(salario>5000){
            resultado=mensagemDoar;
        }else{
            resultado=mensagemNaoDoar;
        }  */
        //System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);
        //System.out.println(resultado);
    }
}