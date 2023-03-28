// import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        Marketing dipendente1 = new Marketing("Pippo", "CBJF567", 1500);
        Manager manager1 = new Manager("Pippo", "CBJF567", 1500, 200);
        // System.out.println(manager1.stampaSalario());
        Freelancer freelancer1 = new Freelancer(
            "Ciccio",
            "JHSJHD",
            500,
            new String[] {"ESA", "Nike", "Tesla"},
            400
        );

        System.out.println(freelancer1.stampaSalario());
    }
}
