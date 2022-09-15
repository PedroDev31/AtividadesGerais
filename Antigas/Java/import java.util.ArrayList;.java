import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MyClass {
  public static void main(String[] args) {
     String[] disciplinas = {"matemática", "filosofia", "história", "física"};
     ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
     novaLista.add("geografia");
     novaLista.add("língua inglesa");
   
    Collections.sort(novaLista);
   
     for (String str: novaLista)
     {
           System.out.println(str);
     }
  }
}