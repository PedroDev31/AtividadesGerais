package Simulado;
/*. Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A espaçando um do outro.
*/
import java.util.Scanner;

public class atv1{
    public static void main(String[]args){
        Scanner X = new Scanner(System.in);
        int vet1 [] = {1, 0, 5, -2, 5, 7};
        int a;
        a=vet1[0]+vet1[1]+vet1[5];


        System.out.printf("a soma das posições 0,1 e 5 é de: %d ",a);
        vet1[4]=100;
        System.out.println("Os valores são: ");
        for(int i=0;i<vet1.length;i++){
            System.out.printf("\t %d \t ", vet1[i]);
        } 

        X.close();
    
    }
}