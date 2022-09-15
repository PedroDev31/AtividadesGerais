package Atividades;
import java.util.Scanner;

public class Opdev2{
    public static void main(String[]args){
        Scanner ler =new Scanner(System.in);
        int vet[]={5,6,4,2,3,9,8,1};
        int vetx[]= new int [8];

        System.out.println("\n Os valores do vetor A são: ");
        for(int i =0;i<vet.length;i++){
            System.out.printf("%n %d- %d",i+1,vet[i]);
            vetx[i]=(vet[i]*2);
        }
        System.out.println("\n Os novos vetores de B são: ");
        for(int i =0;i<vet.length;i++){
            System.out.printf("%n %d- %d",i+1,vetx[i]);
            
        }
        ler.close();
    }
}