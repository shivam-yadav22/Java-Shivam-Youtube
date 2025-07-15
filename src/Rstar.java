public class Rstar {
    public static void main(String[] args) {
        int a=5;
        for (int i=0;i<=a;i++){
            for (int j=0;j<=a-i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i=0;i<=a;i++) {
            for (int j = a; j >= a-i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
