package CQCJ;

public class Ex17 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; i++) {
                if (i > 4) {

                    break;
                }
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}