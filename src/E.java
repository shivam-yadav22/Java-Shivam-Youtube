import java.util.*;
public class E {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("inter the string 1:");
        String name1=sc.next();
        System.out.println("inter the string 2");
        String name2=sc.next();
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal :");
        }else {
            System.out.println("String are not equal :");
        }
    }
}
