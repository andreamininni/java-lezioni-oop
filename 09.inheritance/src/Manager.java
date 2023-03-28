public class Manager extends Employer {
    //! devo dettagliare gli attributi che differenziano il Manager dall Employer
    int bonus;

    public Manager(String name, String code, int salary, int bonus) {
        //! tramite la funzione super() richiamo il costruttore della classe genitore
        super(name, code, salary);
        this.bonus = bonus;
    }

    @Override
    public String stampaSalario(){
        return "Il mio sipendio è "+ this.salary +  " con un bonus di " + this.bonus;
    }


}
