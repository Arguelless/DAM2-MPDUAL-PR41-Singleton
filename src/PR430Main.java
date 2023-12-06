public class PR430Main {
    public static void main(String[] args) {
        PR430Objecte objecte = PR430Objecte.getInstance("Joan", "Perez", 20);
        System.out.println(objecte);
        
        PR430Objecte objecte2 = PR430Objecte.getInstance("Maria", "Garcia", 30);
        System.out.println(objecte2);

        PR430Objecte objecte3 = PR430Objecte.getInstance("Pere", "Martinez", 40);
        System.out.println(objecte3);


    }
}
