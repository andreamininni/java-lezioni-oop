## interfacce
- La massima espressione dell'astrazione

in Jeeg quali sono gli oggetti che possno attaccare ?
Tutti quelli che estendono Arm

Legs non possono attaccare
Tank -> può attaccare? SI
NON PUo estendere Arm -< non può ereditare la funzione attacca

Interfaccia
- una classe che dichiara dei metodi
public interface canattack {
    public void attack();
}

Legs implements canattack {

}


Player
    - spostarsi all'interno della mappa
Enemy
    - spostarsi all'interno della mappa