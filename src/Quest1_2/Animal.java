package Quest1_2;

public class Animal {
    
    private String Nome;
    
    public Animal(String n){
    
        this.setNome(n);
    }
    public String getNome(){
    
        return this.Nome;
    }
    public void setNome(String n){
    
        this.Nome = n;
    }
     public void imprime(){
     
         System.out.println(this.getNome());
     }
     public void talk(){
     
     }
}
