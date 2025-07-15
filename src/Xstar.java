public class Xstar {
    public static void main(String[] args) {
        int a=7;
        for (int i=1;i<=a;i++){
            for(int j=i;j<=2*a;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=a;i>=1;i--){
            for(int j=i;j<=2*a;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
