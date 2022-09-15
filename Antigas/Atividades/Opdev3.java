package Atividades;
import java.util.Scanner;

public class Opdev3{
    public static void main(String[]args){
        Scanner ler =new Scanner(System.in);
        int vet[]=new int [15];
        int vetx[]= new int [15];

        System.out.println("\n Digite os valores o vetor A: ");
        for(int i =0;i<vet.length;i++){
            System.out.printf("%n %d- %d",i+1,vet[i]);
            vet[i]=ler.nextInt();
            vetx[i]=(vet[i]*vet[i]);
        }
        System.out.println("\n Os novos vetores de B são: ");
        for(int i =0;i<vet.length;i++){
            System.out.printf("%n %d- %d",i+1,vetx[i]);
            
        }
        ler.close();
    }
}