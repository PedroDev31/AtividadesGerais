package Auladia_22.Polimorfismo;


class moradia{
    private String cidade;
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    private int AreaInterna;

    public int getAreaInterna() {
        return AreaInterna;
    }
    public void setAreaInterna(int areaInterna) {
        AreaInterna = areaInterna;
    }
    private int Logadouro;
    
    public int getLogadouro() {
        return Logadouro;
    }
    public void setLogadouro(int logadouro) {
        Logadouro = logadouro;
    }
    private int largura;


    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }

    


    public moradia(String cidade, int areaInterna, int logadouro,int largura) {
        this.cidade = cidade;
        AreaInterna = areaInterna;
        Logadouro = logadouro;
    }

    private void precovenda(int Areatotal){


    }
    private void registrarImovel(){} 


    
}

class apartamento extends moradia{ 
    
    private int condominio;

    public int getCondominio() {
        return condominio;
    }
    public void setCondominio(int condominio) {
        this.condominio = condominio;
    }

    private String Tipo_acabamento;
    public String getTipo_acabamento() {
        return Tipo_acabamento;
    }
    public void setTipo_acabamento(String tipo_acabamento) {
        Tipo_acabamento = tipo_acabamento;
    }

    public apartamento(String cidade, int areaInterna, int logadouro,int condominio,String Tipo_acabamento) {
        super(cidade, areaInterna, logadouro);

        this.Tipo_acabamento=Tipo_acabamento;
        this.condominio=condominio;
        
    }


     
}
class casa extends moradia{
    private int AreaExterna;
    
    public int getAreaExterna(){//get do tipo da variavel 
        return AreaExterna;
    } 
    public void setAreaExterna(int AreaExterna){//set do tipo void
        this.AreaExterna=AreaExterna;
    }

    public casa (String cidade, int areaInterna, int logadouro,int AreaExterna){//
        super(cidade, areaInterna, logadouro);
        this.AreaExterna=AreaExterna;

    }
}


public class Casa {
    public static void main(String args[]){

    }
}
