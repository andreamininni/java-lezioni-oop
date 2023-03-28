## Ereditarietà
l'ereditarietà ci permetti di estendere una classe esistente con altri attributi e/o metodi ereditando quelli già esistenti.

ci permette di estendere logicamente un concetto, di specializzare qualcosa che esiste. aggiungere dettagli e funzionalità

## la nostra azienda
1. employer -> nome, id, stipendio
2. manager -> bonus


Employer
    - stampasalario

Manager extends Employer
    - stampasalario

manager = new Manager
manager.stampaSalario()

Design Pattern -> Singleton


Scuola
    Person
        - studenti
        - docenti

Azienda
    Employer -> descrizione generica -> astrazione
        - Developer
        - Manager
        - Freelancer
abstract -> la rendiamo non istanziabile -> non possiamo più fare new Employer()