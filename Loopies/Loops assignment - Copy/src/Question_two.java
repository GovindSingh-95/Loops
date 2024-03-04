import java.util.*;
public class Question_two {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        for(int i=n;i<=n*10;i+=n){
            System.out.print(i+" ");
        }
    }
}
