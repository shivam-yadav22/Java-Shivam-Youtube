import java.util.*;
public class Q {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char ch = s.next().charAt(0);
        System.out.println(ch);

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        }
        else if(ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }

}
