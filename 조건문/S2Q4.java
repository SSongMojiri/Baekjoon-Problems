import java.util.Scanner;

public class S2Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > 0) {
            if (B > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (B > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }

    }
}
