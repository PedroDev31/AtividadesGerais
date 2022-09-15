package Simulado;
/*2. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.*/
import java.util.Scanner;

public class atv2{
    public static void main(String[]args){
        Scanner X = new Scanner(System.in);

        int vet1[] = new int[10];
        int a = 0,b=0;
       
        for (int i = 0; i < vet1.length; i++){
           System.out.printf("%n Digite um numero:");
            vet1[i]=X.nextInt();
        }
        for (int i = 0; i < vet1.length; i++){
            
            
            System.out.printf("%n %d ", vet1[i]);

            if (vet1[i]%2==0){
            //System.out.printf(" \t O numero %d é par",vet1[i]);
            a++;
            }
            else{b++;
            }
            
            
         }
         System.out.printf("%nSão %d valores pares",a);
         System.out.printf("%nSão %d valores ímpares",b);
        X.close();
    
    }
}