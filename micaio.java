
package listadecontatos;
import java.util.Scanner;
import java.util.ArrayList;
public class micaio {
    public static void main(String[] args){
       ArrayList <String> nome =new ArrayList<String>();
       ArrayList <String> fim =new ArrayList<String>();
       byte y =1;
       nome = criar(y);
        
        //System.out.println(nome.get(0));
        contatos contato =new contatos(nome.get(0),nome.get(1),nome.get(2));   
        fim.add(contato.toString());
        y=2;
        nome = criar(y);
        contatos contato2 =new contatos(nome.get(0),nome.get(1),nome.get(2));  
        fim.add(contato2.toString());
        y=3;
        nome =criar(y);
        contatos contato3 =new contatos(nome.get(0),nome.get(1),nome.get(2));  
        fim.add(contato3.toString());
      
        for(int x=0;x<fim.size();x++){
            System.out.println("\n"+fim.get(x));
            
        }
        
        
        
    }
    
    
    
    

public static ArrayList<String> criar(byte y){
 ArrayList <String> nome = new ArrayList<String>();
 Scanner input=new Scanner(System.in);
 
    System.out.println("Informe o nome do "+ y + "º contato.");
    nome.add(input.nextLine()); 
    System.out.println("Informe o numero do " +y+ "º contato");
    nome.add(input.nextLine());
    System.out.println("Informe o cep do "+y+ "ºcontato.");
    nome.add(input.nextLine());
return nome;
}
}