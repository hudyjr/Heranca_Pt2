package Quest1_2;

public class TestaAnimais {
    
    public static void main(String args []){
    
        Papagaio p1 = new Papagaio("PAPAGAIO", true, "Salve os animais");
        System.out.println(p1);
        p1.talk();
        
        
        
        Arara a1 = new Arara("ARARA", true);
        a1.talk();
        
        Cachorro c1 = new Cachorro("CAO", 4, true); 
        c1.talk();
        
        Vaca v1 = new Vaca("Mimosa", 4, true);
        v1.talk();
    }
}
