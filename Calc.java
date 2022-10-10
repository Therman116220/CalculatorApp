import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Calculator App\n Please choose from the options below:\n + Add +\n - Subtract -\n * Multiply *\n / Divide /");
        int userPick = scan.nextInt();
        scan.nextLine();
    }
}
