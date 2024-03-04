import java.util.*;
public class Question_one {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of numbers from 1 to "+n+" is "+sum);
    }
}
