public class Moto extends Vehicle {
    String coloreSellino;
    boolean bauletto;

    public Moto(String name, String color, Engine engine, String coloreSellino, boolean bauletto) {
        super(name, color, engine);
        this.coloreSellino = coloreSellino;
        this.bauletto = bauletto;
    }

    public void start(){
        this.engine.on();
    }

    public void stop(){
        this.engine.off();
    }

    public void accelera(){
        this.engine.increaseSpeed();
    }

    public void decelera(){
        this.engine.decreaseSpeed();
    }

    public void impenna(){
        System.out.println("Impenno ma Mi dissocio");
    }
}
