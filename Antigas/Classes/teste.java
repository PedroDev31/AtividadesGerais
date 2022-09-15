/*o número do produto (String),
a descrição do produto (String), a quantidade comprada de um item
(int) e o preço por item (double). 
 A classe deve ter um construtor e um
método get e set para cada variável de instância. Além disso, forneça
um método chamado getTotalFatura que calcula o valor da fatura e
depois retorna o valor como um double. // Se o valor for menor que
zero, ele deve ser configurado como 0. Se o preço por item for menor
que zero, ele deve ser configurado como 0.//*/


class Professor{
    protected int matricula;
    protected String nome;
    
    public Professor(){ }
    
    public Professor(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome; 
    }
    
    public int getMatricula(){
         return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula; 
    }
    public String getNome(){
        return nome; 
    }
                 
    public void setNome(String nome){
        this.nome = nome; 
    }
    public float getSalario(){
        return 0;
           
    }
}
    
    
class ProfessorDE extends Professor{
    private float salario;
       
    public ProfessorDE(){}
       
    public ProfessorDE(int matricula, String nome,float salario){
    super(matricula,nome);
    this.salario = salario; }
     
    public float getSalario(){
         return salario; 
    }
    public void setSalario(float salario){
         this.salario = salario; 
    }
}
    
    
class ProfessorHorista extends Professor{
    private float valorHora;
    private float numeroHoras;
    public ProfessorHorista() {}
       
     
    public ProfessorHorista(int matricula, String nome,float valorHora, float numeroHoras){ super(matricula,nome);
    this.valorHora = valorHora;
    this.numeroHoras = numeroHoras;
    }
     
    public float getValorHora(){ 
        return this.valorHora; 
    }
    public void setValorHora(float valorHora){ 
        this.valorHora = valorHora; 
    }
    
    public float getNumeroHoras(){
        return this.numeroHoras; 
    }
    public void setNumeroHoras(float numHoras){
        this.numeroHoras = numeroHoras; 
    }
     
    public float getSalario(){
    return this.valorHora * this.numeroHoras; 
    }
}
    
    
class ProfessorBolsista extends Professor{
    private float valorBolsa;
    public ProfessorBolsista() {}


    public ProfessorBolsista(int matricula, String nome,float valorBolsa){
    super(matricula,nome);
    this.valorBolsa = valorBolsa; }
    public float getValorBolsa(){ 
        return this.valorBolsa; 
    }
    public void setValorBolsa(float valorBolsa){ 
        this.valorBolsa = valorBolsa; 
    }
    public float getSalario(){ 
        return this.getValorBolsa(); 
    }
}

class ProfessorVoluntario extends Professor{
    public ProfessorVoluntario() {}
    public ProfessorVoluntario(int matricula, String nome){
        super(matricula,nome);
    }
}
    
    
    
public class teste {
    public static void main(String[] args) {
        ProfessorDE prof1 = new ProfessorDE();
        ProfessorHorista prof2 = new ProfessorHorista();
        ProfessorBolsista prof3 = new ProfessorBolsista();
        prof1.setMatricula(1);
        prof1.setNome("Alberto");
        prof1.setSalario(3000);
        prof2.setMatricula(2);
        prof2.setNome("Bianca");
        prof2.setValorHora(50);
        prof2.setNumeroHoras(20);
        prof3.setMatricula(3);
        prof3.setNome("Joana");
        prof3.setValorBolsa(100);
        
        System.out.println("Salario Prof 1 = "+prof1.getSalario());
        System.out.println("Salario Prof 2 = "+prof2.getSalario());
        System.out.println("Salario Prof 3 = "+prof3.getSalario()); 
    }
}
