package Quest1_2;

public class Vaca extends Mamifero{
    
    private boolean TemLeite;
    
    public Vaca(String n, int p, boolean TL){
    
        super(n, p);
        this.setTemLeite(TL);
    }

    public boolean getTemLeite() {
        return this.TemLeite;
    }

    public void setTemLeite(boolean TL) {
        this.TemLeite = TL;
    }
    public void talk(){
    
        System.out.println("Muuu");
    }
}
