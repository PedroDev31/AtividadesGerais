package Simulado2;
/*. 1.	Crie um programa que peça ao usuário para digitar 2 strings e depois compare se as strings são iguais.
*/
import java.util.Scanner;

public class atv1{
    public static void main(String[]args){
        Scanner ler =new Scanner(System.in);

        String v1,v2;

        System.out.println("Digite o primeiro nome: ");

        v1=ler.nextLine();
        System.out.println("Digite o segundo nome: ");

        v2=ler.nextLine();
        
        if(v1.equals(v2)){
            
        System.out.printf("os nomes %s e %s são guais", v1,v2);

        }
        else{
            
        System.out.printf("os nomes %s e %s não são guais", v1,v2);

        }
        ler.close();
    
    }
}