
package listadecontatos;

public class contatos {
    private String nome;
    private String numero;
    private String cep;
    
    contatos(String nome,String numero,String cep){
        criarContato(nome,numero,cep);
        
    }
    boolean cepValido(String cep){
       byte n =0;
        for(int x=0;x<cep.length();++x){
            n++;
        }
        if(n==8){
            return false;
        }   
        System.out.println("Cep invalido.");
        return true;
    }
     
    public String nome(){
        String nome = this.nome;
        return nome ;
    }
     public String numero(){
        String numero = this.numero;
        return numero ;
    } public String cep(){
        String cpe = this.cep;
        return cep ;
    }

    private void criarContato(String nome, String numero, String cep) {
       this.nome = nome;
       this.numero = numero;
       if(!cepValido(cep)){
           this.cep=cep;
       }
    }
    
    public String toString(){
        String contato1="";
        
        contato1 = "Nome:" + nome();
        contato1 = contato1 +"\n"+ "Numero:"+ numero();
        contato1 = contato1 +"\n"+"Cep:"+cep();
        
        
        return contato1;
    }
}
