package Atividades;
import java.util.Scanner;

public class Opdev{
    public static void main(String[]args){
        Scanner ler= new Scanner(System.in);
        int A[]=new int [5];
        int B[]=new int [5];


        for(int i=0;i<A.length;i++){
            System.out.printf("Insira o %d valor %n",i+1);
            A[i]=ler.nextInt();
            B[i]=A[i];

        }
        for(int i=0;i<A.length;i++){
            System.out.println("\n");
            System.out.println(B[i]);
        }
        ler.close();
    }
}