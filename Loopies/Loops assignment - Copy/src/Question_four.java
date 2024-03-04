import java.util.*;
public class Question_four {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number till where you want to see the series: ");
        int n=Sc.nextInt();
        int a=0,b=1,sum=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=b;
            b=sum;
            sum=a+b;
        }
    }
}
