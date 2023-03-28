public class Tank extends Moveable implements CanAttack{

    @Override
    public void muovitiInAvanti() {
        System.out.println("Mi muovo in avanti con i cingoli");
    }

    @Override
    public void muovitiIndietro() {
        System.out.println("Mi muovo indietro con i cingoli");
    }

    public void attacca(){
        System.out.println("Ti sparo con il tank");
    }

}
