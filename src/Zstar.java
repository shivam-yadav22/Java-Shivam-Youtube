public class Zstar {
    public static void main(String[] args) {
        int a=5;
        for (int i=1;i<=a;i++){
            for (int j=i;j<=a;j++){
                System.out.print(" ");
            }for (int k=1;k<=2*i-1;k++){
                if (k==1||k==2*i-1||i==a-2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
