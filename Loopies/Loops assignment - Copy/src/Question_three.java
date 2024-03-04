import java.util.*;
public class Question_three {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        System.out.print("Enter another number: ");
        int m=Sc.nextInt();
        int min=m;
        if(n<m)min=n;
        int check =0;
        for(int i= min;i>=1;i--){
            if(n%min==0 && m%min==0){
                System.out.println("The gcd of "+n+" and "+m+" is "+i);
                check=1;
                break;
            }
        }
        if(check==0) System.out.println("Gcd of "+n+" and "+m+" is 1");
    }
}
