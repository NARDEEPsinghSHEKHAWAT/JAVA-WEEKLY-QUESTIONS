import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String medicine1 = scanner.nextLine();
        String medicine2 = scanner.nextLine();
        String medicine3 = scanner.nextLine();
        List<String> medicines = new ArrayList<>();
        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);
                Collections.sort(medicines, (a, b) -> a.compareToIgnoreCase(b));
            for (String medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
