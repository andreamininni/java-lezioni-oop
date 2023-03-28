public class App {
    public static void main(String[] args) throws Exception {


        //! UPCASTING -> POSSO ASSEGNARE AD UNA VARIABILE DI UN TIPO, UN OGGETTO DI UNA CLASSE CHE ESTENDE QUEL TIPO
        //! HO DICHIARATO UNA VARIABILE DI CLASSE ARM A CUI HO ASSEGNATO UN OGGETTO DI CLASSE LASER -> CHE ESTENDE ARM
        Arm armDx = new Laser("Destro");
        Arm armSx = new LanciaMissili("Sinistro");
        //! perché Trivella estende Arm
        Legs legs = new Legs();

        Jeeg jeeg = new Jeeg(armDx, armSx, legs);

        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();

        Jeeg jeeg2 = new Jeeg(new Trivella("Destro"), new Laser("Sinistro"), new Legs());
        jeeg2.muovitiInAvanti();
        jeeg2.attacca();
        jeeg2.muovitiIndietro();
    }
}
