package Simulado;
/*3. Faça um programa que preencha um vetor com 10 números reais, calcule e mostre a quantidade de números negativos e a soma dos números positivos desse vetor.*/
import java.util.Scanner;

public class atv3{
    public static void main(String[]args){
        Scanner X = new Scanner(System.in);
        int vet1 [] = new int[10];
        int a = 0, b = 0;
    
        for (int i = 0; i < vet1.length; i++){
            System.out.printf("%n Digite um numero:");
            vet1[i]=X.nextInt();

            if(vet1[i]>0){
                a=a+vet1[i];
            }
            else{
                b++;
            }
        }
        for (int i = 0; i < vet1.length; i++){    
            System.out.printf("%n %d ", vet1[i]);            
        }
        
        System.out.printf("%nAs somas dos valores positivos é de: %d",a);
        System.out.printf("%nSão %d valores negativos",b);
        X.close();
    
    }
}