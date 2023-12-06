import java.lang.reflect.Constructor;

public class PR431Main {
    public static void main(String[] args) {
        PR431Objecte objecte = PR431Objecte.getInstance("Joan", "Perez", 20);
        System.out.println(objecte);

        PR431Objecte objecte2 = getNewDestroyedInstance("Maria", "Garcia", 30);
        System.out.println(objecte2);

        PR431Objecte objecte3 = getNewDestroyedInstance("Pere", "Martinez", 40);
        System.out.println(objecte3);

    }

    static PR431Objecte getNewDestroyedInstance(String nom, String cognom, int edat) {

        PR431Objecte result = null;
        try {
            Thread.sleep(3000);

            Constructor<?>[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                result = (PR431Objecte) constructor.newInstance(nom, cognom, edat);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
