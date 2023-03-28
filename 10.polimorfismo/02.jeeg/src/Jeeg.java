public class Jeeg {
    private Arm armDx;
    private Arm armSx;
    private Moveable moveable;
    public Jeeg(Arm armDx, Arm armSx, Moveable moveable){
        this.armDx = armDx;
        this.armSx = armSx;
        this.moveable = moveable;
    }

    //! attaccare e muoveri
    public void attacca(){
        this.armDx.attacca();
        this.armSx.attacca();
        this.armSx.attacca();
        this.armDx.attacca();
        // this.moveable.attacca();
        Class<? extends Object> classe = moveable.getClass();
        if(classe.toString().equals("class Tank")){
            //! fino a questo punto, anche se io passo un tank, ho comunque un oggetto di classe Moveable e Moveable non implementa attacca()
            //! Quindi, se sono arrivato SO SICURAMENTE che in this.moveable c'è un Tank
            //! QUINI POSSO CASTARLO IN UN TANK
            Tank t = (Tank) this.moveable;
            t.attacca();
        }
    }

    public void muovitiInAvanti(){
        this.moveable.muovitiInAvanti();
    }

    public void muovitiIndietro(){
        this.moveable.muovitiIndietro();
    }
}
