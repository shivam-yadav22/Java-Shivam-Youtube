public class Pster {
    public static void main(String[] args) {

        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = a; i >=1; i--) {
            for (int j = 2; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}