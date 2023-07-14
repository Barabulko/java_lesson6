import java.util.HashSet;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Toshiba", 2, 1024, "Win", "Black");
        Laptop l2 = new Laptop("Samsung", 3, 512, "Mac", "White");
        Laptop l3 = new Laptop("LG", 4, 256, "Linux", "Silver");
        Laptop l4 = new Laptop("DEXP", 6, 128, "Win", "Red");
        Laptop l5 = new Laptop("Lenovo", 8, 64, "Mac", "Blue");

        HashSet<Laptop> db = new HashSet<>();
        db.add(l1);
        db.add(l2);
        db.add(l3);
        db.add(l4);
        db.add(l5);

        getParameters(db);
    }

    public static void getParameters(HashSet<Laptop> db){
        System.out.println("filter type: 1 - HDD, 2 - RAM, 3 - OS, 4 - Color");
        Scanner scanner = new Scanner(System.in);
        Integer filter = scanner.nextInt();

        if (filter == 1) {
            System.out.println("Minimal value = ");
            Integer value = scanner.nextInt();
            for (Laptop item : db.stream().sorted(Laptop::compareByHDD).toList()) {
                if (item.HDD >= value) System.out.println(item);
            }
        }
        if (filter == 2) {
            System.out.println("Minimal value = ");
            Integer value = scanner.nextInt();
            for (Laptop item : db.stream().sorted(Laptop::compareByRAM).toList()) {
                if (item.RAM >= value) System.out.println(item);
            }
        }
        if (filter == 3) db.stream().sorted(Laptop::compareByOS).forEach(System.out::println);
        if (filter == 4) db.stream().sorted(Laptop::compareByColor).forEach(System.out::println);
    }
}