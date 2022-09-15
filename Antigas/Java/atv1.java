
/*Escreva um programa Java que imprima na saída padrão as suas informações
pessoais. O formato de entrada e saída do programa deve ser o seguinte: */


import java.util.Arrays;
import java.util.List;


public class atv1 {

    public static void main(String args[]){

        List<String> arrayl = Arrays.asList("Nome:\t Pedro Miguel Teixeira Jordão","Data de nascimento: \t 23/12/2003", "Naturalidade: \tBrasileiro","Nacionalidade: \t Brasileiro", "Matricula:\t 0000729352" );
        arrayl.forEach(System.out::println);
        
    }
}
