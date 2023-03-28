abstract public class Employer {
    //! devo dichiarare metodi e attributi comuni
    //! name, code, salary
    String name;
    String code;
    int salary;
    public Employer(String name, String code, int salary) {
        this.name = name;
        this.code = code;
        this.salary = salary;
    }

    //* IN GENERALE tutti i dipendenti possono presentarsi però ognuno lo farà a modo suo */
    // ! scrivere il codice della funzione
    abstract public String stampaSalario();
}
