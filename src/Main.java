import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        testDroid();
        testFactory();
    }

    public static void testDroid() {
        Droid d1 = new Droid("Alex");
        Droid d2 = new Droid("");
        Droid d3 = new Droid(null);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        for (int i = 0; i < 5; i++) {
            System.out.println(d1.performTask("running"));
        }
        System.out.println(d1.getBatteryLevel());
        System.out.println(d1.equals(d2));
    }

    public static void testFactory() {
        Factory f1 = new Factory("Apple");
        System.out.println(f1);
        for (int i = 0; i < 5; i++) {
            f1.createDroid("Pain");
        }

        System.out.println(Arrays.toString(f1.getDroids()));
        System.out.println(Arrays.toString(f1.getAllVersion()));
        System.out.println(f1.getDroidByVersion(4));
        System.out.println(f1);
    }
}