import java.util.Scanner;

public class Solution {
    private int id;
    private String name;
    private String designation;
    private int salary;

    public Solution(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = 20000;
    }

    public void checkEligibility() {
        if (id > 201) {
            salary += 1000;
            System.out.println(name + "," + id + "," + salary);
        } else {
            System.out.println("No Appraisal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline character
        String name = sc.nextLine();
        String designation = sc.nextLine();

        Solution employee = new Solution(id, name, designation);
        employee.checkEligibility();
    }
}
