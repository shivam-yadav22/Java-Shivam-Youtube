import java.util.*;
public class I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("inter the  length of String ");
        int size=sc.nextInt();
        String array[] =new String[size];
        int result = 0;
        for(int i=0;i<size;i++){
            array[i]=sc.next();
            result += array[i].length();

        } 

        System.out.println(result);
    }
}
