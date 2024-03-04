import java.util.Scanner;

public class Question_twelve {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int space=n-1,term=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            space--;
            for(int k=1;k<=term;k++){
                char ch=(char)(k+64);
                System.out.print(ch+" ");
            }
            term+=2;
            System.out.println();
        }
    }
}
