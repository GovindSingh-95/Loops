import java.util.Scanner;
public class Question_sixteen {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==j||i+j==2*n) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
