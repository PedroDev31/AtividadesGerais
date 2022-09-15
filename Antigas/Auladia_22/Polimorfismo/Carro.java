package Auladia_22.Polimorfismo;
/*definir uma classe carr com os atributos : placa, ano de fabricação. 
Essa classe deve conter o metodo para calcular o imposto
cadastrar 5 carros, calcular e mostrar 
O imposto a ser oagi por cada carro, sabendo que o calculo é realizado assim:
No ano de fabricação o carro paga 500R$ de imposto. A cada ani de uso o imposto
é reduzidoem 100R$, porem o valor minimo a ser pago pelo carro é de 100R$ até 
o carro atingir o 10° ano de uso e então ele nao precisará mais pagar o imposto

Para o calculo de imposto o usuário deverá informar o ano atual

Mostrar i total dos impostos, a soma de todos os carros 
mostrar a quantidade de carros com o imposto igual a 0 */


class Carro {
    private int Data_fab;
    private int num_placa;
    private float imposto;

  
   
   
    /*Getter and setters */
    public int getData_fab() {
        return Data_fab;
    }
    public void setData_fab(int data_fab) {
        Data_fab = data_fab;
    }
    public int getnum_placa(){
        return num_placa;
    }
    public void setnum_placa(int num_placa){
        num_placa= num_placa;
    }
    public float getImposto() {
        return imposto;
    }
    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    public int getAno_fab() {
        return ano_fab;
    }
    public void setAno_fab(int ano_fab) {
        this.ano_fab = ano_fab;
    }
    
    /*constructor */
    public Carro(int data_fab, int num_placa, float imposto, int ano_fab) {
        Data_fab = data_fab;
        this.num_placa = num_placa;
        this.imposto = ano_fab;
        this.ano_fab = ano_fab;
    }
    
}
