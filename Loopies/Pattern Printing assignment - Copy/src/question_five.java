import java.util.Scanner;
public class question_five {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int term=n+2,limit;
        int termie=n/2+1;
        for(int i=1;i<=n+1;i++){
            if(i==1||i==n+1) limit=term;
            else limit =termie;
            for(int j=1;j<=limit;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
