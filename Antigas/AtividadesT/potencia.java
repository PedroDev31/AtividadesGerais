package AtividadesT.java;
import java.util.Scanner;
class Pot {
    double b;
    int e;
    double val;
    
    Pot (double base, int exp){
    b = base;
    e = exp;
   
    val = 1;
    if (exp == 0) return;
    for (; exp>0; exp --)  {
        val = val * base;
    }
}
   double potencia (){
       return val;
   } 
}



public class potencia{
    public static void main(String[]args){
        /*A função break faz com que o código pare sua execução ate que saia das chaves, por exemplo */
        Scanner ler =new Scanner(System.in);


        Pot x= new Pot(4,2);

        System.out.println(x.potencia());
        
    ler.close();
    }
    
}