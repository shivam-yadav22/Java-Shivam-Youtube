public class Cstar {
    public static void main(String[] args) {
      int a=5;
      for(int i=0;i<=a;i++){
          for (int j=i;j<=a-1;j++){
              System.out.print(" ");
          }
          for (int j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
