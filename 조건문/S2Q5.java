import java.util.Scanner;

public class S2Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < 45) {
            M = 15 + M;
            if (H == 0) {
                H = 23;
            } else {
                H -= 1;
            }
        } else {
            M -= 45;
        }

        System.out.println(H+" "+M);
    }
}
