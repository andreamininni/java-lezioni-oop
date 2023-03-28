public class Jeeg {
    private Arm armDx;
    private Arm armSx;
    private Legs legs;
    public Jeeg(Arm armDx, Arm armSx, Legs legs){
        this.armDx = armDx;
        this.armSx = armSx;
        this.legs = legs;
    }

    //! attaccare e muoveri
    public void attacca(){
        this.armDx.attacca();
        this.armSx.attacca();
        this.armSx.attacca();
        this.armDx.attacca();
    }

    public void muovitiInAvanti(){
        this.legs.muovitiInAvanti();
    }

    public void muovitiIndietro(){
        this.legs.muovitiIndietro();
    }
}
