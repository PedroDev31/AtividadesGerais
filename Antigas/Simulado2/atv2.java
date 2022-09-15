package Simulado2;
/*2. 2.	Crie um programa que peça ao usuário para digitar 2 strings e depois coloque  todos os caracteres da primeira string em maiúsculas e da segunda string em minúsculas
*/
import java.util.Scanner;

public class atv2{
    public static void main(String[]args){
        Scanner ler =new Scanner(System.in);

        String v1,v2;

        System.out.println("Digite a primeira palavra(minuscula): ");
        v1=ler.nextLine();

        System.out.println("Digite a segundo palavra (Maiúscula): ");
        v2=ler.nextLine();
        for(int i=0;i<10000;i++){
            
        
       String resultado = v1.toUpperCase ( ); 
       System.out.println(resultado);
       String resultado2 = v2.toLowerCase(); 
       System.out.println(resultado2);

        }

        ler.close();
    
    }
}