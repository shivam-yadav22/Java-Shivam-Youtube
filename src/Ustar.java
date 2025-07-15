public class Ustar {
    public static void main(String[] args) {
        int a=5;
        for (int i=1;i<=a;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print(" ");
            }
            for (int k=2*a;k>=2*i;k--) {
                if (k==2*a||a==i+4||k==2*i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
