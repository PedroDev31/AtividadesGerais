package Atividades;
import java.util.Scanner;

public class Opdev4{
    public static void main(String[]args){
        Scanner ler =new Scanner(System.in);
        int vet[]={5,6,4,2,3,9,8,1,10,11};
        int vetx[]= new int [10];
 
        System.out.println("\n Os valores do vetor A são: ");
        for(int i =0;i<vet.length;i++){
            System.out.printf("%n %d- %d",i+1,vet[i]);
            vetx[i]=(vet[i]*i);
        }
        System.out.println("\n Os novos vetores de B são: ");
        for(int i =0;i<vet.length;i++){
            System.out.printf("%n %d- %d",i+1,vetx[i]);
            
        }
        ler.close();
    }
}