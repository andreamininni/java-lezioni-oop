public class App {
    public static void main(String[] args) throws Exception {

        Arm armDx = new Laser("Destro");
        Arm armSx = new LanciaMissili("Sinistro");
        Moveable legs = new Tank();

        Jeeg jeeg = new Jeeg(armDx, armSx, legs);

        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();

    }
}
